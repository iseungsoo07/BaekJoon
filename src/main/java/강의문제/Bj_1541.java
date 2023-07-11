package 강의문제;

import java.util.Scanner;

public class Bj_1541 {

    public static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");

        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }

        System.out.println(answer);

    }

    private static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }

        return sum;
    }
}
