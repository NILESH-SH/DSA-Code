
public class QueueUsingLl {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class QueueLL{
        Node head = null;
        Node tail = null;
        String empty = "Queue is Empty";
        public void add(int data){
            Node newNode = new Node(data);
            if (head==null) {
                head = newNode;
                tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if (head==null) {
                System.out.println(empty);
                return -1; 
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int element(){
            if(head==null){
                System.out.println(empty);
                return -1;
            }
            return head.data;
        }
        public void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    } 
    public static void main(String[] args) {
        QueueLL ql = new QueueLL();
        ql.add(23);
        ql.add(43);
        ql.add(13);
        ql.add(17);
        ql.remove();
        ql.remove();
        ql.remove();
        System.out.println("Deleted "+ql.remove());
        // ql.add(73);
        // ql.add(93);
        ql.display();
    }
    
}
