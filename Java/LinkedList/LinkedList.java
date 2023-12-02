class LinkedList{
    Node head;
    public int size;

    LinkedList(){
        size = 0;
    }

    public class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    /*--------add First---------*/
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /*---------add Last-------*/
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    /*-------add Node to middle-------*/
    public void addMid(int data,int index){
        Node newNode = new Node(data);
        if(head == null || index == 0){
            head = newNode;
            newNode.next = head;
        }
        else{
            Node currNode = head;
            for(int i=1;i<size;i++){
                if(i == index){
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty.");
        }
        
    }

    //printing Linked list
    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);
        list.addMid(3,2);
        list.printList();
        System.out.println("Size of the list is: " + list.size);
    }
}
