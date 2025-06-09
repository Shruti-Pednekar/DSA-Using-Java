// Print the half pyramid 


public class PatternHalfPyramid {
    
    public static void main(String[] args) {
        
        // row no= total cols 
        // only requires rows 

        int n=4;
        // outer for loop for 
        for (int i = 1 ; i<=n ; i++){

            // inner loop
            // j is increase upto i
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
