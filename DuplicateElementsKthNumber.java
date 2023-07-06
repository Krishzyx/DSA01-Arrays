class Duplicate{
    public static boolean CheckDuplicateWithinK( int arr[],int n,int k)
    {
        //Traversing the input array
        for(int i=0; i<n;i++){
            int j = i+1;
            int range = k;
             
            //Search in next k-1 elements if its duplicate is present or not 

            while (range > 0 && j< n){
                if (arr[i] == arr[j]) {
                    return true;
                }
                j++;
                range--;
            }
        }
        return false;

    }
    //Driver code to test above method
    public static void main (String [] args )
    {
        int [] arr = { 10,5,3,4,3,5,6};
        int n = arr.length;
        if(CheckDuplicateWithinK(arr,n,3))
        {
            System.out.print("yes");

        }
        else {
            System.out.println("No");
        }
    }
}
