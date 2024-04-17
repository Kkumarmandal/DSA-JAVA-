public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // Add First in doubly LinkedList
    public void addFirst (int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;            
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print in doubly LinkedList
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;            
        }
        System.out.println("null");
    }
    
    // Remove first
    public int removeFirst (){
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;            
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;            
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    // Add Last
    public void addLast (int data){
        Node newNode = new Node(data);
        size ++;
        if (head == null) {
            head = tail = null;            
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove Last

    public int removeLast (){
        if (head == null) {
            System.out.print("DLL is empty");
            return Integer.MIN_VALUE;                       
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size --;
            return val;        
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        // add first
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();
        System.out.println("Add First size " +dll.size);

        // Remove First
        dll.removeFirst();
        dll.print();
        System.out.println("Remove first size " + dll.size);

        // Add Last
        dll.addLast(4);
        dll.addLast(5);
        
        dll.print();
        System.out.println("Add Last " + dll.size);

        // Remove Last
        dll.removeLast();
        dll.print();
        System.out.println("Remove Last " + dll.size);

    }
    
}
