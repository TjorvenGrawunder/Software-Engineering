package SpeedControlSystemModule;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface SpeedProvider {

    int getFinalSpeed();
    String getDiscription();

    static List<SpeedProvider> getInstances() {
        ServiceLoader<SpeedProvider> services = ServiceLoader.load(SpeedProvider.class);
        List<SpeedProvider> list = new ArrayList<>();
        services.iterator().forEachRemaining(list::add);
        return list;
    }
}
