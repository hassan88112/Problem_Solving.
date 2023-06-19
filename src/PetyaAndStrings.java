import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String c1=input.nextLine().toLowerCase();      //     abs      1 < 2 == -1 || 1 > 2 == 1 || 1 = 2 == 0
        String c2=input.nextLine().toLowerCase();      //     Abz

        for (int i = 0 ;i < c1.length() ;i++){
            char v1=c1.charAt(i);
            char v2=c2.charAt(i);
            if (v1 < v2){
                System.out.println("-1");
                return;
            } else if (v1 > v2) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
}
