package bridgelabz.basicJunitProblems;


public class StringUtils {

    public StringBuilder s;

    public StringUtils(String str) {
        this.s = new StringBuilder(str);
    }

    public String reverse(){
        return this.s.reverse().toString();
    }

    public boolean isPalindrome(){
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
//            else{
                i++;
                j--;
//            }
        }

        return true;
    }

    public String toUpperCase(){
        return this.s.toString().toUpperCase();
    }
}
