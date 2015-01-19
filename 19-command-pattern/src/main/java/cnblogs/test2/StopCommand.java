package cnblogs.test2;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 具体命令角色类
 */
public class StopCommand implements Command {
    private AudioPlayer myAudio;
    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }
}
