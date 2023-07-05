package com.company.stringLevel1;

import java.util.Scanner;

public class ChangeTheCaseOfCharactersInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(toogleCase(str));
    }
    public static String  toogleCase(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++)
        {
          int ch = sb.charAt(i);
          if(ch >= 'a' && ch<='z')
          {
              char uch = (char)('A'+ch-'a');
              sb.setCharAt(i,uch);
          }
          else if(ch >= 'A' && ch <= 'Z')
          {
              char lch = (char)('a'+ch-'A');
              sb.setCharAt(i,lch);
          }
        }
        return sb.toString();
    }
}
