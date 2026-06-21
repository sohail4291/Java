// // public class doublylinkedlist {
// //     class Node{
// //         private int data;
// //         private Node next;
// //         private Node prev;
// //         Node(int data){
// //             this.data = data;
// //         }
// //     }
// //     private Node head;
// //     private Node tail;
// //     public void insertBegin(int data){
// //         Node newnode = new Node(data);
// //         if(head == null){
// //             head = tail = newnode;
// //             return;
// //         }
// //         newnode.next = head;
// //         head.prev = newnode;
// //         head = newnode;
// //     }

// //     public void insertEnd(int data){
// //         Node newnode = new Node(data);
// //         if(head == null){
// //             head = tail = newnode;
// //         }
// //         tail.next = newnode;
// //         newnode.prev = tail;
// //         tail = newnode;
// //     }

// //     public void insertAtPos(int pos, int data){
// //         Node newnode = new Node(data);
// //         Node temp = head;
// //         for(int i=1;i<pos-1 && temp != null; i++ ){
// //             temp = temp.next;
// //         }  
// //         if(temp == null || temp.next == null){
// //             insertEnd(data);
// //             return;
// //         }
// //         newnode.next = temp.next;
// //         newnode.prev = temp;
// //         temp.next.prev = newnode;
// //         temp.next = newnode;

// //     }

// //     public void deleteBegin(){
// //         if(head == null ){
// //             return;
// //         }
// //         head = head.next;
// //         head.prev = null;
// //     }

// //     public void deleteEnd(){
// //         if(head == null){
// //             return;
// //         }
// //         tail = tail.prev;
// //         tail.next = null;
// //     }
// //     public void deleteAtPos(int data){
// //         Node temp = head;
// //         while(temp != null && temp.data != data){
// //             temp = temp.next;
// //         }
// //         if(temp == null){
// //             return;

// //         }
// //         if(temp == head){
// //             deleteBegin();
// //         }
// //         if(temp == tail){
// //             deleteEnd();
// //         }
// //         temp.prev.next = temp.next;
// //         temp.next.prev = temp.prev;

// //     }
// //     public void display(){
// //         Node temp = head;
// //         while(temp != null){
// //             System.out.print(temp.data + " -> ");
// //             temp = temp.next;
// //         }
// //         System.out.println("Null");
// //     }

// //     public void reverse(){
// //         Node temp = tail;
// //         while(temp != null){
// //             System.out.print("-> "+ temp.data);
// //             temp = temp.prev;
// //         }
// //         System.out.print("Null");
// //     }
// //     public static void main(String[] args){
// //         doublylinkedlist dll = new doublylinkedlist();
// //         dll.insertBegin(30);
// //         dll.insertBegin(20);
// //         dll.insertBegin(10);
// //         dll.display();
// //         dll.insertEnd(40);
// //         dll.insertEnd(50);
// //         dll.display();
// //         dll.deleteAtPos(30);
// //         dll.display();
// //         //dll.reverse();
// //      }
// // }


// //=======================================================================================

// class Node{
//     int data;
//     Node prev;
//     Node next;

//     Node(int data, Node prev, Node next){
//         this.data = data;
//         this.prev = prev;
//         this.next = next;
//     }

//     Node(int data){
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }
// }

// public class doublyLinked{
//     public static Node insertAtBegin(Node head, int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//         }
//         newNode.prev = null;
//         newNode.next = head;
//         head = newNode;
//         return head;
//     }

//     public static Node insertAtEnd(Node head, int data){
//         Node temp = head;
//         Node newNode  =new Node(data);
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         newNode.next = null;
//         newNode.prev = temp;
//         return head;
//     }

//     public static Node insertAtPos(Node head, int data,int pos){
//         Node newNode = new Node(data);
//         Node temp = head;
//         for(int i=0;i<pos-1;i++){
//             temp = temp.next;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//         newNode.prev = temp;
//         return head;
//     }

//     public static Node deleteFirst(Node head){
//         Node temp = head;
//         if(head == null || head.next == null){
//             return null;
//         }
//         head = head.next;
//         head.prev = null;
//         return head;
//     }
//     public static Node deleteLast(Node head){
//         Node temp = head;
//         if(head == null){
//             return null;
//         }
//         if(head.next == null){
//             return null;
//         }

//         while(temp.next.next != null){
//             temp = temp.next;
//         }
//         temp.next = null;
//         return head;
//     }

//     public static Node deleteAtPos(Node head,int pos){
//         Node temp = head;
//         for(int i=0;i<pos-1;i++){
//             temp = temp.next;
//         }
//         temp.next.prev = temp.prev;
//         temp.prev.next = temp.next;
//         return head;
//     }

//     public static Node reverse(Node head){
//         Node temp = null;
//         Node curr = head;
//         while(curr != null){
//             temp = curr.prev;
//             curr.prev = curr.next;
//             curr.next = temp;

//             curr= curr.prev;
//         }
//         if(temp != null){
//             head = temp.prev;
//         }
//         return head;
//     }
    
//     public static void traversal(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }


//     public static boolean detectCycle(Node head){
//         Node fast = head;
//         Node slow = head;
//         Node temp = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             if(fast == slow){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};
//         Node head = new Node(0);
//         Node first = new Node(arr[0]);
//         Node second = new Node(arr[1]);
//         Node third = new Node(arr[2]);

//         head.next = second;
//         second.prev = head;

//         second.next = third;
//         third.prev  = second;

    

        
//         traversal(head);
//         // head = insertAtBegin(head,0);
//         // traversal(head);
//         // head = insertAtEnd(head,arr[2]);
//         // traversal(head);
//         // head = insertAtPos(head,arr[3],2);
//         // traversal(head);
//         // head = deleteFirst(head);
//         // head = deleteLast(head);
//         // head = deleteAtPos(head,2);
//         // head = reverse(head);
//         traversal(head);
//         boolean a = detectCycle(head);
//         System.out.println(a);

        



//     }
// }


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev  = null;
    }
    Node(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class doublyLinked{

    public static Node insertBeforeHead(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        newNode.prev  = null;
        head = newNode;
        return head;

    }

    public static void traversal(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public static Node deleteHead(Node head){
        Node temp = head;
        if(head == null){
            return null;
        }
        head = head.next;
        
        return head;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node temp = null;
       
        while(curr != null){
            temp  = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            
            curr = curr.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
        return head;

    }
    // public static Node arrayToDLL(int[] arr){
    //    Node head = new Node(arr[0]);
    //    Node prev = head;
    //    for(int i=1;i<arr.length;i++){
    //     Node temp = new Node(arr[i],prev,null);
    //     prev.next = temp;
    //     prev = temp;
    //    }
    //    return head;
    // }

    public static Node arrayToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i],prev,null);
            prev.next = newNode;
            prev = newNode;


        }
        return head;
    }

    public static Node middleElement(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = new Node(0);
        Node first = new Node(arr[0]);
        Node second = new Node(arr[1]);
        Node third = new Node(arr[2]);

        head.next = first;
        first.prev = head;

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        traversal(head);
        // head = insertBeforeHead(head, 500);
        // head = deleteHead(head);
        // Node h = arrayToDLL(arr);
        // head = reverse(head);
        head = middleElement(head);
        System.out.println(head.data);
        // traversal(head);

    }
}