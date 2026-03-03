package HandCreateList;

@SuppressWarnings("all")
public class TestClass {
    public static void main(String[] args) {
        XokcalList<String> list = new XokcalList<>();
        System.out.println("Hello World!");
        list.add("hello");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        list.addHead("hello-1");
        System.out.println("============");
        int size = list.size();
        System.out.println("大小为："+size);
        list.print();
        list.reverse();
        list.print();
        list.reverse();
        list.print();
        System.out.println("============");
        list.getIndex(2);
    }
}
