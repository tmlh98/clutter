var http = require('http');

function service(request,response){
	response.writeHead(200,{'Content-Type':'text/plain'})
	response.end('hello nodejs');
}

var server = http.createServer(service);
server.listen(8888)
