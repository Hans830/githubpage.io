package FlashCardProgram;

import java.util.ArrayList;

public class Word implements FlashCardProgram.Interfaces.Word {

    private ArrayList<String> translations;
    private String rechtschreibung;
    private ArrayList<String> bedeutungen;
    private ArrayList<String> ueblicheAnwendungen;
    private ArrayList<String> Beispiele;


    public Word(String rechtschreibung, ArrayList<String> Beispiele, ArrayList<String> ueblicheAnwendungen, ArrayList<String> translations, ArrayList<String> bedeutungen){

        this.bedeutungen= bedeutungen;
        this.rechtschreibung=rechtschreibung;
        this.translations=translations;
        this.ueblicheAnwendungen=ueblicheAnwendungen;
        this.Beispiele=Beispiele;
    }


    public String getRechtschreibung() {
        return rechtschreibung;
    }
}
