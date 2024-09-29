package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;

        Student student2=new Student();
        student2.name="학생2";
        student2.age=16;
        student2.grade=50;



        Student[] student=new Student[2];//Student를 담을 수 있는 배열 생성, 해당 배열에 student1, student2 인스턴스를 보관한다.
        student[0]=student1;
        student[1]=student2;

        System.out.println("이름: "+student[0].name+", 나이: "+student[0].age+", 점수: "+student[0].grade);





    }
}
