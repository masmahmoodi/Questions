
public class FindTheMissingNum {
    
    
    public static void main(String[] args) {
        
        int a[] = {1,2,4,5};
        int n = a.length+1;
        int sum = n * (n+1)/2;
        for(int num :a){
            sum  = sum-num;
        }
        
        System.out.println("here is your missing element:"+sum);
        
        
    }
    
    
    
    
}
