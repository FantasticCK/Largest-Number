package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public String largestNumber(int[] nums) {
        if (nums.length == 0)
            return "";
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        Collections.sort(numList, (num1, num2) -> {
            String s1 = String.valueOf(num1), s2 = String.valueOf(num2);
            return (s2 + s1).compareTo(s1 + s2);
        });

        StringBuilder sb = new StringBuilder();
        for (int num : numList) {
            sb.append(num);
            if (sb.length() != 0 && sb.charAt(0) == '0') {
                return "0";
            }
        }
        return sb.toString();
    }

}