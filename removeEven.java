

public class RemoveEven {
    
    public static int [] remove(int a[]){
        int countOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0){
                countOdd++;
            }
            
        }
        
        int res[] =  new int [countOdd];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
           if(a[i] % 2 != 0){
               res[index] = a[i];
               index++;
           }
            
        }
        return res;
  
    }
    
    public static void main(String[] args) {
        int a[] = {1,4,10,9,7,6,3};
        remove(a);
                
    }
         
}
