public class problem2 {
    public int getMax(int arr[])
    {
        int size= arr.length;
        int max=arr[0];
        for (int i=0 ;i <size;i++)
        {
           if (arr[i]>max)
           {
               max=arr[i];
           }
        }
        return max;
    }
    public int getMin(int arr[])
    {
        int size= arr.length;
        int min=arr[0];
        for (int i=0 ;i <size;i++)

        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
