import java.util.Scanner;
class OddEven {
     public static void main(String [] args){
        int n;
        int i;
        //Define a scanner class
        Scanner s = new Scanner(System.in);
        System.out.print("Enter thr number you want to enter in array: ");
        n= s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter your number: ");
        for( i= 0;i<n; i++)
        {
        a[i] = s.nextInt();
         s.close();
        }
        System.out.print("odd Numbers: ");
        for (i=0;i<n;i++){
            if( a[i] % 2 != 0){
            System.out.println(a[i]+" ");
        }
    }
     System.out.println(" ");
     System.out.println("Even Numbers: ");
       for( i=0; i<n; i++)
       {
        if (a[i] % 2 ==0)
        {
            System.out.println(a[i]+ " ");
        }
       }

     }
}
