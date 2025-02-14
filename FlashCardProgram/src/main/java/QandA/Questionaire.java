package QandA;

import QandA.Interfaces.Questioinaire;

import java.util.ArrayList;

public class Questionaire implements Questioinaire {

    ArrayList<Frage> fragen=new ArrayList<>();

    public void frageHinzufuegen(Frage frage){

        fragen.add(frage);

    }

    @Override
    public Frage getFrage(int index) {

        return fragen.get(index);
    }
}
