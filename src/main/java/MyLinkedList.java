public class MyLinkedList {
    private int numberNode;
    private Node head=null;
    private Node tail=null;

    public MyLinkedList(Object data){
        head = new Node(data);
        numberNode++;
    }

    public MyLinkedList() {
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    int getSize(){
        return numberNode;
    }

    private void addFirstOrLast(Object data, String firstOrLast) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = head;
        } else {
            if (firstOrLast.equals("first")){
                newNode.next = head;
                head = newNode;
            }
            if (firstOrLast.equals("last")){
                tail.next = newNode;
                tail = newNode;
            }
        }
    }
    void add(int index, Object data){
        if (index == 0){
            addFirstOrLast(data, "first");
        } else if (index == numberNode){
            addFirstOrLast(data,"last");
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index-1; i ++){
                current = current.next;
            }
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }
    void remove (int index){
        isEmpty();
        outOfList(index);
        removeFirst(index);

        if (index > 0 && index < getSize()){
            Node temp = head;
            Node current;
            for (int i = 0; i < index; i ++){
                temp = temp.next;
            }
            current = temp.next.next;
            temp.next = current;
            numberNode--;
        }
    }
    String getData(int index){
        Node temp = head;
        for (int i = 0; i < index; i ++){
            temp = temp.next;
        }
        return "Data at index: " + index + " is " + temp.data;
    }

    void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
    private void removeFirst(int index) {
        if (index == 0){
            head = head.next;
            numberNode--;
        }
        return;
    }

    private void outOfList(int index) {
        if (index < 0 || index >=getSize()){
            System.out.println("Out of list");
        }
    }

    private void isEmpty() {
        if (head == null){
            System.out.println("List is empty");
        }
    }
}
