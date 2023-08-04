public class SelectionSort {

    public static void main(String[] args) {

    int[] arr = {15,4,32,47,5,1,19,26};
    int length = arr.length;
    SelectionSort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
     }

    public static void SelectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNo = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNo;
        }

    }
}
