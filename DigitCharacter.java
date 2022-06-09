/*Problem statement
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case is described with a single line containing a string S, the alphanumeric string.
Output
For each test case, output a single line containing the sum of all the digit characters in that string.
Constraints
1 ≤ T ≤ 1000
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.*/



import java.util.*;

public class DigitChar {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        String[] arr = new String[T];
        for(int i = 0; i < T; i++) {
            arr[i] = in.nextLine();
        }

        for(String s : arr) {
            char[] chars = s.toCharArray();
            int sum = 0;
            for(int i = 0; i <s.length();i++) {
                if(Character.isDigit(chars[i]))
                    sum += Integer.parseInt(String.valueOf(chars[i]));
            }
            System.out.println(sum);
        }

        in.close();
    }
}
