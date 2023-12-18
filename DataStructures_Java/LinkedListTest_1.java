public class LinkedListTest_1 {
    Node head;
    class Node{
        String Data;
        Node next;

        Node(String data){
            this.Data = data;
            this.next = null;
        }
    }


    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        return;
    }

    public void addLast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }

        Node currnNode = head;

        while(currnNode.next != null){
            currnNode = currnNode.next;
        }
        currnNode.next = newnode;
        return;
    }

    public void printList(){
        if(head==null){
            System.out.println("Empty List");
        }

        Node currnNode = head;
        while(currnNode != null){
            System.out.print(currnNode.Data+"-->");
            currnNode = currnNode.next;
        }
        System.out.println("Null");
        return;
    }

    public void deletFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        return;
    }

    public void deletLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head =null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public void reverseIterrate(){
        Node prevNode = head;
        Node currNode = head.next;
        if(head==null || head.next == null){
            System.out.println("Empty");
            return;
        }


        while(currNode != null){
            Node nextNode  = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LinkedListTest_1 l = new LinkedListTest_1();
        l.addFirst("Hi");
        l.addLast("This");
        l.addLast("Is");
        l.addLast("Linked");
        l.addLast("List");

        l.addFirst("Okkkk");
        l.addFirst("Byee");

        l.printList();
        l.deletFirst();
        l.printList();
        l.deletFirst();
        l.printList();
        l.addFirst("Hii_1");
        l.printList();
        l.reverseIterrate();
        l.printList();
    }    
}