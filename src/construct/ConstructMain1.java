package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1=new MemberConstruct("user1",15,90);
        MemberConstruct member2=new MemberConstruct("user2",18,80);
        //생정자 장점: 객체 생성 후에 메서드를 한번 더 호출해야하는데 생정자를 사용하면 객체 생성과 동시에 매서드를 호출할 수 있음.


        MemberConstruct[] members={member1,member2};

        for(MemberConstruct member: members)
        {
            System.out.println("이름: "+member.name+",나이 : "+member.age+", 성적: "+ member.grade );
        }
    }
}
