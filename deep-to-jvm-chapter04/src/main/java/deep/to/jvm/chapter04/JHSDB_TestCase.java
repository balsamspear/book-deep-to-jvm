package deep.to.jvm.chapter04;

/**
 * staticObj、instanceObj、localObj存放在哪里？
 * -Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 */
public class JHSDB_TestCase {

    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();

        void foo() {
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");    // 这里设一个断点
        }
    }
	private static class ObjectHolder {}

    public static void main(String[] args) {
        Test test = new JHSDB_TestCase.Test();
        test.foo();
    }
}