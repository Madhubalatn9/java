import java.util.*;

public class palin{
    public static  boolean ispalin(int x){
        int rev=0;
        int original=x;
        if(x<0){
            return false; 
        }
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(rev==original){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
        System.out.println(ispalin(n));
        scan.close();
    }
}