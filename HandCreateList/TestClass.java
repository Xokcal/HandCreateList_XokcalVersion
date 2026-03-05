package HandCreateList;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class TestClass {
    public static void main(String[] args) {
        // XokcalList<String> list = new XokcalList<>();
        MyList<String> list = new XokcalList<>();
        System.out.println("Hello World!");
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        // list.addHead("hello5");
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
        boolean empty = list.isEmpty();
        System.out.println("============");
        System.out.println(empty);
        System.out.println("============");
        String index = list.getIndex(1);
        System.out.println(index);
        System.out.println("============");
        boolean contains = list.contains(null);
        System.out.println(contains);
        System.out.println("============");
        String remove = list.remove(1);
        list.print();
        System.out.println(remove);
        int size2 = list.size();
        System.out.println(size2);
        System.out.println("============");
        boolean remove2 = list.remove("hello1");
        list.print();
        System.out.println(remove2);
        System.out.println(list.size());
        System.out.println("============");
        List<String> list2 = list.toList();
        for(String s : list2){
            System.out.println(s);
        }
        System.out.println("============");
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        boolean all = list.addAll(l);
        list.print();
        System.out.println(all);
        System.out.println("============");
        boolean b = list.add(2, "C");
        System.out.println(b);
        list.print();
        System.out.println("============");
        // boolean clear = list.clear();
        // System.out.println(clear);
        // list.print();
        System.out.println("============");
        List<String> laoda = new ArrayList<>();
        laoda.add("a");
        laoda.add("b");
        laoda.add("c");
        boolean c = list.addAll(2, laoda);
        list.print();
        int size3 = list.size();
        System.out.println(size3);
        System.out.println(c);
        System.out.println("============");
        String string = list.toString();
        System.out.println(string);
        System.out.println("============");
        int index2 = list.indexOf("b");
        System.out.println(index2);
        System.out.println("============");
        String set = list.set(2, "可爱");
        System.out.println(set);
        String string2 = list.toString();
        System.out.println(string2);
        System.out.println("============");
        // list.lastIndexOf()
        list.add("c");
        String string3 = list.toString();
        System.out.println(string3);
        int lastIndexOf = list.lastIndexOf("c");
        System.out.println(lastIndexOf);
        list.print();
    }
}
