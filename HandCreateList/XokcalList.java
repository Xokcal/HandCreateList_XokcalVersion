package HandCreateList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("all")
class XokcalList<T> implements MyList<T>{
    private ListLinkTable<T> head;
    private int size = 0;

    private static final String INDEX_INVALID = "索引不合法";
    private static final String INDEX_OUT_BOUND_ERROR = "索引超出范围！";
    private static final String INDEX_OUT_OF_BOUNDS_EXCEPTION = "索引超出范围！";

    // 得到大小
    public int size() {
        return this.size;
    }

    // 添加数据
    @Override
    public void add(T data) {
        ListLinkTable<T> node = new ListLinkTable<>(data, null);
        ListLinkTable<T> h = head;
        if (head == null) {
            head = node;
        } else {
            while (h.getNext() != null) {
                h = h.getNext();
            }
            h.setNext(node);
        }
        size++;
    }

    // 打印集合
    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("[]");
            return;
        }
        ListLinkTable<T> h = head;
        while (h.getNext() != null) {
            System.out.print(h.getData() + "->");
            h = h.getNext();
        }
        System.out.println(h.getData()+"->null");
    }

    //头插法
    @Override
    public void addHead(T data){
        ListLinkTable<T> newNode = new ListLinkTable<>(data , head);
        head = newNode;
        size++;
    }

    //倒转链表
    @Override
    public void reverse(){
        ListLinkTable<T> tail = null;
        ListLinkTable<T> h = head;
        while (h != null) {
            ListLinkTable<T> next = h.getNext();
            h.setNext(tail);
            tail = h;
            h = next;
        }
        head = tail;
    }

    //通过索引获得数据
    @Override
    public T getIndex(int index){
        if (index < 0 ||index >= size) {
            System.out.println(INDEX_INVALID);
            throw new IndexOutOfBoundsException(INDEX_OUT_BOUND_ERROR);
        }
        int i = 0;
        ListLinkTable<T> h = head;
        while (h != null) {
            if (i == index) {
                return h.getData();
            }
            h = h.getNext();
            i++;
        }
        return null;
    }
