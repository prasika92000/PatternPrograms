public class AdditionalPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();


    System.out.println("**************** Plus sign patter ************");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==3 || j==3 ){ // i== (n/2)+1) -->it gives center point for i and  j== (n/2)+1) -->it gives center point for j -- alternative approach to find out center point
                    System.out.print("x  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

    System.out.println("****************************");

    for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print("X  ");
                }else{
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("************** X pattern **************");

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j  || i+j == n+1){
                    // Condition 1: (i == j) → True for the left-to-right diagonal
                    // Condition 2: (i + j == n + 1) → True for the right-to-left diagonal
                    System.out.print("X  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("****************************");

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || i==j || i+j == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
       

        System.out.println("****************************");

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==j || i+j == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("****************************");

         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n || i==j || i+j == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        n = 7;
        System.out.println("****************************");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==4 || j==4 || i==j || i+j == n+1){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
