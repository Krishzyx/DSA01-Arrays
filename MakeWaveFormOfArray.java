public class ArrayWaveForm {
    public static void MakeWaveArray(int n,int a[])
    {
        int temp;
        int i,j;
        for(i=0;i<n-1;i++){
            for( j=i+1;j<n;j++)
            {
              if (a[i]>a[j])
            {
            temp= a[i];
            a[i]=a[j];
            a[j]=temp;
            }
        }
    }
    for (  i=0; i<n; i +=2)
    {
       if (i < n-1)
       {
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
       }
    }
    System.out.print("Array in Waveform Pattern: ");
    for (int ele: a)
    {
       System.out.print(ele + " ");
    }
    }

    public static void main(String [] args){
        int a[] = {5,8,1,4,3,2,7};
        int n = a.length;
        MakeWaveArray(n,a);
    }
}
