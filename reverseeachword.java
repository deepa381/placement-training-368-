import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            for (int j = words[i].length() - 1; j >= 0; j--) {
               // Add your logic
               System.out.print(words[i].charAt(j));

            }

            System.out.print(" ");
        }
    }
}
