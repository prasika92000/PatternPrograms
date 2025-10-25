import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = sc.nextInt();

        System.out.println("############## Increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: incrementing rows
        for(int i=1,p=1;i<=rows;i++,p++){
            for(int j=0;j<i;j++){
                  System.out.print(p  + " ");
            }
            System.out.println();
        }
        System.out.println(); 
        
        
        System.out.println("############## increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: decrementing rows
        for(int i=1,p=rows;i<=rows;i++,p--){
            for(int j=0;j<i;j++){
                  System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println(); 


        System.out.println("############## increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: rows incrementing by 2
        for(int i=1,p=0;i<=rows;i++,p+=2){
            for(int j=0;j<i;j++){
                  System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println(); 

         System.out.println("############## increasing tringle pattern ###########");
        //pattern : increasing tringle
        //number: rows odd=1; and Even=2
            for(int i=1,p=0;i<=rows;i++,p+=2){
            for(int j=0;j<i;j++){
                if(i%2==0){
                  System.out.print("2 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println(); 
    }
}
