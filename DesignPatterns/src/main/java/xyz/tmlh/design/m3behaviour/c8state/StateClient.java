package xyz.tmlh.design.m3behaviour.c8state;


/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 *
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
//步骤 1
//创建一个接口。

interface State {
    void doAction(Context context);
}
//步骤 2
//创建实现接口的实体类。
class StartState implements State {

    public void doAction(Context context) {
        System.out.println("玩家处于Start State");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

class StopState implements State {

    public void doAction(Context context) {
        System.out.println("玩家处于Stop State");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
//步骤 3
//创建 Context 类。

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
