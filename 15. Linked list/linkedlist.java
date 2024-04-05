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
    public static int size;  //-> size 

    // Add First in LL
    public void addFirst (int data){
        // Step 1 -> Create new node
        Node newnode = new Node(data);
        size++; //-> size
        if (head == null) {     // linkedList empty
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
        size++; //-> size
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

    // Add in the middle of LL
    public void add(int idx, int data){

        if (idx == 0) {
            addFirst(data);
            return;            
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;            
        }
        // i = idx-1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove first LinkedList
    public int removefirst (){
        // Condition
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;            
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;            
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove Last
    public int removeLast (){

        if (size == 0) {
            System.out.println("LL is empty"); 
            return Integer.MIN_VALUE;           
        } else if (size == 1) {
            int val = head.data;
            head = tail =null;
            size = 0;
            return val;           
        }

        // Prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail= prev;
        size--;
        return val;
    }

    // Iterative Search
    public int itrSearch (int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {     //Key found
                return i;                
            }            
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Resursive Search
    public int helper (Node head, int key){
        if (head == null) {
            return -1;            
        }
        if (head.data == key) {
            return 0;            
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch (int key){
        return helper(head, key);

    }

    // Reverse a LinkedList
    public void reverse (){
        // 3 variable
        Node prev = null;
        Node curr = tail = head;
        Node next;

        // 4 Step
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        }
        head = prev;
    }

    // Remove Nth node fron end
    public void deleteNthFromEnd (int n){
        // Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;            
        }

        if (n == sz) {
            head = head.next; // remove first
            return;            
        }

        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;            
        }
        prev.next = prev.next.next;
        return;

    }

    // Slow and Fast Approach
    public Node findMid (Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+
            fast= fast.next.next; //+                        
        }
        return slow; // slow is my midNode
    }
    // Check if LL is Pallindrome
    public boolean checkPalindrome (){
        // base Case
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 Find Mid
        Node midNode = findMid(head); // Slow Fast approach

        // Step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        }
        Node right = prev; // right hand head
        Node left = head;

        // step 3 check left hand & right hand 
        while (right != null) {
            if (left.data != right.data) {
                return false;                
            }
            left = left.next;
            right = right.next;
                        
        }
        return true;

    }

    
    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        //ll.print();

         //ll.addFirst(2);
        //ll.print();
         //ll.addFirst(1);
        //ll.print();

         //ll.addLast(4);
        //ll.print();
         //ll.addLast(5); 
        //ll.print();  

        // Add int the middle of LinkedList
         //ll.add(2, 3);
         //ll.print();    //1->2->3->4->5->null
        //System.out.println( "Size = " + ll.size);    // -> 5    

        // Remove first in a linkedList
        /*ll.removefirst();   // 2->3->4->5->null
        ll.print(); 
        System.out.println(ll.size); // -> 4*/

        // Remove Last in a LinkedList
        /*ll.removeLast();    //2->3->4->null
        ll.print();
        System.out.println(ll.size);    // -> 3*/

        //System.out.println("Index Key " +ll.itrSearch(3));
        //System.out.println("Index Key " +ll.itrSearch(10));

        //System.out.println(ll.recSearch(3));
        //System.out.println(ll.recSearch(10));

        // Reverse a LinkedList
        /*ll.reverse();
        ll.print();*/

        //Remove Nth node fron end        
        /*ll.deleteNthFromEnd(3); //1->2->4->5->null
        ll.print();    //1->2->4->5->null*/

        // Check if LL is Palindrome
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println("LL is Palindrome = " + ll.checkPalindrome());


    }
}
