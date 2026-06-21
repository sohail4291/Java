
// class Node{
//     int data;
//     Node next;
//     Node(int data, Node next){
//         this.data = data;
//         this.next = next;
//     }
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {
//     public static Node insertAtHead(Node head, int data){
//         Node newnode = new Node(data,head);
//         return newnode;
//     }
//     public static Node deleteTail(Node head){
//         if(head == null || head.next == null){
//             return null;
//         }
//         Node curr = head;
//         while(curr.next.next != null){
//             curr = curr.next;
//         }
//         curr.next = null;
//         return head;

//     }
//     public static void printList(Node head){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+ " -> ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args){
//         int[] arr  = {1,2,3,4,5};
//         Node head = new Node(arr[0]);
//         head.next = new Node(arr[1]);
//         printList(head);

//         head = insertAtHead(head,0);
//         printList(head);

//         deleteTail(head);
//         printList(head);

//     }
   
      
// }


class Node{
    int data;
    Node next;
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class LinkedList{

    public static Node insertAtHead(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }
    public static Node insertAtMiddle(Node head, int data, int pos){
        Node temp = head;
        Node newNode = new Node(data);
        int count = 0;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node deleteFirst(Node head){
        head = head.next;
        return head;
    }
    public static Node deleteLast(Node head){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node deleteAtPos(Node head, int pos){
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public static Node middleElement(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

    }
    public static void traversal(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        
        traversal(head);
        // head = insertAtHead(head,0);
        // traversal(head);
        // head = insertAtEnd(head,arr[2]);
        // traversal(head);
        // head = insertAtMiddle(head,arr[3],3);
        // traversal(head);
        // head = deleteFirst(head);
        // traversal(head);
        // head = deleteLast(head);
        // traversal(head);
        // head = deleteAtPos(head,2);
        // traversal(head);
        head = reverse(head);
        traversal(head);
        // head = middleElement(head);
        // System.out.println(head.data);
        boolean a  = detectCycle(head);
        System.out.println(a);



    }
}