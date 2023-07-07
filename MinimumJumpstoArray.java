
class Jump{
    static int minJumps(int arr[],int l,int h)
    {
        if (h==l)
        return 0;
     
        if (arr[l]==0)
        return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for(int i= l+1;i<=h && i <= l+ arr[l];i++){
            int jumps = minJumps(arr, l, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min  )
            min = jumps +1;
        }
        return min;


    }
    //Driver code 
    public static void main (String [] args){
        int arr[] = {1,2,5,8,9,2,6,7,6,8,9};
        int n = arr.length;
        System.out.println("Minimum number of jumps to reach end is " + minJumps(arr, 0, n-1));
    }

}
