import OpenClosedPrinciples.Sort;
import OpenClosedPrinciples.SortExtended;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {3,2,5,2,7,4,2,7};
        char[] chars = {'c','f','k','a','w','v'};
        intArr = SortExtended.sort(intArr);
        chars = SortExtended.sortChars(chars);
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + " ");
        }
    }
}