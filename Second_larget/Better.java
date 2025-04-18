public class Better 
{
    public static int betterApproach() 
    {
        int arr[] = {5, 2, 9, 1, 5};
        if (arr.length < 2) 
        {
            System.out.println("Second largest element not found (Array has less than 2 elements)");
            return -1;
        }
        int largest = arr[0];
        for (int num : arr) 
        {
            if (num > largest) 
            {
                largest = num;
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        boolean found = false;
        for (int num : arr) 
        {
            if (num != largest && num > secondLargest) 
            {
                secondLargest = num;
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("Second largest element not found (All elements may be same)");
            return -1;
        } else 
        {
            System.out.println("Second largest element is: " + secondLargest);
            return secondLargest;
        }
    }


    public static void main(String[] args) 
    {
        betterApproach();
        
    }
    
}
