package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.kwakanie.Niemowa;
import pl.sternik.aw.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {
    public DrewnianaKaczka(String nazwa) {
        super(nazwa, new Nielot(), new Niemowa());
    }
}
