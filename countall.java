import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if((ch>='a' && ch<='z')||ch>='A' && ch<='Z'){
                letters++;
            }else if(ch>='0' && ch<='9'){
                digits++;
            }else{
                special++;
            }

           // Add your logic
        }

        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Special Characters : " + special);
    }
}