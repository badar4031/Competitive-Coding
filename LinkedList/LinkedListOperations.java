
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertFirst(int a){
        Node temp = new Node(a);
        if(head == null){
            head =  temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }
    
    public void insertEnd(int a){
        Node node = new Node(a);
        Node temp;
        if(head == null){
            head =  node;
        }
        else{
            temp =  head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node; 
        }
    }
    
    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
        
    }
    
    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        System.out.println();
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    
    public void printList(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        System.out.println();
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEnd(40);
        list.insertFirst(10);
        list.insertEnd(30);
        list.insertFirst(20);
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}
