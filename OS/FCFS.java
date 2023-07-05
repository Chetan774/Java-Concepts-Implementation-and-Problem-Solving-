package com.company.OS;

import java.util.Arrays;

public class FCFS
{
    static void findWaitingTime(int processes[], int n, int bt[], int wt[])
    {
        wt[0] = 0;

        for (int i = 1; i < n; i++)
        {
            wt[i] = bt[i - 1] + wt[i - 1];
        }
    }


    static void findTurnAroundTime(int processes[], int n,int bt[], int wt[], int tat[])
    {

        for (int i = 0; i < n; i++)
        {
            tat[i] = bt[i] + wt[i];
        }
    }

    static void CompletionTime(int processes[], int n, int CT[], int tat[], int At[])
    {

        for (int i = 0; i < n; i++)
        {
            CT[i] = tat[i]+At[i];
        }
    }

    static void findavgTime(int processes[], int n, int bt[],int At[])
    {
        int wt[] = new int[n], tat[] = new int[n];
        int CT[] = new int[n];

        int total_wt = 0, total_tat = 0;
        int total_ct = 0;

        findWaitingTime(processes, n, bt, wt);

        findTurnAroundTime(processes, n, bt, wt, tat);

        CompletionTime(processes,n, CT, tat,At);

        System.out.printf("Processes Burst time"+ "Waiting time"+" Turn around time"+"CompletionTime \n");


        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            total_ct = total_ct + CT[i];

        }


        System.out.println();
        System.out.println("Processes : ");
        System.out.println(Arrays.toString(processes));
        System.out.println("Arrival Time : ");
        System.out.println(Arrays.toString(At));
        System.out.println("BrustTime : ");
        System.out.println(Arrays.toString(bt));
        System.out.println("Waiting Time  : ");
        System.out.println(Arrays.toString(wt));
        System.out.println("TurnAroundTime Time : ");
        System.out.println(Arrays.toString(tat));
        System.out.println("Completion Time : ");
        System.out.println(Arrays.toString(CT));

        float Avg_wt = (float)total_wt /(float) n;
        float Avg_tat = (float)total_tat / (float)n;
        System.out.printf("Average waiting time = %f", Avg_wt);
        System.out.printf("\n");
        System.out.printf("Average turn around time = %d ", Avg_tat);
        int Avg_CT = total_ct / n;
        System.out.println();
        System.out.printf("Average Completion  time = %d ", Avg_CT);
    }

    // Driver code
    public static void main(String[] args)
    {
        //process id's
        int processes[] = {1, 2, 3,4,5};
        int n = processes.length;

        int Arrival[] = {0,1,2,2,3};

        //Burst time of all processes
        int burst_time[] = {8,9,6,1,3};

        findavgTime(processes, n, burst_time,Arrival);

    }
}
