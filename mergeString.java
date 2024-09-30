import java.util.*;
class mergeString{
    public static void main(String s[]){
        String s1,s2,result;
        int maxlength,minlength;
        result="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        s1=sc.next();s2=sc.next();
        if(s1.length()>s2.length()){
            maxlength=s1.length();minlength=s2.length();
        }
        else{
            maxlength=s2.length();minlength=s1.length();
        }
        for(int i=0;i<minlength;i++){
            String a1  = Character.toString(s1.charAt(i));
            String a2 = Character.toString(s2.charAt(i));
            result=result.concat(a1);
            result=result.concat(a2);
        }
        if(s1.length()>s2.length()){
            result=result.concat(s1.substring(minlength));
        }
        else{
            result=result.concat(s2.substring(minlength));
        }
        System.out.println("merged string = "+result);
    }
}
