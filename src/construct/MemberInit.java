package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember( String name, int age, int grade) {
        //name = name 위의 name과 메서드의 name이 같음. 이런 경우에 가까운 위치에 있는 변수를 가리키기 때문에 둘다 매개변수
        this.name = name;
        //this를 사용하면 내 자신의 인스턴스에 있는 변수를 가리킴
        this.age = age;
        this.grade = grade;

        //변수를 찾을 때 가까운 지역변수(매개변수도 지역변수임)를 먼저 찾고 없으면 그 다음으로 멤버변수를 찾는다. 멤버변수도 없으면 오류가 발생
        //MemberThis 참조
    }
}
