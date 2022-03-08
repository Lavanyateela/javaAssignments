public class SListIterator<T>{
    SList<T> head;
    SList<T> tail;
    SList<T> curr;

    public SListIterator(SList<T> obj)
    {
        this.head=obj;
        this.tail=obj;
        this.curr=obj;
    }

    public void insert(T data)
    {
        SList<T> newnode  = new SList<>(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            curr=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void remove()
    {
        if(head==null)
        {
            System.out.println("List empty");
        }
        else
        {
            System.out.println("Removed element "+head.data);
            if(curr==head)
            {
                curr=curr.next;
            }
            head=head.next;
        }
    }

    public boolean hasNext()
    {
        return curr!=null;
    }

    public T next()
    {
        T temp=curr.data;
        curr=curr.next;
        return temp;
    }
}
