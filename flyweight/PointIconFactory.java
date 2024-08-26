package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type){
        if(!icons.containsKey(type)){
            icons.put(type, new PointIcon(type, null));
        }
        return icons.get(type);
    }
}
