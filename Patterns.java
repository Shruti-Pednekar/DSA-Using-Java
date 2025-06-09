public class Patterns {
    public static void main (String args[]){
        
        
        // 1.squre pattern
        // int n=4;
        // int m=5;
    //     // outer loop(rows)
    //     for(int i=1;i<=n;i++){
    //         // inner for loop(cols)
    //         for(int j=1;j<=m;j++){
    //         System.out.print("*");
    //         }
    //         System.out.println();
    //     }

        // 2.Hollow Squere pattern 
        // int n=4;
        // int m=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i ==1 || j==1 || i == n ||j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();  
        // }


        // 3. print pattern 
    // *
    // **
    // ***
    // ****
    // solution:The no.of row having in line having same no. of *in that row
    // int n=4;
    // for(int i=1; i<=n; i++){
        
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //   System.out.println();

    // }

// 4. print pattern reverse pyramid 

        // int n=4;
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
     
// 5.half pyramid rotated by 180 degree
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //       System.out.print(" "); 
        //     }

        //     // for loop for print *
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

// 6 . Print patten 1 to 5 pyramid
            // int n=5;
            // for(int i=1; i<=n;i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();
            // }

// inverted half pyramid with numbers 
// 12345
// 1234
// 123
// 12
// 1

            // int n=5;
            // for(int i=1;i<=n;i++){
            //     // inner loop
            //     for(int j=1;j<=n-i+1;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }


// Floyd's triangle
// 1
// 23
// 456
// 78910
// 1112131415

            //  int n=5;
            //  int number = 1;
            // //  outer loop
            // for (int i=1;i<=n;i++){
            //     // inner loop
            //     for(int j=1;j<=i;j++){
            //         System.out.print(number+" ");
                    
            //         number++; //number =number+1
            //     }
            //     System.out.println();
            // }

// 9. 0-1 Triagle
            int n=5;
            // outer loop
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    int sum=i+j;
                    if(sum % 2 == 0 ){ 
                    System.out.print("1 ");
                    }else{  
                    System.out.println("0 ");
                    }
                }
                System.out.println();
            }
            





    }
    

        

}
