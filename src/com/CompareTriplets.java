package com;

import java.util.List;

public class CompareTriplets {
    private List<Integer> a, b;

    public CompareTriplets() {
    }

    public CompareTriplets(List<Integer> a, List<Integer> b) {
        this.a = a;
        this.b = b;
    }

    public List<Integer> returnComparision(List<Integer> a, List<Integer> b){
        List<Integer> result = null;
        List<Integer> resultLoop = null;
        int aResult = 0;
        int bResult=0;
        for(int i=0; i <a.size() ; i++){
            if(a.get(0) > b.get(0)){
                aResult += 1;
            }
            else {
                bResult += 1;
            }

        }
        resultLoop.add(aResult);
        resultLoop.add(bResult);

        result.add( ((a.get(0) > b.get(0)?1:0)  + ((a.get(1) > b.get(1))?1:0)) + ((a.get(2) > b.get(2))?1:0) );
        result.add( ((b.get(0) > a.get(0)?1:0)  + ((b.get(1) > a.get(1))?1:0)) + ((b.get(2) > a.get(2))?1:0) );

        return result;
    }
    @Override
    public String toString() {
        return "CompareTriplets{" +
                "a=" + a.size() +
                ", b=" + b.size() +
                '}';
    }
}
