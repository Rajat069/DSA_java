import java.util.Arrays;

public class AlmostEqualString_GFG {
    public static void main(String[] args) {

    }
    static int coutChars(String s1, String s2)
    {
        int count=0;
        int[] ar = new int[26];
        Arrays.fill(ar,0);
        for(int i=0;i<s1.length();i++){
            int c = s1.charAt(i)-'a';
            ar[c]++;  //incrementing the array index of a char of all the char that are in s1
        }
        for(int i=0;i<s2.length();i++){
            int c =s2.charAt(i)-'a';
            ar[c]--;  //decrementing the array index as we don't need to change already existing char
        }
        for(int i:ar){
            count+=(Math.abs(i));  //as there will be negative values
        }
        return count;
    }
}
