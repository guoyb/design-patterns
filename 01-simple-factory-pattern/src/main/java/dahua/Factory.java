package dahua;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Factory {

    public void doCount(Double operA, Double operB, String sign){
        Count count = null;
        switch (sign){}
        /*switch(sign){
            case "+" : count = new Add();
                break;
            case "-" : count = new Less();
                break;
            case "*" : count = new Multiplication();
                break;
            case "/" : count = new Division();
                break;
            default : count = new DefaultCount();
                break;
        }*/

        count.doCount(operA, operB);
    }
}
