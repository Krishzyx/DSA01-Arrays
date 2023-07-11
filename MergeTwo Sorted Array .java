import java.util.Scanner;

class Sorted{
    public static void merge(int arr1[],int arr2[],int n1,int n2,int arr3[]){
        int i=0,j=0,k=0;
        while( i<n1 && j<n2){
            if(arr1[i] < arr2[j])
             arr3[k++]=arr1[i++];
             else
             arr3[k++]=arr2[j++];
        }
        while( i< n1)
        arr3[k++]=arr1[i++];

        while( j<n2)
        arr3[k++]=arr2[j++];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1=4;
       int arr1[]={12,18,40,60};
        int n2=4;
       int arr2[]={47,56,89,90};

       System.out.print("First array is: ");
       for(int i=0;i<n1;i++)
        System.out.print(arr1[i]+ " ");

        System.out.print("/n Second array is: ");
       for(int i=0;i<n2;i++)
        System.out.print(arr2[i]+ " ");

        int arr3[]=new int [n1+n2];
        merge(arr1, arr2, n1, n2, arr3);

        System.out.print("/nAfter merge: ");
        for(int i=0; i<n1+n2; i++)
        System.out.print(arr3[i] + " ");

        sc.close();
       
    } 
}
