package com.company.inheritance;

public class boxWeight extends box{
    double weight;

    boxWeight(){
        super();
        this.weight = -1;
    }
    boxWeight(int length,int width,int height,int weight){
        super(length,width,height);
        this.weight = weight;

    }
}
