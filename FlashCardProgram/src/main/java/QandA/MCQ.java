package QandA;

public class MCQ extends Frage{



    public String[] optionen=new String[4];



    /**
     * Erstellung der Frage
     * @param Frage Die Frage
     * @param richtigeAntwort Die richtiger antwort zur Frage
     * @param optionen Die Antwortoptionen, die nach this.optionen kopiert werden sollen.
     *                 Die Erste option in optionen (option[0]) ist direkt nach der initialisierung immer
     *                 die richtige antwort
     */
    public MCQ(String Frage, String richtigeAntwort, String... optionen) {
        super(Frage, richtigeAntwort);
        this.optionen[0] = richtigeAntwort;

        /*
        Wir kopieren die Antworte in dem Parameter optionen nach der Attribute optionen.
        Nicht kopiert werden sollen die optionen, die der richtigen Antwort entsprechen
        i entspricht den Indices des Parameters optionen
        j entspricht den Indices der Attribute this.optionen
         */
        for(int i=0,j=1;i<optionen.length && j<=3;i++){
            if(!istRichtigeAntwort(optionen[i])){
                this.optionen[j]=optionen[i];
                j++;
            }
        }

    }



    /**
     * Vermischt die Antworten in dem Array optionen
     */
    public void mixAnswers(){
        for(int i=0;i<4;i++) {
            swap(optionen, (int) (Math.random() * 4.0), (int) (Math.random() * 4));
        }
    }



    private void swap(String[] array,int i,int j){
        String temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }



    /**
     * Erstellt eine textuelle Formulierung der Frage
     * @return die Formulierung der Frage
     */
    @Override
    public String frageFormulieren(){

        StringBuilder output=new StringBuilder(frage);
        mixAnswers();
        for(int i=0,j=0;i<4;i++){
            if(optionen[i]!=null ) {
                output.append('\n' + (char) ('a' + j)).append(") ").append(this.optionen[i]);
                j++;
            }
        }

        return output.toString();
    }



    /**
     * Ändert die bisherige richtige Antwort
     * Ändert die richtige Antwort auch in den optionen
     * @param richtigeAntwort die neue richtige Antwort
     */
    @Override
    public void setRichtigeAntwort(String richtigeAntwort){

        this.richtigeAntwort=richtigeAntwort;
        int i=0;
        for(;!optionen[i].equalsIgnoreCase(richtigeAntwort);i++);//angenommen die richtige Antwort ist in dem Array
        optionen[i]=richtigeAntwort;
    }
}
