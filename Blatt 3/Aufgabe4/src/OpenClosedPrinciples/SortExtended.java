package OpenClosedPrinciples;

public class SortExtended extends Sort {
    public static char[] sortChars(char[] chars){
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars.length; j++){
                if(chars[i] < chars[j]){
                    char tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                }
            }
        }
        return chars;
    }
}
