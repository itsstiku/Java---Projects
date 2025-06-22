package DsaJavaSeries.ArraysProblems;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        //Simple way
       /* for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }*/
        
        //This is solved by two pointer concept
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
