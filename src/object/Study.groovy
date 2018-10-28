package object
def person = new Person(name: 'android',age: 26)
println "name is ${person.name}, "+"the age is ${person.age}"

//运行时期添加属性
person.metaClass.sex = "male"
println person.sex
person.increaseAge(10)
//为类动态的添加方法
Person.metaClass.sexUpperCase = {->sex.toUpperCase}
person.sexUpperCase()

//通过闭包添加静态方法
Person.metaClass.static.createPerson = {
    String name,int age ->new Person(name:name,age:age)
}

def ppp = Person.createPerson("xxx",222)
println ppp.name + ppp.age

