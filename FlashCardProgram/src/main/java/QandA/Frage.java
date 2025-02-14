package QandA;

import QandA.Interfaces.FrageInterface;

public abstract class Frage implements FrageInterface {

    protected String frage;

    protected String richtigeAntwort;

    public Frage(String frage, String richtigeAntwort) {
        this.frage = frage;
        this.richtigeAntwort = richtigeAntwort;
    }

    public boolean istRichtigeAntwort(String versuch){
        return versuch.equalsIgnoreCase(richtigeAntwort);
    }

    public void setRichtigeAntwort(String richtigeAntwort) {
        this.richtigeAntwort = richtigeAntwort;
    }

    /**
     * Erstellt eine textuelle Formulierung der Frage
     * @return die Formulierung der Frage
     */
    @Override
    public String askQuestion() {
        return frage;
    }

    /**
     * Erstell eine MCQ version der Frage
     * @return reference zur MCQ Frage
     */
    public MCQ mcqVersion(String... options){
        return new MCQ(frage, richtigeAntwort,options);
    }

    public String getFrage() {
        return frage;
    }

    public String getRichtigeAntwort() {
        return richtigeAntwort;
    }

}
