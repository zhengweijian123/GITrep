package Practice;

public class test03 {
    //选择排序
    public static void SelectionSort(int[] arr) {
          //排除数组为空和只有一个数的情况
        if (arr == null || arr.length < 2) {
            return ;
        }
        //找到数组里的最小数
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            Exchange(arr,i,min);

        }
    }
    //交换数组中最小数和i的位置
    public  static void Exchange(int[] arr ,int i,int j){
        int tem=arr[j];
        arr[j]=arr[i];
        arr[i]=tem;
    }
    public static void main(String[] args) {
         int[] Arr={7,1,3,5,1,6,8,1,3,5,7,5,6};
        // System.out.print(SelectionSort(Arr));这样写是错误的因为void没有返回值，这样写打印不出来数值的值
        SelectionSort(Arr);
        for(int i:Arr){
            System.out.print(i+" ");
        }
    }
}
