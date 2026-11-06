import java.util.*;
public class Helpfulmaths{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String S=scan.nextLine();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) >='1' && S.charAt(i) <='3'){
                sb1.append(S.charAt(i));
            }   
        }
        char[] arr=sb1.toString().toCharArray();
        Arrays.sort(arr);
        StringBuilder sb2=new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb2.append(arr[i]);
            if(i < arr.length - 1) {
                sb2.append("+");
            }
        }
        System.out.println(sb2);
    }
}