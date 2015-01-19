package csdn.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Context{

    private Map valueMap = new HashMap();

    public void addValue(Variable x , int y){
        Integer yi = new Integer(y);
        valueMap.put(x , yi);
    }

    public int LookupValue(Variable x){
        int i = ((Integer)valueMap.get(x)).intValue();
        return i ;
    }

}
