public class fibinocci{
    static int fibi(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibi(n-1)+fibi(n-2);
        }
    }
    public static void main(String args[]) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(fibi(i)+"");
        }
        
    }}
