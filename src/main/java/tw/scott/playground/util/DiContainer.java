package tw.scott.playground.util;

import java.util.HashMap;
import java.util.Map;

public class DiContainer {
    private static DiContainer instance = null;
    private final Map<String, Object> map = new HashMap<>();

    public static DiContainer getInstance() {
        if (instance == null) {
            instance = new DiContainer();
        }
        return instance;
    }

    private  DiContainer() {
    }

    public void inject(String key, Object obj) {
        map.put(key, obj);
    }

    public Object getInjection(String key){
        return map.get(key);
    }
}
