import java.util.* ;

class butterfly {
    
    // Main method 
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        
        int n = sc.nextInt() ;
        pattern(n) ;
    }
    
    // Pattern method
    public static void pattern(int n) {
        
        // Upper Half logic
        for(int i=1; i<=n ; i++){
            // printing *
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            
            // printing Spaces
            for(int k=n-i; k>0; k--){
                System.out.print("  ");
                System.out.print("  ");
            }
            
            // printing *
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            
            // moving to nextLine
            System.out.println();
        }
        
        // lower half logic
        for(int i=0; i<n; i++){
            // printing *
            for(int j=n-i; j>=1; j--){
                System.out.print("* ");
            }
            
            // printing Spaces
            for(int k=0; k<i; k++){
                System.out.print("  ");
                System.out.print("  ");
            }
            
            // printing *
            for(int j=n-i; j>=1; j--){
                System.out.print("* ");
            }
            
            // moving to nextLine
            System.out.println();
        }
    }
}
