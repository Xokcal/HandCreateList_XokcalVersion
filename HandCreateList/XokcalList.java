package HandCreateList;

@SuppressWarnings("all")
public class XokcalList<T> {
    private ListLinkTable<T> head;
    private int size = 0;

    private static final String INDEX_INVALID = "索引不合法";

    // 得到大小
    public int size() {
        return this.size;
    }

    // 添加数据
    public void add(T data) {
        ListLinkTable node = new ListLinkTable<>(data, null);
        ListLinkTable h = head;
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
    public void print() {
        ListLinkTable h = head;
        while (h.getNext() != null) {
            System.out.print(h.getData() + "->");
            h = h.getNext();
        }
        System.out.println(h.getData()+"->null");
    }

    //头插法
    public void addHead(T data){
        ListLinkTable newNode = new ListLinkTable<>(data , head);
        head = newNode;
        size++;
    }

    //倒转链表
    public void reverse(){
        ListLinkTable tail = null;
        ListLinkTable h = head;
        while (h != null) {
            ListLinkTable next = h.getNext();
            h.setNext(tail);
            tail = h;
            h = next;
        }
        head = tail;
    }

    //通过索引获得数据
    public void getIndex(int index){
        if (index < 0 ||index > size) {
            System.out.println(INDEX_INVALID);
            return;
        }
        int i = 1;
        ListLinkTable h = head;
        while (h != null) {
            if (i == index) {
                System.out.println(h.getData());
            }
            h = h.getNext();
            i++;
        }
        return;
    }
}
