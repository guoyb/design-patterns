package cnblogs.test2;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 接收者角色，由录音机类扮演
 */
public class AudioPlayer {
    public void play(){
        System.out.println("播放...");
    }

    public void rewind(){
        System.out.println("倒带...");
    }
    public void stop(){
        System.out.println("停止...");
    }
}
