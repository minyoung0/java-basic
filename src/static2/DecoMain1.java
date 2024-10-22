package static2;

import java.util.Scanner;

public class DecoMain1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("입력하실 문자열은: ");
        String senten= scanner.nextLine();

        DecoUtil1 util=new DecoUtil1();
        String deco= util.deco(senten);

        System.out.println("before: "+senten);
        System.out.println("after: "+deco);
    }
}
