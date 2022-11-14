package SingleResponsibilityPrinciple;

public class NichtEingehalten {
    /**
     * Berechnet Durchschnitt von gegebenen Int Array
     * @param intArr
     * @return
     */
    public static int calculateAverage(int[] intArr){
        int average = 0;
        for(int i = 0; i < intArr.length; i++){
            average+= intArr[i];
        }
        average = average / intArr.length;
        return average;
    }

    /**
     * Gibt Char in der Mitte des Strings zurück
     * @param s
     * @return
     */
    public static char getMidCharacter(String s){
        char c = ' ';
        c = s.charAt(s.length()/2);
        return c;
    }
}
