#创建一个变量保存你的名字，然后通过四种格式化字符串的方式
#   在命令行中显示，欢迎 xxx 光临！
name = '天莫'

r = '欢迎 %s 光临'%(name)
print(r)
r = f'欢迎 {name} 光临'
print(r)
 

print(1 + True)


a = 1
b =1 

c = a if a > b else b
print(c)

print(1111111111111111111111111111111111111111)
a = 1 or 2 and 3
a = 1 < 2 < 3
print(a)


# name = input('请输入你的名字:')
# print('name:' , name)






def f(  a ,   b):
	return a * b /2


print(f(1 ,2))	