import java.util.Arrays;

public class ExpoSearch {

	public static  void main(String[] args){
	    int[] arr = {9,18,27,36,45};
	    int length= arr.length;
	    int value = 45;
	    int res = exponentialSearch(arr,length,value);

	    if(res<0){

	       System.out.println( "Element is not present in the array");

	    }else {

	        System.out.println( "Element is  present in the array at index :"+res);
	    }

	        }

	        public static int exponentialSearch(int[] arr ,int length, int value ){

	        if(arr[0]==value){
	            return 0;
	            }
	        int i=1;
	        while(i<length && arr[i]<=value){

	            i=i*2;
	        }
	        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
	        }


	}
