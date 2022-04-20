import java.util.Scanner;
public class input {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a>b && a>c){
            System.out.println(a + " a is the graetest");
        }
        else if(a>b && a<c){
            System.out.println(c + " c is the greatest");
        }else{
            System.out.println(b + " b is the greatest");
        }

        //System.out.println(sum);
        scn.close();
    }
}
