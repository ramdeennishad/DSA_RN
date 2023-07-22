package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        printx(5);
    }
    public static void printx(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(n-j+1+" ");
                }
            System.out.println();
        }
    }
    
}
