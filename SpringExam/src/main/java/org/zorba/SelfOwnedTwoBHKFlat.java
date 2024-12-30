package org.zorba;

public class SelfOwnedTwoBHKFlat {
    public float calculatePlot(float length, float breadth, float height){
        return length*breadth*height;
    }
    public float finalPriceOfFlat(){
        return 30000* calculatePlot(10,20,30);
    }
}
