package dsa;

public class LinkedListImpl {
    public static void main(String[] args) {
        Node node = new Node("Titi");
        LinkedList linkedList = new LinkedList(node);
        linkedList.append("Sikiratu");
        System.out.println(linkedList.print(node));
    }

}
