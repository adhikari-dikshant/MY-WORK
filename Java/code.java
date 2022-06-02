import java.io.*;
import java.util.Scanner;

class Code {

    private static boolean isPerfectSquare(int x){
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }

    private static int getSquare(Integer[][] inmatrix, int m, int n){
        int outnum = -1, sum=0;
        boolean leftToRight = true;
        for (int i = 0; i < m; i++) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    sum += inmatrix[i][j];
                    if(isPerfectSquare(sum)){
                        outnum = sum > outnum ? sum : outnum;
                        sum=0;
                    }
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    sum += inmatrix[i][j];
                    if(isPerfectSquare(sum)){
                        outnum = sum > outnum ? sum : outnum;
                        sum=0;
                    }
                }
            }

            leftToRight = !leftToRight;
        }
        return outnum;
    }

    public static void main (String args[]){
        int m, n=0, res;
        Integer[][] arr = null;
        String line;
        Scanner scan = new Scanner(System.in);
        
        m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            line = scan.next();
            String[] parts = line.split(",");
            n = parts.length;
            if(arr== null){
                arr = new Integer[m][n];
            }
            for (int j = 0; j < parts.length ; j++) {
                arr[i][j] = Integer.parseInt(parts[j]);
            }
        }

        res = getSquare(arr, m ,n);
        
        System.out.println(res+"");
    }
}