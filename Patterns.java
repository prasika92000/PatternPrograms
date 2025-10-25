public class Patterns {
    public static void main(String[] args) {
        //Square pattern  
        int n=5;
        /* for(int i=0;i<n;i++){ //rows
            System.out.print("* ");
            for(int j=0;j<n;j++){  //columns
                 System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); */

        System.out.println("############## Increasing tringle pattern ###########");
        for(int i=0;i<n;i++){
            System.out.print("* ");
            for(int j=0;j<i;j++){
                 System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();  
    
    System.out.println("############## //Decresing tringle pattern ###########");
    for(int i=0;i<=n;i++){
            System.out.print("* ");
            for(int j=i;j<n;j++){
                 System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); 
    
    
    System.out.println("############## Right Sided Tringle [decreasing space ,increasing star] ###########");
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n; j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
             System.out.print("* ");
        }
         System.out.println();
    }  
 

     System.out.println();

 System.out.println("############## reverse hill pattern ###########");
    for(int i=1;i<=n;i++){
    for(int j =1;j<=i;j++){
        System.out.print("  ");
    }
        for(int j=i;j<n;j++){
            System.out.print("* ");
        }
        for(int j=i;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    
    } 

   System.out.println("############## Diamond shape ###########");
   for(int i=1;i<n;i++){
        for(int j=i;j<=n;j++){
            System.out.print("  ");
        }
       for(int j=1;j<i;j++){
        System.out.print("* ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("* ");
       }
      System.out.println();

    }
        for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
       for(int j=i;j<n;j++){
        System.out.print("* ");
       }
       for(int j=i;j<=n;j++){
        System.out.print("* ");
       }

        System.out.println();
    }

   }
}
