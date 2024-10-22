package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1=new Data1("A");
        System.out.println("A count="+data1.count);

        Data1 data2=new Data1("B");
        System.out.println("B count="+data1.count);

        Data1 data3=new Data1("C");
        System.out.println("C count="+data1.count);

        //각 인스턴스마다 count가 새로 초기화 되기 때문에 count가 1씩 증가되는것이 아니라 모두 1이 됨
    }


}
