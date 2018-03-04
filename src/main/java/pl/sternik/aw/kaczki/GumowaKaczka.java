package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.kwakanie.Piszczaca;
import pl.sternik.aw.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {
    public GumowaKaczka(String nazwa) {
        super(nazwa, new Nielot(), new Piszczaca());
    }
}
