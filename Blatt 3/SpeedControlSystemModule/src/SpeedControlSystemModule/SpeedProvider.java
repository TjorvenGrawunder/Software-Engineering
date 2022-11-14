package SpeedControlSystemModule;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface SpeedProvider {
    /**
     * Wird von ACC und DCC implementiert um einen Geschwindigkeitswert zu liefern.
     *
     * @return ein Beispielswert
     */
    int getFinalSpeed();

    /**
     * Soll Identifier liefern, mit dem man zwischen ACC und DCC unterscheiden kann.
     * @return Identifier
     */
    String getDescription();

    /**
     * Legt eine Liste an und fügt alle Services hinzu, die SpeedProvider implementieren
     *
     * @return Liste aller Services
     */
    static List<SpeedProvider> getInstances() {
        ServiceLoader<SpeedProvider> services = ServiceLoader.load(SpeedProvider.class);
        List<SpeedProvider> list = new ArrayList<>();
        services.iterator().forEachRemaining(list::add);
        return list;
    }
}
