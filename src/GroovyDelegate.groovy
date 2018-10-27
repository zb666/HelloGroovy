//Groovy委托
class Student{
    String name
    def pretty = {"My name is ${name}"}

    String toString(){
        //这里是调用这个方法的意思
        pretty.call()
    }
}
class Teacher{
    String name
}

def stu  = new Student(name: "Bob")
def tea  = new Teacher(name: "Janet")
//将输出的内容委托给Teacher类进行输出
stu.pretty.delegate = tea
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()