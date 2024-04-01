public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add First in LL
    public void addFirst (int data){
        // Step 1 -> Create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail= newnode;
            return;        
        }

        // Step 2 -> newNode next = head
        newnode.next = head;

        // Step 3 -> head = newNode
        head = newnode;
    }

    // Add Last in LL
    public void addLast (int data){
        // Step 1 -> Create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail= newnode;
            return;        
        }

        // Step 2 -> newNode next = tail
        tail.next = newnode;

        // Step 3 -> head = newNode
        tail = newnode;
    }

    public void print (){
        // base case
        if (head == null) {
            System.out.println("Linked is empty");
            return;            
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;            
        }
        System.out.println("null");
    }


    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.print();

        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();

        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4); 
        ll.print();      
    }
}
