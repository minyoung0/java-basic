package static2;

import java.util.Scanner;

public class DecoMain2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("입력하실 문자열은: ");
        String senten= scanner.nextLine();

        String deco= DecoUtil2.deco(senten);

        System.out.println("before: "+senten);
        System.out.println("after: "+deco);
    }
}
