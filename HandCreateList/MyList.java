package HandCreateList;

import java.util.Collection;
import java.util.List;

public interface MyList<T> {
    // 得到大小
    public int size();

    // 添加数据
    public void add(T data);

    // 打印集合
    public void print();

    //头插法
    public void addHead(T data);

    //倒转链表
    public void reverse();

    //通过索引获得数据
    public T getIndex(int index);

    //判断空
    public boolean isEmpty();

    //是否包含
    public boolean contains(Object o);

    //通过索引移除
    public T remove(int index);

    //通过指定数据移除
    public boolean  remove(Object o);

    //转为官方List
    public List<T> toList();

    //添加其他集合数据
    public boolean addAll(Collection<? extends T> c);

    //指定索引添加元素
    public boolean add(int index , T t);
    
    //清空
    public boolean clear();

    //批量增加到指定位置
    public boolean addAll(int index , Collection<? extends T> t);
    
    //转化为toString
    public String toString();

    //通过T查找索引
    public int indexOf(T t);

    //替换指定索引数据为t
    public T set(int index , T t);

    //查找最后索引
    public int lastIndexOf(T t);
}
