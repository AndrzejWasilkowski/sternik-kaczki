package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.ges.Ges;
import pl.sternik.aw.kaczki.kwakanie.Niemowa;
import pl.sternik.aw.kaczki.latanie.Nielot;

public class GesKaczkaAdapter extends Kaczka {
    private Ges ges;
    public GesKaczkaAdapter(Ges ges) {
        super("",new Nielot(), new Niemowa());
        this.ges = ges;
    }

    @Override
    public void kwacz() {
        ges.gegaj();
    }

    @Override
    public void lataj() {
        ges.latajPoGesiemu();
    }

    @Override
    public void wyswietl() {
        ges.wyswietlGes();
    }

    @Override
    public void plywaj() {
        ges.plywajPoGesiemu();
    }
}
