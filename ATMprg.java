import java.util.Scanner;
class atm{
    static int money;
    public atm(){
        System.out.println("Welcome Deepa .....");
    }
    public atm(int money){
        this.money=money;
    }
    public atm(int Amt,char T){
        if(T=='W'){
            System.out.println("You have withdrawn : "+money+" Rs/-");
    }else if(T=='D'){
        this.money=this.money+Amt;
            System.out.println("You have deposited : "+money+" Rs/-");
        }
    }
    public atm(char T){
        System.out.println("Balance Amount is : "+this.money);
    } 
}
class ATMprg{
    static atm d;
    static int n,P=0;
    static void options(){
        System.out.print("\n\t\tMENU\n\t------------\n\t 1.DEposit \n\t 2. Withdraw \n\t 3. Check Balance \n\t 4. Quit\nSelect One Option :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==1){
            System.out.print("\n Enter Amount to Deposit : ");
            P=sc.nextInt();
            d=new atm(P,'D');
            options();
        }else if(n==2){
            System.out.print("\n Enter Amount to Withdraw : ");
            P=sc.nextInt();
            d=new atm(P,'W');
            options();
        }else if(n==3){
            d=new atm('B');
            options();
        }else if(n==4){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        atm d;
        Scanner sc=new Scanner(System.in);
        d=new atm();
        System.out.print("\n Enter Principle Amount : ");
        P=sc.nextInt();
        d=new atm(P);
        options();
    }
}
