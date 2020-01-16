
# 水仙花数是指一个 n 位数（n≥3 ），它的每个位上的数字的 n 次幂之和等于它本身（
#例如：1**3 + 5**3 + 3**3 = 153）。
# 求1000以内所有的水仙花数
start = 100

while start < 1000:
	a = start // 100 #百位
	b = start // 10 % 10 # 十位
	c = start % 10
 
	n=3
	if a ** n + b ** n + c ** n == start :
	   print(start)
	start += 1   







# 获取用户输入的任意数，判断其是否是质数。质数是只能被1和它自身整除的数，1不是质数也不是合数。
num = int(input())
i = 2
while i < num:
	if num % i == 0:
		print(True)
	i = i + 1
else :
	print(False)


