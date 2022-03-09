/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: The Cello instrument
 */
package Lab06;

/**
 * The Cello subclass which implements the Instruments functions
 */
public class Cello implements Instruments{

    private String songPlayed;
    private char tune;

    /**
     *
     * @param songPlayed
     */
    public Cello(String songPlayed) {
        this.songPlayed = songPlayed;
    }

    /**
     * tunes the Cello to a specific note
     * @param note
     */
    public void tune(char note){
        this.tune = tune;
        System.out.println("Tuning Cello to:" + note);
    }

    /**
     * plays the of the Cello outputs it current
     */
    public void play(){
        System.out.println("Currently playing: " + this.songPlayed);
    }

}
