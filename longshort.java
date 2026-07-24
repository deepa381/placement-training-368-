import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longest = words[0];
        String shortest = words[0];

        for (int i = 1; i < words.length; i++) {
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
            if(words[i].length()<shortest.length()){
                shortest=words[i];
            }

          // Add your logic
        }

        System.out.println("Longest Word  : " + longest);
        System.out.println("Shortest Word : " + shortest);
    }
}