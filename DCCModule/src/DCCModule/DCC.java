package DCCModule;

import SpeedControlSystemModule.SpeedProvider;

public class DCC implements SpeedProvider {
    @Override
    public int getFinalSpeed() {
        return 365;
    }

    @Override
    public String getDiscription() {
        return null;
    }
}
