package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자
    //생성자의 이름은 클래스 이름과 같아야한다
    //생성자는 반환 타입이 없다. 비워둬야 한다.
    //나머지는 매서드와 같다.
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= "+name+", age="+age+", grade= "+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }


    //클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하느 코드가 없는 기본 생성자를 만듦
    //MemberInit(){
    // }
    //단 생성자가 하나라도 있으면 기본생성자를 생성하지 않음.

    //생성자 추가==생성자 오버로
    MemberConstruct(String name, int age){
//        this.name=name;
//        this.age=age;
//        this.grade=50;
        this(name,age,50);//생성자 내부에서 자신의 생성자를 호출할 수 있음

    }


}

