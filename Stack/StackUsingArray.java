// package DSA-Code.Stack;

public class StackUsingArray {
    public static class stack{
        private int[] arr = new int[4];
        private int idx = 0;

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        void push(int num){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx]=num;
            idx++;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int num = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return num;
        }
        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        // s.push(20);
        // s.peek();
        // s.push(23);
        // s.push(43);
        // s.push(65);
        s.pop();
        // s.push(80);
        s.display();
    }
}
