package Pattern;

public class star {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n;j++){
                if(j== i|| j==n-i+1){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
