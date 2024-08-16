// Number of Anagramic Groups 
// You are given N strings of length M, count the number of anagramic groups. An anagramic group is a list of strings which are anagrams of each other.



// Input Format

// The first line of input contains T - the number of test cases. In each test case, the first line contains N - the number of strings and M - the length of each string, separated by a space. The N subsequent lines each contain a string of length M.



// Output Format

// For each test case, print the count of the number of anagramic groups in the given N strings, separated by a new line.



// Constraints

// 1 <= T <= 100

// 1 <= N <= 100

// 1 <= M <= 1000

// 'a' <= str[i] <= 'z'



// Example

// Input

// 2

// 5 4

// arts

// rank

// star

// rant

// rats

// 9 5

// tesla

// start

// slate

// salte

// tarts

// aster

// arson

// astle

// norse



// Output

// 3

// 5



// Explanation



// Test-Case 1

// The strings "arts", "star" and "rats" can be grouped together because they are anagrams of each other.

// The total number of such groups is 3 and the groups are {"arts", "rats", "star"}, {"rant"} and {"rank"}.

import java.util.*;

public class NumberOfAnagramicGroups {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] strs = new String[n];
            for(int i=0 ; i<n ; i++){
                strs[i] = sc.next();
            }
            System.out.println(solfun(strs));
        }
        sc.close();
    }

    static int solfun(String[] strs){
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);
            map.put(sortedStr,map.getOrDefault(sortedStr,0)+1);
            if(map.get(sortedStr)==1)
                count++;
        }
        return count;
    }
}