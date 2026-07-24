import java.util.Scanner;

class tcs2 {
    static int f1=1,f2=1,f3=0;
    static void fibonacci(){
        if(count==0||count==1){
            System.out.print(1+" ");
            count++;
        }
        else{
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
    }
    static void prime(){
        while(true){
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
                num++;
                break;
            }
            num++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                fibonacci();
            } else {
                prime();
            }
        }
    }
}
