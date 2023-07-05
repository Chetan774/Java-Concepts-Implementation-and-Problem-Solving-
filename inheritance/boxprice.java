package com.company.inheritance;

public class boxprice extends boxWeight{
    int cost;

    boxprice()
    {
        super();
        this.cost = -1;
    }
    public boxprice(int length,int width, int height,int weight,int cost)
    {
        super( length,weight,width,height);
        this.cost = cost;

    }
}
