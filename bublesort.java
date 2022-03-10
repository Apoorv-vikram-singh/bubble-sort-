import java.util.*;
public class bublesort
{
   public int[] bublesort(int arr[],int loop,int i,int j)
   {
        for(i=0;i<loop-1;i++)//{5,6,7,9,10}
        {
            for(j=0;j<loop-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
            
        }
        return arr;
    }
        public static void main(String args[])
        {
            bublesort obj=new bublesort();
            Scanner sc=new Scanner(System.in);
            int temp=0;
            int j=0;
            int i=0;
            int arr[]=new int[100];
            int loop=sc.nextInt();
            for(i=0;i<loop;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result[]=obj.bublesort(arr, loop, i, j);
            for(i=0;i<loop;i++)
            {
                System.out.print(result[i]+"  ");
            }
        }
}