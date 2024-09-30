package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.Value = 10;
        Data dataB = dataA;

        System.out.println();
        System.out.println("dataA 참조값: "+dataA);
        System.out.println("dataB 참조값: "+dataB);
        System.out.println("dataA.value= "+dataA.Value);
        System.out.println("dataB.value= "+dataB.Value);

        dataA.Value=20;
        System.out.println("dataA.value= "+dataA.Value);
        System.out.println("dataB.value= "+dataB.Value);

        dataB.Value=30;
        System.out.println("dataA.value= "+dataA.Value);
        System.out.println("dataB.value= "+dataB.Value);
    }
}
