import java.util.*;
class ChoclateProblem{
    //arr[o.....n-1] represnts size of packets m is number of students returns minimum differnece between maximum and muinimum values of distribution.

static int findMinDiff( int  arr[], int n, int m )
{
     //if there is no choclate tor the stidents is 0

     if (m == 0 || n==0)
     return 0;

     Arrays.sort(arr);

     //number of students can not be more than number of packets
     if (n<m)
     return -1;

     // largest number of choclates 
     int min_diff = Integer.MAX_VALUE;

     // find the subarray of size m such that differnece between last and first elements of subarray when sorted is minimum. 

     for (int i =0; i+m-1 < n;i++){
        int diff = arr[ i+m-1] - arr[i];
        min_diff = diff;
     }
     return min_diff;
}
   public static void main (String [] args)
   {
    int arr[] = {12,34,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};

    int m= 7;  //number of students
    int n = arr.length;
    System.out.println("Minimum Differnece is " + findMinDiff(arr, n, m));

   }

}
