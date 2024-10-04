package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker=new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume필드 직접 접근 수정");
//        speaker.volume=200;
        //volume을 private으로 설정해놔서 접근 불가능.
        //volume has private access i access Speaker.volume
        speaker.showVolume();
    }
}
