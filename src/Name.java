import bean.Student;
import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;

import java.util.LinkedList;
import java.util.List;

public class Name {
    public static void main(String[] args) {

        //Student中属性只有id 我们认为id相等的student应该是同一个学生
        //所以我们的equals方法是这样定义的   id.equals(Student)obj.id);
        Student studentA = new Student("1");
        Student studentB = new Student("1");
        //但是我看到了 a 和 b 是不同的对象，如果我们没有重写hashcode,他们的hashcode就是不一样的
        //equals相同的情况下，hashcode必须相同，如果我们不重写的话hashcode就不同了
        //明明同一个人，但是不重写hashcode就成为不同的两个人了，所以就出问题了

        //没有遵循这样的原则的前提下，和我们HashSer,Map,Table的时候容易出问题。

        System.out.print(studentB.hashCode() + " " + studentA.hashCode());

        LinkedList[] linkedLists = new LinkedList[9];

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("");

        testSwap();

    }

    private static void testSwap() {
        int a = 15;
        int b = 9;
        a = a ^ b;
        System.out.print("异或运算：相同取0，不同取1，异或结果为："+a);
        b = a ^ b;
        a = a ^ b;
        System.out.print("   a：" + a + "b：" + b);
    }


}
