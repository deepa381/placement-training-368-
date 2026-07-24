import java.util.*;
class Main1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList lst=new ArrayList();
        lst.add("ABC");
        lst.add(100);
        lst.add("XYZ");
        lst.add("ABC");
        lst.add(20.50);
        lst.add(100);
        lst.add('K');
        System.out.println("List : " + lst);
        ArrayList<Integer> lst1=new ArrayList<>();
        lst1.add(100);
        lst1.add(200);
        lst1.add(300);
        System.out.println("List 1 : " + lst1);
        ArrayList<Object> mixed=new ArrayList<>();
        mixed.add(lst);
        mixed.add(lst1);
        System.out.println("Mixed List : " + mixed);

    }
} 