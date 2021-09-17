package com.labs1904;


import java.util.Arrays;

public class NextBiggestNumber {

    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
    }

    public static int getNextBiggestNumber(Integer i) {

        char[] number = (i + "").toCharArray();

        int n, j;

        for (n = number.length-1; n > 0; n--)
            if (number[n-1] < number[n])
                break;

        if (n == 0)
            return -1;


        int x = number[n-1], smallest = n;
        for (j = n+1; j < number.length; j++)
            if (number[j] > x && number[j] <= number[smallest])
                smallest = j;
        r
        char temp = number[n-1];
        number[n-1] = number[smallest];
        number[smallest] = temp;

        Arrays.sort(number, n, number.length);

        long val = Long.parseLong(new String(number));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }


}
