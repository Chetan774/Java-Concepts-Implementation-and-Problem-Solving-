package com.company.Stack;

public class Stack_LinkedList {
    private static class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static class stack
    {
        public static node head = null;
        public static void push( int data)
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

        public static boolean isEmpty()
        {
            return head == null;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            node top = head;
            head = head.next;
            return top.data;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            node top = head;
            return  top.data;

        }

    }

    public static void main(String[] args)
    {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
