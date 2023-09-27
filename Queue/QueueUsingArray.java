
public class QueueUsingArray {
    public static class queue {
        private int[] que = new int[6];
        private int front = -1;
        private int rear = -1;
        private int size = 0;

        public void add(int val) {
            if (rear == que.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                que[++rear] = val;
                size++;
                front = rear = 0;
            } else {
                size++;
                que[++rear] = val;
            }

        }

        public int remove() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                 size--;
            }
            return que[front++];
        }
        public int element(){
            if(front==-1){
                System.out.println("Queue is Empty");
                return -1;
            }
            return que[front];
        }

        void display() {
            if (size==0) {
                System.out.println("Queue is empty");
                
            }
            else{
                for (int i = front; i <= rear; i++) {
                    System.out.print(que[i] + " ");
                }

            }
        }
    }

    public static void main(String[] args) {
        queue qa = new queue();
        qa.add(120);
        qa.add(140);
        System.out.println(qa.remove()+" "+qa.size);
        System.out.println(qa.remove()+" "+qa.size);
        System.out.println(qa.remove() +" "+qa.size);
        System.out.println(qa.remove() +" "+qa.size);
        qa.add(43);
        qa.add(13);
        qa.add(33);
        qa.add(3);
        qa.add(73);
        // System.out.println(qa.element() +" "+qa.size);
        // System.out.println(qa.remove() +" "+qa.size);
        // System.out.println(qa.element() +" "+qa.size);
        qa.display();
    }
}
