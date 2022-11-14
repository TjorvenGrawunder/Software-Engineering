package CarModule;

import SpeedControlSystemModule.SpeedProvider;

import java.util.List;

public class Car {
    /**
     * Anhand der Argument wird überprüft, ob der Service ACC oder DCC genutzt werden soll.
     * Sollte kein Argument oder ein falsches Argument angegeben worden sein wird ein Hinweis gegeben.
     * @param args ACC oder DCC
     */
    public static void main(String[] args){
        if(args.length != 1){
            printHelp();
            System.exit(-1);
        }
        List<SpeedProvider> msgServices = SpeedProvider.getInstances();
        for (SpeedProvider service : msgServices) {
            if(args[0].equals("ACC") && service.getDescription().equals("ACC")){
                System.out.println("Final Speed: " + service.getFinalSpeed() + "' !");
                break;
            }else if(args[0].equals("DCC") && service.getDescription().equals("DCC")){
                System.out.println("Final Speed: " + service.getFinalSpeed() + "' !");
                break;
            }else if(!args[0].equals("DCC") && args[0].equals("ACC")){
                printHelp();
            }

        }
    }

    /**
     * Hilfsmethode für Fehlermeldung
     */
    public static void printHelp(){
        System.err.println("Invalid Arguments! (Insert ACC or DCC)");
    }
}
