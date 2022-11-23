public class replace {
    public static String star(String str, int i) {
        if(i == str.length()-1){
            return "";
        }
        if (str.charAt(i) == str.charAt(i+1)){
            return str.charAt(i)+ "*" + str.charAt(i+1) + star(str, i+2);
        }
        else{
            return str.charAt(i)+star(str, i+1);
        }
        
    }
    public static void main(String[] args) {
        //adjacent star
        // i/p = abbabaab
        // o.p = ab*baba*ab
    System.out.println(star("abbabaab",0));
    }
}
