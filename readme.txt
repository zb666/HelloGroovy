单引号定义的字符串
1. 字符串一个引号和三个引号
//能够实现换行的功能
'''line one line two line three'''
2 双引号定义的字符串
但是他叫做可扩展的字符串(在整个字符串中定义可以扩展的内容)
扩展之后的数据类型是 runtime.GStringImpl

//闭包的用法（用来进行一系列的骚操作)
//字符串和闭包结合
1 与基本数据类型的结合使用
2 与String 结合使用
3 与数据结构结合使用
4 与文件等结合使用

//闭包的几个关键字
//this 最外层的类
//当出现闭包嵌套的情况的时候
//owner指向的是最近的闭包中的对象
//当修改了闭包的delegate的时候 闭包就不一样了

//groovy委托
GroovyDelegate
将方法的实现进行委托

//DataStructureStudy 列表学习
groovy 列表轻易
主要讲述的是闭包结合当前的List集合 进 行一系列诸如
查找，查找集合等操作

DataStructureStudy
//数据结构  1.列表 2.映射 3.范围

GroovyRange 范围

----------------------------------
面向对象
Trait类型
类似空适配器的模式
比如动画 我们需要的是其中的一个方法，但是我们只需要关心我们需要的方法即可，
这样的话就只需要关心我们需要的方法即可.

Groovy元编程


Groovy运行时期的各种方法
在错误的时候就会尝试调用这些方法

invokeMethod() 方法，当我们找不到方法的时候就可以调用这个方法
methodMissing()->invokeMethod()

为类动态的添加一个属性
metaClass 运行时期添加一般的属性，方法或者是静态的方法或者属性
ADV: 扩展第三方库的方法，达到变相添加的功能,那么通过metaClass就可以动态的注入方法或者属性

//通过闭包添加静态方法
Person.metaClass.static.createPerson = {
    String name,int age ->new Person(name:name,age:age)
}

def ppp = Person.createPerson("xxx",222)
println ppp.name + ppp.age

!那么来源是哪里呢，是顶层的接口，GroovyObejct

我们通过setMetaClass或者setProperty方法进行方法或者属性的添加

public interface GroovyObject {
    Object invokeMethod(String var1, Object var2);

    Object getProperty(String var1);

    void setProperty(String var1, Object var2);

    MetaClass getMetaClass();

    void setMetaClass(MetaClass var1);
}


