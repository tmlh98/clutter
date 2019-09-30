var server = require("./bin/server");  
var router = require("./bin/router");  
var requestHandlers = require("./bin/requestHandlers");  

var handle = {}  
handle["/hook/gitee/code"] = requestHandlers.giteeHook;  
handle["/hook/aliyun/docker"] = requestHandlers.triggerDocker;  
  
server.start(router.route, handle);  