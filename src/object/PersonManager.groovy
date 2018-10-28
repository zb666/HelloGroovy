package object

class PersonManager {

    static void main(def args) {
        ApplicationManager.init()
        println '程序正在启动'

        def person = Person.createPerson('zzz', 10)
        println person.name + person.age
    }

}
