

public class Main {
    public static void main(String[] args) {

        int n=5;
        int i,j,k;

   /*               *
                   ***
                  *****
                 *******        */

      /*  for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("A");
            }
            for (k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
          }*/



    /*              *********
                    A*******
                   AAA*****
                  AAAAA***
                 AAAAAAA*                */

        for(i=n;i>=1;i--){
            for(j=0;j<=n-i;j++){
                System.out.print("A");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}