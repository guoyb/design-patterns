package cnblogs.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 具体的宏命令MacroAudioCommand类负责把个别的命令合成宏命令。
 */
public class MacroAudioCommand implements MacroCommand {
    private List<Command> commandList = new ArrayList<Command>();
    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }
    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        for(Command cmd : commandList){
            cmd.execute();
        }
    }
}
