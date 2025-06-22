//Find largest value from the arry
package DsaJavaSeries;

public class Arrays {
    public static void main(String[] args) {
        int[] arr={10,20,13,26,4,7,8,6,3,16};
        int smallNo=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>smallNo){
               smallNo=arr[i];
           }
        }
        System.out.println("Smallest Value is:"+smallNo);
    }
}
