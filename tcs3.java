import java.util.*;
import java.util.Arrays;
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ze=0,on=0,tw=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                ze++;
            }else if (arr[i]==1){
                on++;
            }else if(arr[i]==2){
                tw++;
            }

        }
        int j=0;
        while(ze>0){
            arr[j++]=0;
            ze--;
        }
        while(on>0){
            arr[j++]=1;
            on--;
        }
        while(tw>0){
            arr[j++]=2;
            tw--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}