package FlashCardTests;

import FlashCardProgram.Word;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {


    Word temp;
    String rechtschreibung=new String("A");
    ArrayList<String> Beispiele=new ArrayList<>();
    ArrayList<String> ueblicheAnwendung=new ArrayList<>();
    ArrayList<String> tranlsation=new ArrayList<>();
    ArrayList<String> bedeutungen=new ArrayList<>();




    /**
     * Testet ob Der Konstruktor ein Exception bei null parameter wirft
     */
    @Test
    public void TestNullParameterImKonstruktor(){

        Object[] parameters=new Object[5];
        parameters[0]= "a";
        parameters[1]=new ArrayList<>();
        parameters[2]=new ArrayList<>();
        parameters[3]=new ArrayList<>();
        parameters[4]=new ArrayList<>();
        Object[] parametersCopy=new Object[5];

        boolean pass=true;
        int i=0;
        do {
            System.arraycopy(parameters, 0, parametersCopy, 0, 5);
            parametersCopy[i] = null;
            try {
                temp = new Word((String) parametersCopy[0], (ArrayList<String>)parametersCopy[1], (ArrayList<String>)parametersCopy[2], (ArrayList<String>)parametersCopy[3], (ArrayList<String>)parametersCopy[4]);
                fail("Sollte ein Exception werfen");
            } catch (NullPointerException n) {
                if(!n.getMessage().equalsIgnoreCase("Konstruktor parameter dürfen nicht null sein")){
                    fail("Wrong Exception message");
                }
            }
            i++;
        }while(i<5);
    }


    /**
     * Testen den Konstruktor und die getter Methoden
     */
    @Test
    public void testInitialisationAndGetters(){
        temp=new Word(rechtschreibung,Beispiele,ueblicheAnwendung,tranlsation,bedeutungen);
        assertEquals(rechtschreibung,temp.getRechtschreibung());
        assertEquals(Beispiele,temp.getBeispiele());
        assertEquals(tranlsation,temp.getTranslations());
        assertEquals(bedeutungen,temp.getBedeutungen());
        assertEquals(ueblicheAnwendung,temp.getUeblicheAnwendungen());
    }
}
