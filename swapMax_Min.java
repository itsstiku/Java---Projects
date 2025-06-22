//Swap max and min value of the given array...rest of the are unchanged
package DsaJavaSeries.ArraysProblems;

public class problem {
    public static void main(String[] args) {
        int[] arr={15,17,12,14,16,13};
        takeArray(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void  takeArray(int[] arr){
        int max=Integer.MIN_VALUE;//17
        int min=Integer.MAX_VALUE;//12
        int indexMax=0;//1
        int indexMin=0;//2
        for (int j=0;j< arr.length;j++) {
            if(arr[j]>max){
                max=arr[j];
                indexMax=j;
            }
             if(arr[j]<min){
                 min=arr[j];
                 indexMin=j;
             }
        }
        System.out.println(max);
        System.out.println(min);
        int temp=arr[indexMax];
        arr[indexMax]=arr[indexMin];
        arr[indexMax]=temp;

    }
}
