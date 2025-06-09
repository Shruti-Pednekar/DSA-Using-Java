// print hollow rectangle 
// ****
// *  *
// *  *
// ****



public class PattenHollowRectangle {
    
    public static void main(String[] args) {
        
        int n = 4;
        int m = 5;

        // outer loop(for rows )
        for(int i = 1; i<=n ; i++){

            // inner loop(for cols )
            for (int j = 1; j<=m ; j++){
                // now we are at (i,j)=>(1,1)
                // want to print only boundary stars 
                if(i == 1 || j == 1 || i == n  || j == m ){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println(" "); 
        }
    }
}
