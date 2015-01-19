package cnblogs.test2;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 具体命令角色类
 */
public class RewindCommand implements Command {
    private AudioPlayer myAudio;
    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.rewind();
    }
}
