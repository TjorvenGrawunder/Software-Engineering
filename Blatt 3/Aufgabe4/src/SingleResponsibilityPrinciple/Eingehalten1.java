package SingleResponsibilityPrinciple;

public class Eingehalten1 {
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
}
