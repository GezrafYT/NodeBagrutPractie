package NoderNeder;
import java.util.LinkedList;

public class nodeTester {

    public static int biggestNum(Node<Integer> n)
    {
        Node<Integer> pos = n;
        int num = 0;
        int max = 0;
        while(pos != null)
        {
            num = pos.getValue();
            if (num > max)
            {
                max = num;
            }

            pos = pos.getNext();
        }

        return max;
    }


    public static boolean kStringsCheck(Node<String> n, String s, int k)
    {
        int sum = 0;
        String text = "";
        Node<String> pos = n;
        while(pos!=null)
        {
            text = pos.getValue();

            if(text.equals(s))
            {
                sum ++;
            }

            pos = pos.getNext();
        }

        if (sum == k)
        {
            return true;
        }

        return false;
    }

    public static int size(Node<Integer> n)
    {
        int nodeCount = 0;
        Node<Integer> pos = n;

        while(pos!= null)
        {
            nodeCount++;

            pos = pos.getNext();
        }

        return nodeCount;
    }


    public static int sum(Node<Integer> n)
    {
        int nodeValueSum = 0;

        Node<Integer> pos = n;

        while(pos!=null)
        {
            nodeValueSum += pos.getValue();

            pos = pos.getNext();
        }

        return nodeValueSum;
    }


    public static boolean isSorted(Node<Integer> n)
    {
        Node<Integer> pos = n;
        boolean sorted = true;
        int num = 0;
        while(pos!= null)
        {
            num = pos.getValue();
            if(num > pos.getNext().getValue())
            {
                sorted = false;
            }

            pos = pos.getNext();
        }

        return sorted;
    }

    public static boolean memberEqualSum(Node<Integer> n)
    {
        Node<Integer> pos = n;
        int num = 0;
        boolean flag = false;
        while(pos!=null)
        {
            num = pos.getValue();
            pos = pos.getNext();
            if (num == sum(pos))
            {
                flag = true;
            }
        }

        return flag;
    }

    public static boolean evenAndHalves(Node<Integer> n)
    {
        int nodeSize = size(n);
        Node<Integer> pos = n;
        boolean evenFlag = (nodeSize % 2 == 0);
        boolean halfFlag = true;
        int num = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i<(nodeSize) / 2; i++)
        {
            sum1 += pos.getValue();
            pos = pos.getNext();
        }

        for (int j = 0; j <(nodeSize) / 2; j++)
        {
            sum2 += pos.getValue();
            pos = pos.getNext();
        }

        if(sum1 == sum2 && evenFlag)
        {
            return true;
        }
        return false;

    }

    public static int smaller(int n1, int n2) // פונקציית עזר לפונקציה uniteSortedNodes
    {
        if (n1 < n2)
        {
            return n1;
        }

        else if (n2 < n1)
        {
            return n2;
        }

        else
        {
            return n1;
        }
    }

    public static int bigger(int n1, int n2) // פונקציית עזר לפונקציה uniteSortedNodes
    {
        if (n1 > n2)
        {
            return n1;
        }

        else if (n2 > n1)
        {
            return n2;
        }

        else
        {
            return n1;
        }
    }

    public static LinkedList<Integer> uniteSortedNodes(Node<Integer> n1, Node<Integer> n2)
    {
        int nodeSize = size(n1);
        int smallerNum = 0;
        Node<Integer> pos1 = n1;
        Node<Integer> pos2 = n2;
        LinkedList<Integer> unitedQueue = new LinkedList<Integer>();

        for(int i = 0; i<nodeSize; i++)
        {
            if (smaller(pos1.getValue(), pos1.getNext().getValue()) < smaller(pos1.getValue(), pos2.getValue()))
            {
                unitedQueue.add(smaller(pos1.getValue(), pos1.getNext().getValue()));
                unitedQueue.add(smaller(pos1.getValue(), pos2.getValue()));
                unitedQueue.add(bigger(bigger(pos1.getValue(), pos1.getNext().getValue()), pos1.getValue()), pos2.getValue());
            }

            else if (smaller(pos1.getValue(), pos2.getValue()) < smaller(pos1.getValue(), pos1.getNext().getValue()))
            {
                unitedQueue.add(smaller(pos1.getValue(), pos2.getValue()));
                unitedQueue.add(smaller(pos1.getValue(), pos1.getNext().getValue()));
                unitedQueue.add(bigger(bigger(pos1.getValue(), pos1.getNext().getValue()), pos1.getValue()), pos2.getValue());
            }

            pos1 = pos1.getNext();
            pos2 = pos2.getNext();
        }

        return unitedQueue;
    }
}
