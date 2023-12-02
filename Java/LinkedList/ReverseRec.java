public class ReverseRec {
    Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addMid(int data,int pos){
        Node newNode = new Node(data);
        if(head == null || pos == 0){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node currNode = head;
            for(int i=1;i<=pos;i++){
                if(i==pos){
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public Node reverseRec(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args){
        ReverseRec list = new ReverseRec();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(1);
        list.addLast(6);
        list.addMid(2, 1);

        list.printList();

        list.head = list.reverseRec(list.head);
        list.printList();
    }
}
