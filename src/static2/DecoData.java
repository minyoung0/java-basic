package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        //instanceValue++;//인스턴스 변수 접근, Compile error
        //instanceMethod();//인스턴스 메서드 접근, Compile error

        staticValue++;//정적변수에 접근
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        //참조값이 있어서 가능함.
        data.instanceValue++;
        data.instacemethod();
    }

    public void instatnceCall() {
        instanceValue++;
        instacemethod();

        staticValue++;
        staticMethod();
    }

    private void instacemethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
