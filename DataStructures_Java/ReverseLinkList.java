public class ReverseLinkList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head = newnode;
        return;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null ){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
        return;
    }

    public void deletFirst(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        head.next = head;
        return;
    }

    public void deletLast(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next ==null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        
        while(lastNode.next != null){
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next=null;
        return;
    }


    public void printList(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }

        Node currnNode = head;
        while(currnNode != null){
            System.out.print(currnNode.data+"-->");
            currnNode = currnNode.next;
        }
        System.out.println("Null");
        return;
    }

    public static void main(String[] args) {
        ReverseLinkList list = new ReverseLinkList();
        list.AddFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.deletFirst();
        list.printList();
        list.deletLast();
        list.printList();
        list.addLast(9);
        list.printList();
    }
}
