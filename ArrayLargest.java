//Find out the Smallest & largest value from the arry.

package DsaJavaSeries;
public class Arrays {
    public static void main(String[] args) {
        int[] arr={10,20,13,26,4,7,8,6,3,16};
        int smallNo=Integer.MAX_VALUE;
        int largeNo=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           smallNo=Math.min(arr[i],smallNo);
           largeNo=Math.max(arr[i],largeNo);
        }
        System.out.println("Smallest Value is: "+smallNo);//3
        System.out.println("Largest Value is: "+largeNo);//26
    }
}
