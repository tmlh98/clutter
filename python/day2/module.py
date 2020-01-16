import fibo
# fibo.fib3(6)

# import 语句的一个变体直接从被导入的模块中导入命名到本模块的语义表中。例如:

# from fibo import fib, fib2
# 甚至有种方式可以导入模块中的所有定义:
# from fibo import *

# fib(500)

# 内置函数 dir() 用于按模块名搜索模块定义，它返回一个字符串类型的存储列表:
print(dir(fibo))