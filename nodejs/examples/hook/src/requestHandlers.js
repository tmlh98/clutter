var config = require('../config');

const error_msg = 'Incorrect user name or password.';

function giteeHook(req , res) { 

	var password = config.giteeHook.password;

    let userAgent = req.headers['user-agent'];
    let token = req.headers['x-gitee-token'];

    if (userAgent == 'git-oschina-hook' && token == password) {
	    res.end("receiver seccess !");                        
        console.log('start gh');

        var body = '';
        req.on('data', function (chunk) {
            body += chunk;
        });

        req.on('end', function () {
            var j = JSON.parse(body);
            // console.log(j);

            let rep = j.repository.path;
            let tag = j.ref.substring(10);

            if(tag.lastIndexOf('test') == -1 || tag.lastIndexOf('released') != -1 ){
            	
            	res.end('请按照正确的格式打TAG!');
            	return;
            }


            var shel = config.giteeHook.shell;
            if (shel != null && shel != '') {
                let shell = shel + ' ' +  tag;
                console.log(shell);
                process.exec(shell, function (error, stdout, stderr) {
					if (error !== null) {
	                	console.log('hook error: ' + error);
		            } else {
		                console.log('shell process complete !')
		            }
		        });

            } else {
                res.end('missing shell configuration ');
            }
        });
        console.log('end gh');
    } else {
    	console.log(error_msg);
    	res.end(error_msg);
    }
	 
}  
  
function triggerDocker(req , res) {  
	var arg = url.parse(req.url, true).query;
    let triggerUrl = arg.triggerUrl;
    let secret = arg.secret;
    var password = config.trigger.password;

    if (triggerUrl == 'vnel-aliyun-hook' && secret == password) {
        res.end("receiver seccess !");    
        console.log('start gh');

        var body = '';
        req.on('data', function (chunk) {
            body += chunk;
        });


        req.on('end', function () {
            var j = JSON.parse(body);
            // -------------------------------------------------------------------------------------------------
            let namespace = j.repository.namespace;
            let name = j.repository.name;
            let images_name = namespace + "/" + name;

            let pushed_at = j.push_data.pushed_at;
            let tag = j.push_data.tag;

            console.log(pushed_at + "  , " + images_name);

            var shel = config.trigger.shell;
            if (shel != null && shel != '') {
                let shell = shel + " " + tag;
                console.log(shell);
                process.exec(shell, function (error, stdout, stderr) {
                   if (error !== null) {
                        console.log('hook error: ' + error);
                    } else {
                        console.log('shell process complete !')
                    }
                });
            } else {
                res.end('missing shell configuration ');
            }
        });
        console.log('end gh');
    } else {
        console.log(error_msg);
        res.end(error_msg);
    }

	 
}  


exports.giteeHook = giteeHook;  
exports.triggerDocker = triggerDocker;  