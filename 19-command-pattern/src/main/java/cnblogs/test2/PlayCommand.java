package cnblogs.test2;

/**
 * Created by guoyibin on 15/1/16.
 * 具体命令角色类
 */
public class PlayCommand implements Command {
    private AudioPlayer myAudio;
    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }
}
