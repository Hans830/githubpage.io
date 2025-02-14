package FlashCardProgram;

import FlashCardProgram.Interfaces.FlashCardInterface;

/**
 * Ein Flash card ist ein Objekt mit zwei Seiten, die Hintere und die Vornere.
 * Der Vornere Seite hat ein Wort
 * Eine Seite hat Informationen
 * Die vornere Seite hat ein Wort, dessen Informationen wir Eraten sollten
 */
public class FlashCard implements FlashCardInterface {


    private Word Word;


    @Override
    public String flip() {
        return "";

    }

    public String vordereSeiteToString(){
        return Word.getRechtschreibung();
    }

    public String
}
