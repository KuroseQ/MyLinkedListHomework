public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(11);
        myLinkedList.add(22);
        myLinkedList.add(33);
        myLinkedList.add(44);
        myLinkedList.add(55, 4);

        myLinkedList.delete(0);
        myLinkedList.delete(1);

        System.out.println(myLinkedList.getNode(0));
        System.out.println(myLinkedList.getNode(1));
        System.out.println(myLinkedList.getNode(2));

    }
}
