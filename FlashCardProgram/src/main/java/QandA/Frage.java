package QandA;


public abstract class Frage implements QandA.Interfaces.Frage {


    protected String frage;
    protected String richtigeAntwort;


    public Frage(String frage, String richtigeAntwort) {
        this.frage = frage;
        this.richtigeAntwort = richtigeAntwort;
    }


    /**
     * Bestimmt, ob einen übergebenen String der richtigen Antwort entspricht
     * @param versuch Der zu überprüfenden String
     * @return true falls der String versuch die richtge Antwort ist
     */
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
    public String frageFormulieren() {
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
