/*
Gold Mining

Anusree has decided to go to a gold mine along with N of his friends (thus, total N+1 people including Anusree go to the gold mine).

The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.

Will Anusree and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.

Input Format

First line will contain T, number of testcases. Then the testcases follow. Each testcase contains of a single line of input, three integers N, X, Y.

Output Format

For each testcase, output "YES" if you and your friends can carry all the gold, otherwise output "NO".

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Sample Input 1

3

2 10 3

2 10 4

1 5 10

Sample Output 1

NO

YES

YES
 */

import java.util.ArrayList;
import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> al= new ArrayList<>();
        for (int i=0;i<num;i++){
            int N =sc.nextInt();
            int X=sc.nextInt();
            int Y=sc.nextInt();

            if ((N+1)*Y>X){
                al.add("YES");
            }
            else {
                al.add("NO");
            }
        }
        for (String elements : al){
            System.out.println(elements);
            System.out.println();
        }
    }
}
