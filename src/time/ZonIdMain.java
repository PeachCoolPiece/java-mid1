package time;

import java.time.ZoneId;
import java.util.Set;

public class ZonIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            //System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId);
            System.out.println("zoneId.getRules() = " + zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault(); // 운영체제
        System.out.println("zoneId = " + zoneId);
        
        
    }
}
