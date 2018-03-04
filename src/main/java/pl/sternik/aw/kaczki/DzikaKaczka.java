package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.kwakanie.Kwaczaca;
import pl.sternik.aw.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {
    public DzikaKaczka(String nazwa) {
        super(nazwa, new Latajaca(), new Kwaczaca());
    }
}
