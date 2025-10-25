public class NumberPattern2 {
    public static void main(String[] args) {
        int n=5,p=1;
        System.out.println("############## Diamond shape incrementing ###########");
        //pattern - diamond
        //number-incrementing rows
   for(int i=1;i<n;i++,p++){
        for(int j=i;j<=n;j++){
            System.out.print("  ");
        }
       for(int j=1;j<i;j++){
        System.out.print(p+ " ");
       }
       for(int j=1;j<=i;j++){
        System.out.print(p+ " ");
       }
      System.out.println();

    }
        for(int i=1;i<=n;i++,p++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
       for(int j=i;j<n;j++){
        System.out.print(p+ " ");
       }
       for(int j=i;j<=n;j++){
        System.out.print(p+ " ");
       }

        System.out.println();
    }

    
    System.out.println("############## Diamond shape ###########");
        //pattern - diamond
        //number-incrementing and decrementing rows
   for(int i=1,p1=1;i<n;i++,p1++){
        for(int j=i;j<=n;j++){
            System.out.print("  ");
        }
       for(int j=1;j<i;j++){
        System.out.print(p1+ " ");
       }
       for(int j=1;j<=i;j++){
        System.out.print(p1+ " ");
       }
      System.out.println();

    }
        for(int i=1,p1=5;i<=n;i++,p1--){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
       for(int j=i;j<n;j++){
        System.out.print(p1+ " ");
       }
       for(int j=i;j<=n;j++){
        System.out.print(p1+ " ");
       }

        System.out.println();
    }

     System.out.println("############## Increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: incrementing columns
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=0;j<i;j++){
                  System.out.print(k++ + " ");
            }
            System.out.println();
        }
        System.out.println(); 


        
        System.out.println("############## decreasing tringle pattern ###########");
        //pattern : decreasing tringle
        //number: incrementing columns
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j < i; j++) {
                System.out.print("  "); 
            }
            // print decreasing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println(); 
        }

        System.out.println("############## Increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: decrementing columns
        for(int i=1;i<=n;i++){
            int k=5;
            for(int j=0;j<i;j++){
                  System.out.print(k-- + " ");
            }
            System.out.println();
        }
        System.out.println(); 
    
    }
    
}
