//闭包基础讲解
//1.闭包概念 2.闭包参数 3.闭包返回值

//参数->闭包体
def closer = { String name, int age -> return "hello groovy ${name} ${age}" }
//closer.call()
def name = 'groovy!'
def a = 4
//闭包中的返回值
def result = closer(name, a)
println(result)
//闭包的参数和返回值
closer.call("close",111)

int fab(int number) {
    int result = 1
    number.upto(1) {
        num -> result *= num
    }
    return result
}
/**
 * 字符串和闭包一起使用
 */
String str = 'the 2 and 3 is 5'
//each的遍历
str.each{
    //每个字符都会被我们执行2次
    String temp ->println temp.multiply(2)
}

def resultAny = str.any {
    String sss = str.isNumber()
}

println str.every {str.isNumber()}

def strClose = str.collect{
    it.toUpperCase()
}

strClose.get(0)

//任意的闭包都会有一个隐藏的参数
def clouser = {
    println "Hello Groovy Clouser ${it}"
}

clouser("zb666")

def clou = {String sss,int age->println "hello:${name},age:${age}"}
clou("sss",24)

task demo{
    println("demo task")
}


