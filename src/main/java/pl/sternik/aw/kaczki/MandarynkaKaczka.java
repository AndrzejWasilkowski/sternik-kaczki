package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.kwakanie.Kwaczaca;
import pl.sternik.aw.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {
    public MandarynkaKaczka(String nazwa) {
        super(nazwa, new Latajaca(), new Kwaczaca());
    }
}
