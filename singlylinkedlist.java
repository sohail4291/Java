public class singlylinkedlist {

    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }
    private  Node head;
    public void insertBegin(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.print(" Null");
    }
    public void insertEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;

    }
    public void insertAtPos(int pos,int data){
        if(pos < 1 ){
            System.out.println("enter a valid number");
            return;
        }
        if(pos == 1){
            insertBegin(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out of range");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void deleteBegin(){
        if(head == null){
            return;
        }
        head = head.next;

    }
    public void deleteEnd(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

    }
    public void deleteAtPos(int pos){
        if(head == null){
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out or range");
            return;
        }
        temp.next = temp.next.next;
    }
    // 10 -> 20 -> 30 -> Null;
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next ;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }
    public Node reverse1(Node head){
        Node head1 = head;
        Node temp2 = null;
        while(head1 != null){
            Node temp = head.next;
            head.next = temp2;
            temp = head;
            head = temp2;

            head1 = head1.next;
        }
        return head;
    }
    public static void main(String[] args){
        singlylinkedlist linkedlist = new singlylinkedlist();
        linkedlist.insertBegin(20);
        linkedlist.insertBegin(15);
        linkedlist.insertBegin(10);
        linkedlist.insertEnd(25);
        // linkedlist.insertAtPos(4,30);
        // linkedlist.insertAtPos(2,5);
        // linkedlist.display();
        // System.out.println("");
        // linkedlist.deleteBegin();
        // linkedlist.deleteEnd();
        // linkedlist.display();
        // System.out.println("");
        // linkedlist.deleteAtPos(2);
        // linkedlist.display();
         linkedlist.reverse1(Node head);
        linkedlist.display();

    }
}
