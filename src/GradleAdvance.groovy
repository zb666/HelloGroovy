/**
 闭包的三个重要变脸
 this owner delegate
 */
class Person {
    def nestClouser = {
        def scriptClouser = {
            println "this:" + this //代表的是闭包定义处的类
            println "owner:" + owner //代表的是闭包定义处的类或者对象
            println "delegate:" + delegate //任意对象
        }
    }
}

Person person = new Person()
println(person.nestClouser)

//委托