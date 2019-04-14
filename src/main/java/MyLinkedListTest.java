public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0,2);
        myLinkedList.add(1,1);
        myLinkedList.add(2,4);
        myLinkedList.add(3,5);
        myLinkedList.add(4,6);
        System.out.println("Start List:");
        myLinkedList.print();
        System.out.println(myLinkedList.getSize());
        System.out.println("After remove at index 2:");
        myLinkedList.remove(2);
        myLinkedList.print();
    }
}
