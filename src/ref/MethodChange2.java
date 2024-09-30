package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA=new Data();
        dataA.Value=10;
        System.out.println("메서드 호출 전: dataA.Value="+dataA.Value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.Value="+dataA.Value);
    }
    static void changeReference(Data dataX){
        dataX.Value=20;
    }
}
