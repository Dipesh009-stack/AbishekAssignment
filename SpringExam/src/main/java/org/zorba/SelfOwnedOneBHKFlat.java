package org.zorba;

public class SelfOwnedOneBHKFlat {
    public float calculatePlot(float length, float breadth, float height){
        return length*breadth*height;
    }
    public float finalPriceOfFlat(){
        return 10000* calculatePlot(10,20,30);
    }
}