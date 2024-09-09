import java.util.Scanner;
public class largestofthree{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int a,b,c;
       System.out.println("enter three numbers");
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
       if(a>=b&&a>=c){
        System.out.println(a+"is largest");
       }
       else if(b>=a&&b>=c){
        System.out.println(b+"is largest");
       }
       else {
        System.out.println(c+"is largest");
       }
    }}