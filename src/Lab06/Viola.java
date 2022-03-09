/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: the Viola instrument
 */
package Lab06;

/**
 * The viola subclass which implements the Instruments functions
 */
public class Viola implements Instruments{

    private String songPlayed;
    private char tune;

    /**
     * initializes a new viola
     * @param songPlayed the song that the viola will play
     */
    public Viola(String songPlayed) {
        this.songPlayed = songPlayed;
    }

    /**
     * tunes the viola to a specific note
     * @param note the note at which the viola will be tuned too
     */
    public void tune(char note){
        this.tune = tune;
        System.out.println("Tuning Viola to:" + note);
    }

    /**
     * plays the tune of the viola
     */
    public void play(){
        System.out.println("Currently playing: " + this.songPlayed);
    }

}
