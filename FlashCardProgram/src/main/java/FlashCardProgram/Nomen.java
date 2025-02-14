package FlashCardProgram;

import java.util.ArrayList;

public class Nomen extends Word{


    private Genus genus;
    private String pluralForm;
    private boolean isSchwach;



    public Nomen(String rechtschreibung, ArrayList<String> Beispiele, ArrayList<String> ueblicheAnwendungen, ArrayList<String> translations, ArrayList<String> bedeutungen) {
        super(rechtschreibung, Beispiele, ueblicheAnwendungen, translations, bedeutungen);
    }

    public Nomen(String rechtschreibung, ArrayList<String> Beispiele, ArrayList<String> ueblicheAnwendungen, ArrayList<String> translations, ArrayList<String> bedeutungen, Genus genus, String pluralForm, boolean isSchwach) {
        super(rechtschreibung, Beispiele, ueblicheAnwendungen, translations, bedeutungen);
        this.genus = genus;
        this.pluralForm = pluralForm;
        this.isSchwach = isSchwach;
    }


    /**
     * Enum mit den drei Genera und dessen Artikel
     */
    public enum Genus{

        MASKULINUM("Der"),
        FEMININUM("Die"),
        NEUTRUM("Das");

        private final String artikel;
        Genus(String artikel){
            this.artikel=artikel;
        }

        public String getArtikel(){
            return artikel;
        }
    }
}
