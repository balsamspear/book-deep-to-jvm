package deep.to.jvm.chapter07;

import org.junit.Test;

public class chapter07Test {

    @Test
    public void testFieldFrom() {
        // String name = new FieldSubClass().name;
        // 一个同名字段同时出现在某个类的接口和父类当中，
        // 或者同时在自己或父类的多个接口中出现，按照解析规则仍是可以确定唯一的访问字段，但Javac编译
        // 器就可能直接拒绝其编译为Class文件。如果子类中有定义了 name 字段，则直接使用子类的，不会报错
        // 《深入理解java虚拟机》中的例子错了，并没有报错（区分不同的虚拟机？）
    }

    @Test
    public void testInitialization() {
        System.out.println(SubClass.value);
    }
}
