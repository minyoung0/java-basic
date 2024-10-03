package pack;

import pack.a.*;
//*은 그 패키지안에 모든 클래스를 사용 가능
//만약 다른 패키지안에 같은 이름의 클래스가 있다면, 둘 중 하나는 pack.a.User or pack.b.User처럼 정확하게 불러와야

public class PackageMain3 {
    public static void main(String[] args) {
        Data data= new Data();
//        pack.a.User user= new pack.a.User();
        User user= new User();
        User2 user2 =new User2();

    }
}
