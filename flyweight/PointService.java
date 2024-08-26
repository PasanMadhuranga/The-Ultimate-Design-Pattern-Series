package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 3, factory.getPointIcon(PointType.CAFE)));
        points.add(new Point(5, 6, factory.getPointIcon(PointType.HOSPITAL)));
        return points;
    }
}
