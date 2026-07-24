import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
                System.out.print(ch);
            }else if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
                System.out.print(ch);
            }
            else{
                System.out.print(ch);
            }
            
// Add your logic
        }
        
    }
}