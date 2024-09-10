import java.util.Scanner;
public class diagonal{
    static void printdiagonal(int mat[][],int n){
        System.out.println("diagonal are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(mat[i][j]+",");
                }
            }
        }

    }
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of n");
        n=s.nextInt();
        int m[][]=new int[n][n];
        System.out.print("enter matrix elemnts");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=s.nextInt();
            }
        }
        printdiagonal(m, n);

    }
}