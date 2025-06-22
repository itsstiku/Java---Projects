//Find out the index no of the largest and smallest value ofthe given array
package DsaJavaSeries;
public class Arrays {
    public static void main(String[] args) {
        int[] arr={10,20,13,26,4,7,8,6,3,16};

        //Takes Smaller value and its Index
        int smallValue=Integer.MAX_VALUE;
        int storeIndexSmallValue=0;

        //Takes Largest value and its Index
        int largeValue=Integer.MIN_VALUE;
        int storeIndexLargeValue=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largeValue){
                largeValue=arr[i];
                storeIndexLargeValue=i;
            }

            if(arr[i]<smallValue){
                smallValue=arr[i];
                storeIndexSmallValue=i;
            }
        }
        System.out.println("Index no of an Largest Value is: "+storeIndexLargeValue);
        System.out.println("Index no of an Smallest Value is: "+storeIndexSmallValue);
    }
}
