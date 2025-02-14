package FlashCardProgram;

import java.util.ArrayList;

public class Verb extends Word {

    boolean isStark;
    String kasus;


    public Verb(String rechtschreibung, ArrayList<String> Beispiele, ArrayList<String> ueblicheAnwendungen, ArrayList<String> translations, ArrayList<String> bedeutungen) {
        super(rechtschreibung, Beispiele, ueblicheAnwendungen, translations, bedeutungen);
    }

    private class conjugation{
        String ich;
        String du;
        String er_sie_es;
        String wir;
        String ihr;
        String sie_Sie;

        public conjugation(String ich, String du, String er_sie_es, String wir, String ihr, String sie_Sie) {
            this.ich = ich;
            this.du = du;
            this.er_sie_es = er_sie_es;
            this.wir = wir;
            this.ihr = ihr;
            this.sie_Sie = sie_Sie;
        }
    }


}
