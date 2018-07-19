package com.CS5343;

public class LinkedList {

    public Node rinsert(Node head, int data)
    {
        if(head==null)
        {
            Node node = new Node();
            node.data = data;
            node.next = null;
            return node;
        }
        else if(head.next==null)
        {

            Node node = new Node();
            node.data = data;
            node.next = null;
            head.next = node;
            return node;
        }
        else
        {
            //Node tmp = head;
           return rinsert(head.next, data);
        }
    }

    public void rprint(Node head)
    {
        if(head.next!=null)
        {
            System.out.print(head.data+",");
            rprint(head.next);
        }
        else
        {
            System.out.println(head.data);
        }
    }

    public Node selectionsort(Node head)
    {
        if(head==null)
        {
            return head;
        }
        else
        {
            Node tmp = head;
            Node bmin = head;
            Node min=head;
            while(head.next!=null)
            {
                if(head.next.data < min.data)
                {
                    bmin = head;
                    min=head.next;
                    //System.out.println(bmin.data);
                }
                head = head.next;
            }
            if(min!=tmp) {
                tmp = swap(bmin, tmp);
            }
            tmp.next = selectionsort(tmp.next);
            return tmp;
        }

    }

    public Node swap(Node bmin, Node head)
    {
        Node tmp2;
        //tmp1 = head.next;
        tmp2 = bmin.next;
        //head.next = tmp2.next;
        bmin.next = tmp2.next;
        tmp2.next = head;
        return tmp2;

    }
}
