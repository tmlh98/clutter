//1. 和之前 server.js 里的请求处理函数一模一样的 service 函数
function service(request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.end('Hello Node.js');
}
 

//2. 新建一个 sayHello 函数
function sayHello(){
	console.log('hello from say.js');
}
 

 
//3. 允许外部通过 hi() 这个函数名称调用 sayHello() 这个函数
exports.hi = sayHello;
 

//4. 允许外部通过 service() 同名调用
exports.service = service;