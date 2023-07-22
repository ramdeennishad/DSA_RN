package Pattern;

public class Alpha1 {
    static void patternA(int n)
{
     
      for(int i=0;i<n;i++){

          for(char ch = 'A'; ch<='A'+i;ch++){
              System.out.print(ch + " ");
              
          }
          
          System.out.println();
         
      }
}

    public static void main(String[] args) {
        int N = 5;
        patternA(N);
    }
}
