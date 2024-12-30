package org.zorba;

public class SelfOwnedThreeBHKFlat {
    public float calculatePlot(float length, float breadth, float height){
        return length*breadth*height;
    }
    public float finalPriceOfFlat(){
        return 50000* calculatePlot(10,20,30);
    }
}
