import java.util.*;
public class Array1

{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<n;i++)
        arr[i]=sc.nextInt();
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            int temp =arr[1];
            arr[1]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
         
    }
}