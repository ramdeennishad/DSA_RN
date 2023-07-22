package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        printx(4);
    }
    public static void printx(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
