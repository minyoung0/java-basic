package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;// 학생을 담을 수 있는 변수 student를 선언
        student1 = new Student(); //Student 클래스를 실제로 쓸 수 있는 메모리를 만듦
        //객체 또는 인스턴스라고 함
        //클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 함.
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;

        Student student2=new Student();//객체 or 인스턴스

        //student1 객체는 Student 클래스의 인스턴스다.

        //new는 새로 생성한다는 뜻. new Student()는 Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻.
        //이렇게 하면 메모리에 실제 Student 객체를 생성한다.
        //Student클래스는 String name, int age, int grade 멤버 변수를 가지고 있다. 이 변수를 사용하는데 피룡한 메모리 공간도 함께 확보.


        student2.name="학생2";
        student2.age=16;
        student2.grade=80;


        //여기서는 Student 클래스를 기반으로 student1, student2 객체 또는 인스턴스를 만들었다.


        System.out.println("이름: "+student1.name+", 나이: "+student1.age+", 성적: "+student1.grade);
        System.out.println("이름: "+student2.name+", 나이: "+student2.age+", 성적: "+student2.grade);
        System.out.println(student1);
    }

}
