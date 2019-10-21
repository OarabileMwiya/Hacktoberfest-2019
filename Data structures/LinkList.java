
/**
 * Write a description of class h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class LinkList {

    private static class Node<T> {

        private final T data;
        private Node next;

        public Node(T data){
            this.data=data;
        }


        public void displayNode(){
            System.out.print(data+ " ");
        }

    }

    private Node first = null;
    private Node last = null;

    public boolean isEmpty() {
        return (first == null);
    }

    public <T> void addLast(T data) {
        Node n = new Node(data);
        if (isEmpty()) {
            n.next = first;
            first = n;
            last = n;
        } else {
            last.next = n;
            last = n;
            last.next = null;
        }

    }

    public void removeFirst() {

            Node temp = first;
            if (first.next == null)
                last = null;
            first = first.next;

        }


    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
    
    public class LinkListQueue {

    LinkList newLinkList = new LinkList();

    public <T> void enqueue(T data) {
        newLinkList.addLast(data);
    }

    public void dequeue() {
        if(!newLinkList.isEmpty())
            newLinkList.removeFirst();

    }

    public void displayQueue() {
        newLinkList.displayList();
        System.out.println();
    }

    public boolean isEmpty(){
        return newLinkList.isEmpty();
    }

}
    
    

}
