public class StackUsingLl {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Stackll{
        Node head = null;
        int size = 0;
        boolean isEmpty(){
            if (size==0) {
                System.out.println("Stack is empty");
                return true;
            }
            else
            return false;
        }
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if (isEmpty()) {
                return -1;
            }
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }
        int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stackll sl = new Stackll();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.pop();
        System.out.println(sl.peek());
        sl.display();
    }
    
}
