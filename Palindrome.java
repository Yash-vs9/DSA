public class Palindrome {
    public static boolean check(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        return check(str,l+1,r-1);
    }

    public static void main(String[] args) {
        System.out.println(check("asadasa",0,6));
    }
}
