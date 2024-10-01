package oop1;

import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MusicPlayerData data= new MusicPlayerData();

        System.out.println("--------------");
        System.out.println("MUSIC PLAYER");
        System.out.println("--------------");



        while(true){
            System.out.println("1.ON | 2. 노래 재생 | 3. 볼륨 증가 | 4. 볼륨 감소 | 5. 플레이어 상태 | 6. OFF ");
            int number=scanner.nextInt();

            if(number==1){
                data.on();
            }
            else if(number==2){
                System.out.println("음악 재생을 시작합니다.");
            }
            else if(number==3){
                if(data.volume<10){
                    data.volumeUp();
                }
                else{
                    System.out.println("볼륨이 너무 큽니다. ");
                    System.out.println("메인 화면으로 돌아갑니다.");
                    continue;
                }
            }
            else if(number==4){
                if(data.volume>0){
                    data.volumeDown();
                }
                else{
                    System.out.println("더 이상 볼륨을 낮출 수 없습니다.");
                    System.out.println("메인 화면으로 돌아갑니다.");
                }
            }
            else if(number==5){
                data.showStatus();
            }
            else if(number==6){
                data.off();
                break;
            }
            else{
                System.out.println("올바른 번호를 입력하세요");
                continue;
            }
        }


    }
}
