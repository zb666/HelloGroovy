//你是真的骚啊
println("hello groovy 你是真的骚啊")
int x = 10
double y = 3.14
def x1 = 11
def y1 = 22
//弱类型 外界传值将会不确定  所以推荐只有自己使用的时候才这样进行定义
def name = 'one'
def thupleName = '''
line one 
line two 
line three'''
def doubleName = "doubleName"
println thupleName
println doubleName.class
def sayHello = "Hello:${doubleName}"
println sayHello.class

def sum = "The sum of 2 and 3 equals ${2 + 3}"
println(doubleName)
def result = echo(sum)
println(result)
String echo(String message) {
    return message
}

//-------------------------------------逻辑控制--------------------------------//
def sumResult = 0
for (i in 0..9){
    sumResult+=i
}
//对list的循环
for (i in [1,2,3,4,5]){
    sumResult+i
}
//map循环
for (j in ['lili':1,"luck":2]){
    sumResult+=j.value
}


