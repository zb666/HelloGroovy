package object

//类和变量的定义
class Person implements IAction{
    String name
    Integer age
    def increaseAge(Integer years){
        this.name += years
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }

    def invokeMethod(String name,Object args){
        return "the name is ${name}"+"the age is ${args}"
    }

}
