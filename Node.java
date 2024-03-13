
package NoderNeder;

public class Node<T>
{
    private T value;
    private Node<T> next;
    /* הפעולה בונה ומחזירה חוליה שהערך שלה הוא info ואין לה חוליה עוקבת **/
    public Node(T info)
    {
        this.value = value;
        this.next = null;
    }
    /*הפעולה בונה ומחזירה חוליה, שהערך שלה הוא info
      והחוליה העוקבת לה היא החוליה next */
    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }
    /* הפעולה מחזירה את הערך של החוליה הנוכחית **/
    public T getValue()
    {
        return this.value;
    }
    /* הפעולה מחזירה את החוליה העוקבת לחוליה הנוכחית **/
    public Node<T> getNext()
    {
        return this.next;
    }
    /* הפעולה קובעת את ערך החוליה הנוכחית להיות  info **/
    public void setValue(T info)
    {
        this.value = value;
    }
    /* הפעולה קובעת את החוליה העוקבת לחוליה הנוכחית להיות החוליה next **/
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    /* הפעולה מחזירה מחרוזת המתארת את החוליה הנוכחית */


    public  String ToString()
    {
        return this.value.toString();
    }
}//Class