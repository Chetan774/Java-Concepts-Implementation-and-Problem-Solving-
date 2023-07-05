package com.company.LinkedList;

public class LinkedListScratch
{

    node head;
    private int size;

    LinkedListScratch()
    {
        size = 0;
    }
    public class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }


        public  void InsertAtFirst(int data)
        {
            node newNode = new node(data);
            if(head == null)
            {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void InsertAtLast(int data)
        {
            node newnode = new node(data);
            if (head == null)
            {
                head = newnode;
                return;
            }

            node currentnode = head;
            while (currentnode.next != null)
            {
                currentnode = currentnode.next;
            }

            currentnode.next = newnode;
        }
        public void RemoveFirst()
        {
            if(head == null)
            {
                System.out.println("List is empty ");
                return;
            }
            head = head.next;
            size--;
        }

        public void Removelast()
        {
            if(head == null)
            {
                System.out.println("List is empty ");
                return;
            }

            size--;

            if(head.next == null )
            {
                head = null;
                return;
            }

            node LastSecond = head;
            node LastNode = head.next;
            while (LastNode.next != null)
            {
                LastSecond = LastSecond.next;
                LastNode = LastNode.next;
            }

            LastSecond.next = null;
        }

        public void InsertAtMiddle(int data, int index)
        {
            node newnode = new node(data);
            if(index > size || index  < 0)
            {
                System.out.println("Invalid Index ");
            }

            if(head == null || index == 0)
            {
                newnode.next = head;
                head = newnode;
                return;
            }


          node currentnode = head;
          node currentnext = head.next;

            for (int i = 1; i < index; i++)
            {
                currentnode = currentnode.next;
                currentnext = currentnext.next;
            }
            currentnode.next = newnode;
            newnode.next = currentnext;
        }
        public  void display()
        {
            node currentnode = head;
            while (currentnode != null)
            {
                System.out.println(currentnode.data);
                currentnode = currentnode.next;
            }
        }
        public int getSize()
        {
            return size;
        }

        public static void main(String[] args)
        {
            LinkedListScratch list = new LinkedListScratch();
            list.InsertAtFirst(10);
            list.InsertAtFirst(20);
            list.InsertAtFirst(40);
            list.display();
            list.InsertAtMiddle(30,1);
            System.out.println();
            list.display();

            System.out.println(list.getSize());

        }

}
