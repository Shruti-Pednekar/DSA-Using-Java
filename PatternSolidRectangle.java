import java.util.*;



public class PatternSolidRectangle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows you want :");
        int n = sc.nextInt();
        System.out.println("Enter columns you want :");
        int m = sc.nextInt();


        // outer loop
        for (int i = 1; i<=n ; i++){
        // inner loop
            for(int j = 1; j<=m ; j++){
                System.out.print("*");
            }
            System.out.println( );

        }

    }
    
}
