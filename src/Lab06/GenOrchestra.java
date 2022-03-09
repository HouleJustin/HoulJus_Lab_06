/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: the arraylist of instruments forming an orchestra
 */
package Lab06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class which utilizes an arraylist to crat its own orchestra of instruments
 */
public class GenOrchestra {

    private ArrayList<Instruments> genOrchestra; // implement your own unbound array;

    /**
     * the constructor which initializes the arraylist
     */
    public GenOrchestra(){
        genOrchestra = new ArrayList<Instruments>();
    }

    /**
     * Adds a new instrument to the arraylist
     * @param instrument the new instrument to be added to the arraylist
     */
    public void addGenInstrument(Instruments instrument){
       Iterator<Instruments> iter = genOrchestra.iterator();

       if(!iter.hasNext()){
           genOrchestra.add(instrument);
           return;
       }
       else
           genOrchestra.add(instrument);
    }


    /**
     * using an arraylist all the instruments are tunes to the same note
     * @param newNote the new note where all the instruments will be tuned to
     */
    public void tuneAllGen(char newNote){
        Iterator<Instruments> iter = genOrchestra.iterator();
        while(iter.hasNext()) {
            iter.next().tune(newNote);
        }
    }

    /**
     * Plays all the instruments in the arraylist
     */
    public void playAllGen(){
        Iterator<Instruments> iter = genOrchestra.iterator();
        while(iter.hasNext()) {
            iter.next().play();
        }
    }

    /**
     * gives access to the iterator
     * @return the arraylist iterator
     */
    public Iterator<Instruments> iterator(){
        return genOrchestra.iterator();
    }


}
