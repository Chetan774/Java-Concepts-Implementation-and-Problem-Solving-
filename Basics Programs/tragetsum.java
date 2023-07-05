package com.company;

public class tragetsum
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int target = 3;

        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+","+j);
                    return;
                }
            }

    }
}


}
