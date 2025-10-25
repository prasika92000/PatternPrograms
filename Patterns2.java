import java.util.Scanner;

public class Patterns2 {
    public static void main(String[] args) {
        // int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.println("-----------------pyramid pattern--------------------- ");
        
          for(int i =1;i<=rows;i++){
          for(int j=i;j<=rows;j++){
          System.out.print("  ");
          }
          for(int j=1;j<=i;j++){
          System.out.print("*   ");
         }
          
          System.out.println();
          }
         

        System.out.println("-----------------double hill pattern--------------------- ");
        
          for(int i =1;i<=rows;i++){
          // 1. Leading spaces (for left hill)
          for(int j = i; j <= rows; j++) {
          System.out.print(" ");
          }
          // 2. Left hill stars (with extra space to match pattern)
          for(int k = 1; k <= i; k++) {
          System.out.print("* ");
          }
          // 3. Spaces between hills
          for(int j = 1; j <= (rows - i) * 2; j++) {
         System.out.print(" ");
          }
          // 4. Right hill stars (with extra space to match pattern)
          for(int k = 1; k <= i; k++) {
          System.out.print("* ");
          }
          System.out.println();
          }



//Easy way
            for(int i =1;i<=rows;i++){
          // 1. Leading spaces (for left hill)
          for(int j = i; j <= rows; j++) {
          System.out.print(" ");
          }
          // 2. Left hill stars (with extra space to match pattern)
          for(int k = 1; k <= i; k++) {
          System.out.print("* ");
          }
          // 3. Spaces between hills
          for(int j = i; j < rows; j++) {
         System.out.print("  ");
          }
          // 4. Right hill stars (with extra space to match pattern)
          for(int k = 1; k <= i; k++) {
          System.out.print("* ");
          }
          System.out.println();
          }
         

        System.out.println("-----------------reverse pyramid pattern--------------------- ");
        
          for(int i =1;i<=rows;i++){
          for(int j=1;j<=i;j++){
          System.out.print("  ");
          }
          for(int j=i;j<=rows;j++){
          System.out.print(" *  ");
          }
          
          System.out.println();
          }
         

         System.out.println("-----------------left pascal pattern--------------------- ");
        // Upper half of Left Pascal Triangle
          for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
        // Lower half of Left Pascal Triangle
         for (int i = 1; i <= rows; i++) { // i starts from 1 to rows-1
            for (int j = 1; j <= rows - i; j++) { // prints decreasing stars
                System.out.print("* ");
            }
            System.out.println();
        }  

//Easy Way
          for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
         for (int i = 1; i <= rows; i++) { 
            for (int j = i; j < rows; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        } 
        
       
        System.out.println("-----------------right pascal pattern--------------------- ");
        for(int i=1;i<=rows;i++){
            for(int j=i;j<=rows; j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=rows-1;i>=1;i--){                 // rows-1 because the middle row already printed
            for(int j=i;j<=rows; j++){              // spaces: starts from 1 and increases
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){                   // stars: decreasing
                System.out.print("* ");
            }
            System.out.println();
        }


    System.out.println("-----------------Sandglass pattern--------------------- ");
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(int j=i;j<=rows;j++){
            System.out.print("  * ");
        }

        System.out.println();
    }
     for(int i=1;i<=rows;i++){ //lower
        for(int j=i;j<=rows;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("  * ");
        }

        System.out.println();
    }

    System.out.println("-----------------Butterfly pattern--------------------- ");
    //top part - 
    /* for(int i =1;i<= rows;i++){              // i< rows for removing one middle extra row
        for(int j=1;j<=i;j++){ //increasing tringle of stars
            System.out.print("* ");
        }
        for(int j=i;j< rows;j++){  //decresing trigle of space   j< rows-for removing extra space from the two empty tringles
            System.out.print("  ");
        }
        for(int j=i;j< rows;j++){   //decresing trigle of space
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){  ////increasing trigle of stars
            System.out.print("* ");
        }
        System.out.println();
    } 
    //bottom part -
     for(int i =1;i<=rows;i++){
         for(int j=i;j< rows;j++){   //decresing trigle of stars
            System.out.print("* ");
        }
        for(int j=1;j<=i;j++){ //increasing tringle of stars
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){ //increasing tringle of stars
            System.out.print("  ");
        }
        for(int j=i;j< rows;j++){   //decresing trigle of stars
            System.out.print("* ");
        }

        System.out.println();
     } */

     for(int i =1;i<= rows;i++){              //easy way
        for(int j=1;j<=i;j++){ //increasing tringle of stars
            System.out.print("* ");
        }
        for(int j=i;j< rows;j++){   //decresing trigle of space
            System.out.print("  ");
        }
        for(int j=i;j< rows;j++){   //decresing trigle of space
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){  ////increasing trigle of stars
            System.out.print("* ");
        }
        System.out.println();
    } 
    //bottom part -
     for(int i =1;i<=rows;i++){
         for(int j=i;j< rows;j++){   //decresing trigle of stars
            System.out.print("* ");
        }
        for(int j=1;j<=i;j++){ //increasing tringle of space
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){ //increasing tringle of space
            System.out.print("  ");
        }
        for(int j=i;j< rows;j++){   //decresing trigle of stars
            System.out.print("* ");
        }

        System.out.println();
     }
   

    }

}
