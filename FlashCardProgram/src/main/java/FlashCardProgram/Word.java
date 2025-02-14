package FlashCardProgram;
import Tools.Nullchecker;

import java.util.ArrayList;

public class Word implements FlashCardProgram.Interfaces.Word {

    private ArrayList<String> translations;
    private String rechtschreibung;
    private ArrayList<String> bedeutungen;
    private ArrayList<String> ueblicheAnwendungen;
    private ArrayList<String> Beispiele;


    public Word(String rechtschreibung, ArrayList<String> Beispiele, ArrayList<String> ueblicheAnwendungen, ArrayList<String> translations, ArrayList<String> bedeutungen){

        if(Nullchecker.gibtEsNullIn(translations,rechtschreibung,bedeutungen,ueblicheAnwendungen,Beispiele)){
            throw new NullPointerException("Konstruktor parameter dürfen nicht null sein");
        }
        this.bedeutungen= bedeutungen;
        this.rechtschreibung=rechtschreibung;
        this.translations=translations;
        this.ueblicheAnwendungen=ueblicheAnwendungen;
        this.Beispiele=Beispiele;
    }


    public String getRechtschreibung() {
        return rechtschreibung;
    }

    public ArrayList<String> getTranslations() {
        return translations;
    }

    public ArrayList<String> getBedeutungen() {
        return bedeutungen;
    }

    public ArrayList<String> getUeblicheAnwendungen() {
        return ueblicheAnwendungen;
    }

    public ArrayList<String> getBeispiele() {
        return Beispiele;
    }
}
