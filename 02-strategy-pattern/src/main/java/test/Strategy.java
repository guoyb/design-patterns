package test;

import dahua.cashSuperImpl.CashNormal;
import dahua.cashSuperImpl.CashRebate;
import dahua.cashSuperImpl.CashReturn;
import dahua.CashSuper;

/**
 * Created by guoyibin on 14/12/26.
 */
public interface Strategy {
    public void AlgorithmInterface();
}

class ConcreteStrategyA implements Strategy{
    public void AlgorithmInterface() {
        System.out.println("算法A实现");
    }
}

class ConcreteStrategyB implements Strategy{
    public void AlgorithmInterface() {
        System.out.println("算法B实现");
    }
}

class ConcreteStrategyC implements Strategy{
    public void AlgorithmInterface() {
        System.out.println("算法C实现");
    }
}
/**
 * 上下文
 * */
class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}

class Main{
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}

class CashContext{
    CashSuper cs = null;
    public CashContext(String type){
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn();
                break;
            case "打8折":
                cs = new CashRebate();
                break;
        }
    }

    public double getResult(double price, int num){
        return cs.acceptCash(price, num);
    }
}