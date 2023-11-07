public class ReverseStringUsingStack {
    
    
    public static void main(String[] args) {
        String str = "masoud";
        
        Stack <Character> stack = new Stack<>();
        
        char chars[] = str.toCharArray();
        
        for(char c:chars){
            stack.push(c);
        }
        
        
        for (int i = 0; i < chars.length; i++) {
            
            chars[i] = stack.pop();
            
        }
        
        str = new String(chars);
        
        System.out.println(str);
                
        
    }
    
            
    
}