// 添加了isEmpty，contains，remove，toList，addAll等方法
    //判断空
    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    //是否包含
    public boolean contains(Object o){
        if(o == null){
            return false;
        }
        ListLinkTable<T> h = head;
        while (h != null) { 
            if(o.equals(h.getData())){
                return true;
            }
            h = h.getNext();
        }
        return false;
    }

    //通过索引移除
    @Override
    public T remove(int index){ //2
        if (index < 0 ||index >= size) {
            System.out.println(INDEX_INVALID);
            throw new IndexOutOfBoundsException(INDEX_OUT_BOUND_ERROR);
        }
        int i = 0;
        ListLinkTable<T> h = head;
        ListLinkTable<T> up = null;
        T t = null;
        while(h != null){
            if(i == index){
                if(i == 0){
                    head = h.getNext();
                    size--;
                    return h.getData();
                }
                t = up.getNext().getData();
                up.setNext(up.getNext().getNext());
                size--;
                return t;
            }
            up = h;
            h = h.getNext();
            i++;
        }
        return null;
    }

    //通过指定数据移除
    @Override
    public boolean  remove(Object o){
        if(o == null){
            return false;
        }
        int i = 0;
        ListLinkTable<T> h = head;
        ListLinkTable<T> up = null;
        while(h != null){
            if(o.equals(h.getData())){
                if(i == 0){
                    head = head.getNext();
                    size--;
                    return true;
                }
                up.setNext(h.getNext());
                size--;
                return true;
            }
            up = h;
            h = h.getNext();
            i++;
        }
        return false;
    }

    //转为官方List
    @Override
    public List<T> toList(){
        if(isEmpty()){
            return new ArrayList<>();
        }
        List<T> list = new ArrayList<>();
        ListLinkTable<T> h = head;
        while(h != null){
            list.add(h.getData());
            h = h.getNext();
        }
        return list;
    }

    //添加其他集合数据
    @Override
    public boolean addAll(Collection<? extends T> c){
        if(c.isEmpty() || isEmpty()){
            return false;
        }
        ListLinkTable<T> h = head;
        while(h.getNext() != null){
            h = h.getNext();
        }
        for(T t : c){
            System.out.println(t);
            ListLinkTable n = new ListLinkTable<>(t , null);
            h.setNext(n);
            h = h.getNext();
            size++;
        }
        return true;
    }

    //指定索引添加元素
    @Override
    public boolean add(int index , T t){
        if(index < 0 || index >= size || t == null)return false;
        ListLinkTable<T> h = head;
        ListLinkTable<T> n = new ListLinkTable<>(t , null);
        ListLinkTable<T> up = null;
        int i = 0;
        while(h != null){
            if(i == index){
                if(i == 0){
                    n.setNext(h);
                    head = n;
                    size++;
                    return true;
                }
                up.setNext(n);
                n.setNext(h);
                size++;
                return true;
            }
            up = h;
            h = h.getNext();
            i++;
        }
        return false;
    }

    //清空
    @Override
    public boolean clear(){
        if(size == 0)return true;
        head = null;
        size = 0;
        return true;
    }

    @Override
    public boolean addAll(int index , Collection<? extends T> t){
        if(index <= 0 || index >= size || t == null)return false;
        ListLinkTable<T> h = head;
        ListLinkTable<T> up = null;
        int i = 0;
        while(h != null){
            if(i == index){
                for (T e : t) {
                    ListLinkTable<T> e_n = new ListLinkTable<>(e , null);
                    up.setNext(e_n);
                    up = up.getNext();
                    size++;
                }
                up.setNext(h);
                return true;
            }
            up = h;
            h = h.getNext();
            i++;
        }
        return false;
    }

    @Override
    public String toString(){
        if(isEmpty())return "[]";
        ListLinkTable<T> h = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(h != null){
            if(h.getNext() == null){
                sb.append(h.getData()+"]");
                return sb.toString();
            }
            sb.append(h.getData()+",");
            h = h.getNext();    
        }
        return sb.toString();
    }

    //通过T查找索引
    public int indexOf(T t){
        if(t == null)return -1;
        ListLinkTable<T> h = head;
        int i = 0;
        while(h != null){
            if(t.equals(h.getData()))return i;
            h = h.getNext();
            i++;
        }
        return -1;
    }

    //替换指定索引数据为t
     @Override
    public T set(int index , T t){
        if(index < 0 || index >= size || t == null)return null;
        ListLinkTable<T> h = head;
        T r = null;
        int i = 0;
        while(h != null){
            if(i == index){
                r = h.getData();
                h.setData(t);
                return r;
            }
            h = h.getNext();
            i++;
        }
        return null;
    }

    //查找最后索引
    @Override
    public int lastIndexOf(T t){
        if(t == null)return -1;
        reverse();
        ListLinkTable<T> h = head;
        int i = size - 1;
        while(h != null){
            if(t.equals(h.getData())){
                reverse();
                return i;
            }
            h = h.getNext();
            i--;
        }
        reverse();
        return -1;
    }

    //根据索引截取
    @Override
    public XokcalList<T> subList(int fromIndex, int toIndex){
        if(fromIndex < 0 || toIndex > size || fromIndex > toIndex)
        throw new IndexOutOfBoundsException(INDEX_OUT_OF_BOUNDS_EXCEPTION);
        ListLinkTable<T> h = head;
        XokcalList<T> x = new XokcalList<>();
        int i = 0;
        while(h != null){
            if(i >= fromIndex && i < toIndex){
                x.add(h.getData());
            }
            if(i == toIndex){
                return x;
            }
            h = h.getNext();
            i++;
        }
        return x;
    }

    //转化为数组
    @Override
    public Object[] toArray(){
        if(isEmpty())return new  Object[size];
        ListLinkTable<T> h = head;
        Object[] o = new Object[size];
        int i = 0;
        while(h != null){
            o[i] = h.getData();
            h = h.getNext();
            i++;
        }
        return  o;
    }

    //排序
    @Override
    public void sort(){
        Object[] arr = toArray();
        sort(arr , 0 , arr.length - 1);
        replaceWithArray(arr);
    }

    //链表清空链接所有数组数据
    @Override
    public void replaceWithArray(Object[] arr){
        clear();
        if(arr.length == 0)return;
        head = new ListLinkTable<>((T)arr[0] , null);
        size++;
        ListLinkTable<T> h = head;
        int i = 1;
        while(i < arr.length){
            h.setNext(new ListLinkTable<>((T)arr[i] , null));
            h = h.getNext();
            i++;
            size++;
        }
    }

    private void sort(Object[] arr , int left , int right){
        if(left >= right)return;
        int l = left;
        int r = right;
        int mid = l + ((r - l) / 2);
        Comparable<Object> pivot = (Comparable<Object>)arr[mid];
        while(l <= r){
            while(l <= r && pivot.compareTo(arr[l]) > 0)l++;
            while(l <= r && pivot.compareTo(arr[r]) < 0)r--;
            if(l <= r){
                Object t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
        }

        sort(arr , left , r);
        sort(arr , l , right);
    }

}
