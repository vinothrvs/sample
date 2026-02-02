public class app {
    public static void main(String []args){
        String s="a2b13x";
        System.out.println(stringcounter(s));
    }
    private static String stringcounter(String s){
        StringBuilder s1= new StringBuilder();
        char c;
        int i=0;
        boolean b;
        while(i<s.length()){
            c=s.charAt(i);
            if(Character.isAlphabetic(c)){
                s1.append(c);
            }
            if(Character.isDigit(c)){
                StringBuilder num = new StringBuilder();
                while(1<3){
                    if(Character.isDigit(c)){
                        System.out.println("hello");
                        i++;
                    }
                    else b=false;
                }
                
            }
            
            i++;
        }
    
        return s1.toString();
    }
}
