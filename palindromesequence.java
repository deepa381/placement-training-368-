import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text : ");
        String text=sc.nextLine();
        int m=text.length();
        int dp[][]=new int[m+1][m+1];
        for(int i=1;i<=m;i++){
            dp[i][i]=1;
        }
        for(int i=m-1;i>=1;i--){
            for(int j=i+1;j<=m;j++){
                if(text.charAt(i-1)==text.charAt(j-1)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println("Palindromic Subsequence : " + dp[1][m]);
    }
} 