
class rotate{
     static int N=4;

    static void rotate90Clockwise(int arr[][]){
        //printting the elements on the basis of Obeservation

        for (int j=0; j<N; j++){
          for(int i=N-1; i>=0; i--)
          System.out.print(arr[i][j] + " ");
             System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] =  {{ 1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16} };
            rotate90Clockwise(arr);            
    }
}
