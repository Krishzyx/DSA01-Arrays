class Sort{
    public static void main(String args)
    // Initialize the array
    {
        int [] arr = new int[] {10,30,20,50,40};
        int temp = 0;  
    
// Sort the array in ascending Order 

for( int i =0; i<arr.length; i++){
    for( int j=i+1; j<arr.length;j++)
     { 
        if (arr[i]>arr[j])
        {
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
      }
     }
    }
//Displaying array after sorting 
for ( int i=0; i<arr.length;i++){
System.out.print(arr[i] + " ");
}
}
}
