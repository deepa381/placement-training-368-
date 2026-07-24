// stack implementation of queue
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int type=sc.nextInt();
            if(type==1){
                int x=sc.nextInt();
                enqueue(x);
            } else if(type==2){
                dequeue();
            } else {
                front();
            }
        }
    }
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    static void enqueue(int x) {
        s1.push(x);
    }
    static void transfer() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()){
            s2.push(s1.pop());
            }
        }
    }
    static void dequeue(){
        transfer();
        if(s2.isEmpty()){
            System.out.println("S2 is Empty");
        } else {
            s2.pop();
        }
    }
    static void front() {
        transfer();
        if(s2.isEmpty()){
            System.out.println("S2 is Empty");
        } else {
            System.out.println(s2.peek());
        }
    }
}