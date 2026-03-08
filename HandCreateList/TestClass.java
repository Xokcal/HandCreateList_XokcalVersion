package HandCreateList;

import HandCreateList.XokcalList.XokcalIterator;

@SuppressWarnings("all")
public class TestClass {
    // private static final MyList<String> list = new XokcalList<>();
    // public static void main(String[] args) {
    //     // XokcalList<String> list = new XokcalList<>();
    //     MyList<String> list = new XokcalList<>();
    //     System.out.println("Hello World!");
    //     list.add("hello1");
    //     list.add("hello2");
    //     list.add("hello3");
    //     list.add("hello4");
    //     // list.addHead("hello5");
    //     System.out.println("============");
    //     int size = list.size();
    //     System.out.println("大小为："+size);
    //     list.print();
    //     list.reverse();
    //     list.print();
    //     list.reverse();
    //     list.print();
    //     System.out.println("============");
    //     list.getIndex(2);
    //     boolean empty = list.isEmpty();
    //     System.out.println("============");
    //     System.out.println(empty);
    //     System.out.println("============");
    //     String index = list.getIndex(1);
    //     System.out.println(index);
    //     System.out.println("============");
    //     boolean contains = list.contains(null);
    //     System.out.println(contains);
    //     System.out.println("============");
    //     String remove = list.remove(1);
    //     list.print();
    //     System.out.println(remove);
    //     int size2 = list.size();
    //     System.out.println(size2);
    //     System.out.println("============");
    //     boolean remove2 = list.remove("hello1");
    //     list.print();
    //     System.out.println(remove2);
    //     System.out.println(list.size());
    //     System.out.println("============");
    //     List<String> list2 = list.toList();
    //     for(String s : list2){
    //         System.out.println(s);
    //     }
    //     System.out.println("============");
    //     List<String> l = new ArrayList<>();
    //     l.add("A");
    //     l.add("B");
    //     boolean all = list.addAll(l);
    //     list.print();
    //     System.out.println(all);
    //     System.out.println("============");
    //     boolean b = list.add(2, "C");
    //     System.out.println(b);
    //     list.print();
    //     System.out.println("============");
    //     // boolean clear = list.clear();
    //     // System.out.println(clear);
    //     // list.print();
    //     System.out.println("============");
    //     List<String> laoda = new ArrayList<>();
    //     laoda.add("a");
    //     laoda.add("b");
    //     laoda.add("c");
    //     boolean c = list.addAll(2, laoda);
    //     list.print();
    //     int size3 = list.size();
    //     System.out.println(size3);
    //     System.out.println(c);
    //     System.out.println("============");
    //     String string = list.toString();
    //     System.out.println(string);
    //     System.out.println("============");
    //     int index2 = list.indexOf("b");
    //     System.out.println(index2);
    //     System.out.println("============");
    //     // String set = list.set(2, "可爱");
    //     // System.out.println(set);
    //     String string2 = list.toString();
    //     System.out.println(string2);
    //     System.out.println("============");
    //     // list.lastIndexOf()
    //     list.add("c");
    //     String string3 = list.toString();
    //     System.out.println(string3);
    //     int lastIndexOf = list.lastIndexOf("c");
    //     System.out.println(lastIndexOf);
    //     list.print();
    //     System.out.println("============");
    //     list.print();
    //     XokcalList<String> subList = list.subList(1, 3);
    //     subList.print();
    // }

    // public static void main(String[] args) {
    //     MyList<String> list = new XokcalList<>();
    //     System.out.println("Hello World!");
    //     list.add("hello2");
    //     list.add("hello4");
    //     list.add("hello3");
    //     list.add("hello1");
    //     list.print();
    //     System.out.println("============");
    //     list.sort();
    //     list.print();
    //     System.out.println("============");
    //     XokcalList<String> subList1 = list.subList(0, 2);
    //     subList1.print();
    //     System.out.println("============");
    //     Object[] array = list.toArray();
    //     System.out.println("数组："+Arrays.toString(array));
    //     System.out.println("============");
    //     System.out.println("s".compareTo("c"));
    //     System.out.println("============");
    //     list.print();
    //     list.sort();
    //     list.print();
    //     int size = list.size();
    //     System.out.println(size);
    //     System.out.println("============");
    //     Object[] o = new Object[]{3,4,1,6,3};
    //     list.replaceWithArray(o);
    //     list.print();
    //     System.out.println("============");
    //     list.sort();
    //     list.print();
    //     System.out.println("============");
    //     list.set(2, "哈基米");
    //     list.print();
    //     System.out.println("============");
    //     list.sort();
    //     String string = list.toString();
    //     System.out.println(string);
    //     // System.out.println("============");
    //     // XokcalIterator iterator = list.iterator();
    //     // while(iterator.hasNext()){
    //     //     System.out.println(iterator.next());
    //     // }
    // }

    public static void main(String[] args) {
        MyList<Integer> list = new XokcalList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.print(); 
        System.out.println("==============");
        XokcalIterator iterator = list.iterator();
        Integer sum = null;
        while(iterator.hasNext()){
            System.out.println(iterator.next() + iterator.next());
        }
        System.out.println(iterator.next());
    }


}
