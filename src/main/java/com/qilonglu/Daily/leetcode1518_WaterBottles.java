package com.qilonglu.Daily;

public class leetcode1518_WaterBottles {
    public int numWaterBottles_mock(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while(bottle >= numExchange) {
            bottle -= numExchange;
            ans ++;
            bottle ++;
        }
        return ans;
    }

    public int numWaterBottles_math(int numBottles, int numExchange) {
        return numBottles >= numExchange ? (numBottles - numExchange) / (numExchange - 1) + 1 + numBottles : numBottles;
    }
}
