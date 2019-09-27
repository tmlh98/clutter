//1. 通过 ./how2j 来加载这个模块。 记得，比如加上 ./ ,否则会到 node安装目录下去寻找 ，是找不到滴。。。
var how2j = require('./say');
var http = require('http');

//2. 调用 hi() 函数，间接地就调用了how2j.js 里的 sayHello()函数,因此可以看到如图所示的打印信息
how2j.hi();
 


//3. 基于how2j.service() 函数创建服务 
var server = http.createServer(how2j.service);

server.listen(8888);
