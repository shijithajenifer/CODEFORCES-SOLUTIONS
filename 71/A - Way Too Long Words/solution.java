import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=scan.next();
        }
        for(int i=0;i<n;i++){
            
        if(a[i].length()<=10){
            System.out.println(a[i]);
        }
        else{
            int num=a[i].length()-2;
            String res=a[i].charAt(0)+String.valueOf(num)+a[i].charAt(a[i].length()-1);
            System.out.println(res);
            }
        }
    }
}