 class Element
{
    
    public static int findMajoriytElement(int n, int [] arr)
    {
        int candidate = 0;
        int count = 0;
        
        for(int i  = 0; i < n; i++)
        {
            if(count == 0)
            {
                candidate = arr[i];
                count = 1;
            }
            else if(arr[i] == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        
        count = 0;
        for(int i =0; i < n; i++)
        {
            if(arr[i] == candidate)
            {
                count++;
            }
        }
        
        if((count >= n/2 && n%2 == 0) || (count > n/2 && n%2 != 0))
        {
            return candidate;
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4,3};       
        int n = arr.length;
        int majorityElement = findMajoriytElement(n, arr);
        if(majorityElement != -1)
        {
            System.out.print("Majority element is : " + majorityElement);
        }
        else
        {
            System.out.print("No majority element found");
        }
    }
}
