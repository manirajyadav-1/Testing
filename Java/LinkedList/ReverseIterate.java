public class ReverseIterate {

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

    public void addMid(int data,int index){
        Node newNode = new Node(data);

        if(head == null || index == 0){
            head = newNode;
            newNode.next = head;
        }
        else{
            Node currNode = head;
            for(int i=1;i<=index;i++){
                if(i == index){
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
            System.out.print("List is empty.");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void reverseIterate(){
        if(head == null || head.next == null)
        {
            return;
        }
        Node prevNode = null;
        Node currNode,nextNode;
        currNode = nextNode = head;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public static void main(String[] agrs){
        ReverseIterate list = new ReverseIterate();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.addMid(8,3);

        
        list.printList();

        list.reverseIterate();

        list.printList();

    }
}
