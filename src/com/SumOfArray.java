package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfArray {

    private int[] ar;

    public static int simpleArraySum(int[] ar) throws IOException {
        /*int result = 0;

        for(int count : ar){
            result += count;
        }
        return result;*/
        return IntStream.of(ar).sum();
    }

}

