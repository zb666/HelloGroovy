package object

class ApplicationManager {
    static void init(){
        ExpandoMetaClass.enableGlobally()
        Person.metaClass.static.createPerson = {String name,int age->new Person(name: name,age: age)}
    }
}
