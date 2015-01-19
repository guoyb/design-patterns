package cnblogs.test2;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 系统需要一个代表宏命令的接口，以定义出具体宏命令所需要的接口。
 */
public interface MacroCommand extends Command {
    /**
     * 宏命令聚集的管理方法 * 可以添加一个成员命令
     */
    public void add(Command cmd);
    /**
     * 宏命令聚集的管理方法 * 可以删除一个成员命令
     */
    public void remove(Command cmd);
}
