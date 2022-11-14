package OpenClosedPrinciples;

public class Sort {
    public static int[] sort(int[] intArr){
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr.length; j++){
                if(intArr[i] < intArr[j]){
                    int tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }
        return intArr;
    }

    /**
     * Erweiterung in der eigentlichen Klasse(ohne Beachtung von OpenClosedPrinzip)
     * @param chars
     * @return
     */
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
