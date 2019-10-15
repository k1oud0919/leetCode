package algorithm;

public class SortRange {

    private int [] arr = {31,55,48,333,27,89,5,67,8,3,1};
    private int size = arr.length;

    /**
     * 我的吗呀，为毛我还能写出这种脑残的swap函数。
     *  记住这句话====================》形参实际上是引用的一个副本
     *  要想真的swap，要放到数组里操作。
     */
    public static void swap(int a,int b){
        int tmp ;
        tmp = a;
        a = b;
        b = tmp;
    }

    public static void swap2(){

    }

    /**
     * n个元素的数组，进行n-1次遍历，每一次遍历都取出添加到左边。
     * 第一种排序，选择排序
     */
    public void selectionSort(int []arr){

        for(int i=0;i<size;i++){
            int minIndex = i;
            //以后理解了，这种嵌套循环，第二层j=i，说明是从当前元素开始遍历比较
            for(int j=i;j>0;j--){
                if(arr[j]<arr[minIndex]){
                    /**
                     * 找出了第i次循环最小索引minIndex，说明arr[minIndex]是本轮循环中最小的元素了，
                     * 跟arr[i]交换就可以了
                     */
                    minIndex = j;
                }
            }
            //找出一轮循环最小值，跟arr[i]交换就行了
            //swap2();
        }

    }

    /**
     * 第二种，插入排序
     */
    public  void insertionSort(int []arr){

    }

    /**
     * 第三种，冒泡排序
     */
    public void bubbleSort(){

    }

    /**
     * 第四种，归并排序
     */
    public void mergeSort(){}

    /**
     *第五种，快速排序
     */
    public void quickSort(){}


    public static void main(String[] args) {
        int a = 10;
        int b = 555;
        swap(a,b);
        System.out.println(a + ","+b);
    }
}
