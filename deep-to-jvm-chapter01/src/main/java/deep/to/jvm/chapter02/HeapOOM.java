package deep.to.jvm.chapter02;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 堆的最小值、堆的最大值、让虚拟机在出现内存溢出异常的时候Dump出当前的内存堆转储快照以便进行事后分析
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}