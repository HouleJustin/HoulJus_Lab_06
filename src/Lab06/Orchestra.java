/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: the array of instruments forming an orchestra
 */
package Lab06;

import java.util.Arrays;

/**
 * The class Orchestra which uses an array of instruments to make an orchestra of instruments
 */
public class Orchestra {
    private Instruments[] orchestra; // implement your own unbound array;
    private int iter = 0;   // iterator
    private int size = 5;

    /**
     * the default constructor which initializes the array with a size of 5
     */
    public Orchestra(){
        this.orchestra = new Instruments[size];
    }

    /**
     * The constructor used to set a specific array size
     * @param size the desired size of the array of instruments
     */
    public Orchestra(int size){
        this.size = size;
        this.orchestra = new Instruments[this.size];
    }

    /**
     * Insert a new instrument to the array, if the array is full increase the size by 50%
     * @param instrument the new instrument added to the array
     */
    public void addInstrument(Instruments instrument){
        iter = 0;

        //go to last element of array
        while(hasNext()){
            next();
        }

        // if array not empty go next
        if(orchestra[iter] != null){
            this.iter++;
            orchestra[iter] = instrument;
        }

        // if array full increase size by 50%
        if( iter >= orchestra.length-1){
            Instruments[] copy = new Instruments[(int) (this.size + (this.size/2))];

            for(int i = 0; i < orchestra.length; i++){
                copy[i] = orchestra[i];
            }
            copy[orchestra.length] = instrument;
            this.orchestra = copy;

        }
    }

    /**
     * Checks if there is an element after the current one;
     * @return a boolean depending if there is an element after the current one or not
     */
    public boolean hasNext(){
        return (orchestra[this.iter] != null);
    }

    /**
     * goes to the next element/Instrument in the array if there is another
     */
    public void next(){
        if(hasNext()){
            iter++;
        }
    }

    /**
     *
     */
    public void remove(){

    }

    /**
     * Tunes all the instruments to a specific note
     * @param newNote the new note which all instruments will be tuned too
     */
    public void tuneAll(char newNote){
        this.iter = 0;
            while(hasNext()) {
                System.out.println("tuned");
                orchestra[iter].tune(newNote);
                iter++;
            }
            this.iter = 0;
        }


    /**
     * Plays all the instruments of the array
     */
    public void playAll(){
        iter = 0;
        for(int i = 0; i < size; i++){
            if(hasNext()){
                orchestra[i].play();
                iter++;
            }
            else break;
        }
        this.iter = 0;
    }

}
