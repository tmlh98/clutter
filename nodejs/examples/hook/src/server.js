var http = require('http');
var url = require('url');


function start(route, handle){
	http.createServer(function(request , response){
		var pathname = url.parse(request.url).pathname; 

		console.log(pathname);

	    route(handle, pathname,request , response);   

	}).listen(8888); 
}


exports.start=start;