package csdn;

/**
 * Created by guoyibin on 15/1/6.
 */
public abstract class AbstractSort {
    /**
     * 将数组array由小到大排序
     * @param array
     */
    protected abstract void sort(int[] array);


    public void showSortResult(int[] array){
        this.sort(array);
        System.out.print("排序结果：");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
