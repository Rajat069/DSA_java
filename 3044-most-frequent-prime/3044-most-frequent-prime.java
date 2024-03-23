import java.util.*;

class Solution {
    HashMap<String, Integer> hs = new HashMap<>();

    public int mostFrequentPrime(int[][] mat) {
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                traverse(mat, i, j);
            }
        }
        int f=-1;
        String sol="";
        for(String key:hs.keySet()){
            if(isPrime(Integer.parseInt(key))&&Integer.parseInt(key)>=10){
                if(hs.get(key)>f){
                sol=key;
                f=hs.get(key);
            }
            else if(hs.get(key)==f&&Integer.parseInt(key)>Integer.parseInt(sol)){
                sol=key;
             }
        }
           
        }

        return sol.equals("")?-1:Integer.parseInt(sol);
    }
public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public void traverse(int[][] mat, int i, int j) {
        StringBuilder sb = new StringBuilder();
        for(int r = i, c = j;r<mat.length&&c<mat[0].length; r++, c++){
            sb.append(String.valueOf(mat[r][c]));
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
        sb = new StringBuilder();
        for(int r = i, c = j; c < mat[0].length; c++){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
        sb = new StringBuilder();
        for(int r = i, c = j; r < mat.length; r++){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
          sb = new StringBuilder();
        for(int r = i, c = j; r>=0&& c < mat[0].length; r--,c++){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
          sb = new StringBuilder();
        for(int r = i, c = j; c >=0&&r<mat.length ; c--,r++){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
          sb = new StringBuilder();
         for(int r = i, c = j; c >=0 ; c--){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
          sb = new StringBuilder();
        for(int r = i, c = j; c >=0 &&r>=0; c--,r--){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
          sb = new StringBuilder();
        for(int r = i, c = j; r >=0 ; r--){
            sb.append(String.valueOf(mat[r][c])); 
            String num = sb.toString();
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }
     }
}

