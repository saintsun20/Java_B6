package Hafta11_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(); // parametre vermez isek lokali verir

        Set<String> zoneIdler = ZoneId.getAvailableZoneIds();

        for (String z: zoneIdler)
            System.out.println("z = " + z);

        ZoneId zoneIdAlmanya = ZoneId.of("Europe/Berlin");
        ZonedDateTime almanyaTarihSaati = ZonedDateTime.now(zoneIdAlmanya);
        System.out.println("almanyaSaati = " + almanyaTarihSaati);
    }
}
