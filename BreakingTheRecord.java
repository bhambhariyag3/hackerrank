import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];
         arry[0] = sc.nextInt();
         int min = arry[0];
         int max = arry[0];
         int x = 0;
         int y = 0;
        for (int i=1; i < n;i++){
            arry[i] = sc.nextInt();
            if ( arry[i] < min ){
                min = arry[i];
                x++;
            } 
            if ( arry [i] > max){
                max = arry[i];
                y++;
            }
        }
        System.out.println(y+" "+x); 
        
    }
}
