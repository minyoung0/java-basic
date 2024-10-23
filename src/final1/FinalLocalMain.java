package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1=10;//최초 한번만 할당가능
        //data1=20; ->컴파일 오류


        //final 지역변수2
        final int data2=10;
        method(10);
    }

    static void method(final int parameter) {
        //parameter=20; -> method호출할 때 이미 할당이 되었기 때문에 다시 값을 부여할 수 없음.


    }
}
