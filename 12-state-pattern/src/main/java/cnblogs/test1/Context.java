package cnblogs.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Context {
    private State state;

    /// 定义Context的初始状态
    public Context(State state) {
        this.state = state;
    }

    /// 对请求做处理，并设置下一个状态
    public void Request() {
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
