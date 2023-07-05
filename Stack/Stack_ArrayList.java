package com.company.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_ArrayList {

    public static class stack
    {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty()
        {
            if(list.size() == 0)
            {
                return true;
            }
            return false;
        }
        public void push(int data)
        {
            list.add(data);
        }

        public int pop()
        {
            if(isEmpty()) {
                return -1;
            }
            int top =list.remove(list.size()-1);
            return top;
        }

        public int peek()
        {
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
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
