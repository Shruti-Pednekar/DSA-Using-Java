// Inverted Half Pyramid with numbers 
/*1 2 3 4 5 => row = 1  print 1 to 5 
  1 2 3 4   => row = 2  print 1 to 4  
  1 2 3     => row = 3  print 1 to 3  
  1 2       => row = 4  print 1 to 2  
  1         => row = 5  print 1 to 1 
 */

//  i=rows
//  when rows getting increases the cols get decreases 

public class PatternInvertedHalfPyraNum {
    public static void main(String args[]){
        int n=5; 

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();


































































































        }
     }
}
