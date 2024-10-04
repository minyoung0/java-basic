package access;

public class Speaker {
    private int volume;
    //private은 이 클래스 내에서만 접근 가능
    //private->default(==package-private)같은 패키지안에서 호출은 허용한다)->protected(같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.->public

    Speaker(int volume){
        this.volume=volume;
    }

    void volumeUp(){
        if(volume>=100){
            System.out.println("음량을 증가할 수 없습니다. 최대 읍량입니다.");
        }
        else{
            volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

     void volumeDown(){
        volume-=10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
         System.out.println("현재 음량:"+volume);
     }
}
