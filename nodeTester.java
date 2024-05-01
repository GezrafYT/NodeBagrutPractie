import java.util.LinkedList;

public class Tester
{
    public static int sumArray(int[] a, int i, int sum)
    {
        if (i < a.length)
        {
            sum += a[i];
            return sumArray(a, i + 1, sum);
        }

        return sum;
    }

    public static void q1(int[] arr, int i, int k, int x)
    {
        if(k <= 9)
        {
            if (arr[i] % 10 == k || arr[i] % x == 0)
            {
                System.out.println(arr[i]);
            }

            q1(arr, i + 1, k, x);
        }
    }


    public static int q2(int[] arr, int i,  int k, int count)
    {
        if (i < arr.length) {
            if (arr[i] == k) {
                count++;
            }

            return q2(arr, i + 1, k, count);
        }

        return count;
    }

    public static int q3(Node<Integer> n, int i, int length, int sum)
    {
        Node<Integer> pos = n;
        Node<Integer> pos2 = n;
        int num = 0;
        while(pos != null)
        {
            length ++;
            
            pos = pos.getNext();
        }
        q3(n, i, length, sum);
        
        
    }

    public static void main(String[] args)
    {
        int k = 2;
        int count = 0;
        int[] arr = {25, 33, 52, 26, 92, 59, 76, 19, 20, 43};

//        q1(arr, 0, 2, 4);
//        System.out.println(sumArray(arr, 0, 0));
//        System.out.println(q2(arr, 0, 0, 0));
    }
}
