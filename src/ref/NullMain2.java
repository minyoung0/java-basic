package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data=null;
        data.Value=10;//NullPointerException 예외 발생 --> null.Value
        System.out.println("data="+data.Value);

    }
}
