package pl.sternik.aw.kaczki;

import pl.sternik.aw.kaczki.ges.Ges;
import pl.sternik.aw.kaczki.kwakanie.Niemowa;

import java.util.ArrayList;
import java.util.List;

public class Symulator {

    public static void main(String[] args) {

        Kaczka dzika = new DzikaKaczka("dziwaczka");

        dzika.kwacz();
        dzika.lataj();
        dzika.wyswietl();

        Kaczka gumowa = new GumowaKaczka("żółta");
        Kaczka drewniana = new DrewnianaKaczka("Dębowa");
        Kaczka mandarynka = new MandarynkaKaczka("samiec");


        List<Kaczka> kaczki = new ArrayList<Kaczka>();
        kaczki.add(dzika);
        kaczki.add(gumowa);
        kaczki.add(drewniana);
        kaczki.add(mandarynka);

        for (Kaczka kaczka : kaczki) {
            kaczka.wyswietl();
            kaczka.lataj();
            kaczka.plywaj();
            kaczka.kwacz();
        }
        System.out.println("-------------------------------");
        gumowa.kwacz();
        gumowa.setKwakanie(new Niemowa());
        gumowa.kwacz();
        System.out.println("---------------GĘŚ-------------");
        Ges ges = new Ges("Gąska");
        Kaczka gesAdapter = new GesKaczkaAdapter(ges);

        kaczki.add(gesAdapter);

        gesAdapter.wyswietl();
        gesAdapter.lataj();
        gesAdapter.plywaj();
        gesAdapter.kwacz();
        System.out.println("---------------NOWA KACZKA--------");
        Kaczka nowa = Kaczka.dajKaczke(KaczkaTypy.ZepsutaGumowa,"dzika");
        nowa.wyswietl();
        nowa.kwacz();
        nowa.lataj();
        nowa.plywaj();
    }
}
