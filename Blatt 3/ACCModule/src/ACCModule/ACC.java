
package ACCModule;

import SpeedControlSystemModule.SpeedProvider;

public class ACC implements SpeedProvider {
    @Override
    public int getFinalSpeed() {
        return 27;
    }

    @Override
    public String getDescription() {
        return "ACC";
    }
}
