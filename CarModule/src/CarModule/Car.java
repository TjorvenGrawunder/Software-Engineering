package CarModule;

import ACCModule.ACC;
import DCCModule.DCC;
import SpeedControlSystemModule.SpeedProvider;

import java.util.List;

public class Car {

    public static void main(String[] args){
        if(args.length != 1){
            printHelp();
            System.exit(-1);
        }
        List<SpeedProvider> msgServices = SpeedProvider.getInstances();
        for (SpeedProvider service : msgServices) {
            if(args[0].equals("ACC") && service instanceof ACC){
                System.out.println("Final Speed: " + service.getFinalSpeed() + "' !");
                break;
            }else if(args[0].equals("DCC") && service instanceof DCC){
                System.out.println("Final Speed: " + service.getFinalSpeed() + "' !");
                break;
            }else if(!args[0].equals("DCC") && args[0].equals("ACC")){
                printHelp();
            }

        }
    }

    public static void printHelp(){
        System.err.println("Invalid Arguments! (Insert ACC or DCC)");
    }
}
