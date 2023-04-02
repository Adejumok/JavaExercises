package dsa;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead(){
        return head;
    }

    public void prepend(String element){
        Node newNode = new Node(element);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void append(String element){
        Node newNode = new Node(element);
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.getNextNode() == null){
                currentNode.setNextNode(newNode);
                currentNode.setNextNode(null);
            }
            currentNode = currentNode.getNextNode();
        }

    }


    public int getSize(){
        int count = 0;
        Node present = head;
        if (present ==null){
            return 0;
        }
        while (present != null){
            present = present.getNextNode();
            count ++;
        }
        return count;
    }


    public boolean print(Node n){
            if(n.equals(head)){
                System.out.print("Head: "+n.getData()+"=>");
            } else if (n.getNextNode() == null) {
                System.out.print("Tail: "+n.getData());
            }
            System.out.print(n.getData()+"=>");
        return false;
    }
}
