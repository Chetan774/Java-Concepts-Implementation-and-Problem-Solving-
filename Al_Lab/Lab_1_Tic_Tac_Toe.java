package com.company.Al_Lab;

import java.util.Random;
import java.util.Scanner;

public class Lab_1_Tic_Tac_Toe
{
    public static void main(String[] args)
    {
        char board[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        Scanner scanner = new Scanner(System.in);

        printBoard(board);
        while (true)
        {
            playerTurn(board, scanner);

            if (isGameFinished(board))
            {
                break;
            }

            printBoard(board);

            computerTurn(board);

            if (isGameFinished(board))
            {
                break;
            }

            printBoard(board);
        }
        scanner.close();
    }

    // checking is game finished?
    private static boolean isGameFinished(char[][] board)
    {
        if (hasContestantWon(board, 'X'))
        {
            printBoard(board);
            System.out.println("Player wins!");
            return true;
        }
        if (hasContestantWon(board, 'O'))
        {
            printBoard(board);
            System.out.println("Computer wins!");
            return true;
        }
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }

    // checking - which symbol has completed the line
    private static boolean hasContestantWon(char[][] board, char symbol)
    {
        if ((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
                (board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
                (board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
                (board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
                (board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
                (board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||
                (board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
                (board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) )
        {
            return true;
        }
        return false;
    }

    // Pc's turn
    private static void computerTurn(char[][] board)
    {
        Random rand = new Random();
        int computerMove;
        while (true)
        {
            computerMove = rand.nextInt(9) + 1;
            if (isValidMove(board, Integer.toString(computerMove)))
            {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
    }

    //Players Turn
    private static void playerTurn(char[][] board, Scanner scanner)
    {
        String userInput;
        while (true)
        {
            System.out.println("Enter Your Move!!");
            userInput = scanner.nextLine();
            if (isValidMove(board, userInput))
            {
                break;
            } else
            {
                System.out.println(userInput + " is not a valid move.");
            }
        }
        placeMove(board, userInput, 'X');
    }

    //checking whether the move is valid or not
    private static boolean isValidMove (char[][] board, String position)
    {
        switch (position)
        {
            case "1":
                return (board[0][0] == ' ');//if the condition meets, means that place is already filled
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
    // placing move
    private static void placeMove(char[][] board, String position, char symbol) {
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }
    //printing Board
    public static void printBoard(char board[][])
    {
        System.out.print((board[0][0]));
        System.out.print("|");
        System.out.print((board[0][1]));
        System.out.print("|");
        System.out.println((board[0][2]));
        System.out.println("-----");
        System.out.print((board[1][0]));
        System.out.print("|");
        System.out.print((board[1][1]));
        System.out.print("|");
        System.out.println((board[1][2]));
        System.out.println("-----");
        System.out.print((board[2][0]));
        System.out.print("|");
        System.out.print((board[2][1]));
        System.out.print("|");
        System.out.println((board[2][2]));

    }
}
