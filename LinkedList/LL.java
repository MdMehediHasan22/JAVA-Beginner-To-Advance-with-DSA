package LinkedList;

class LL{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
        }
    }
    //add first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        Object head;
        if(head == null){
            head = newNode;
            return;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();

    }
}