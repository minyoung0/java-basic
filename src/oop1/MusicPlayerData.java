package oop1;

public class MusicPlayerData {
    int volume=0;
    boolean isOn=false;

    void on(){
        isOn=true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    void off(){
        isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: "+volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨: "+volume);
    }

    void showStatus(){
        System.out.println("현재 음악 플레이어의 상태: ");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: "+volume);
        }
        else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}