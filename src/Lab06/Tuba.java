/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: The Tuba instrument
 */
package Lab06;

/**
 * The Tuba subclass which implements the Instruments functions
 */
public class Tuba implements Instruments{

    private String songPlayed;
    private int timesPlaying;
    private char tune;

    /**
     * Initializes a new tuba
     * @param songPlayed the song the tuba will be playing
     * @param timesPlaying the amount of times the tuba will play
     */
    public Tuba(String songPlayed, int timesPlaying) {
        this.songPlayed = songPlayed;
        this.timesPlaying = timesPlaying;
    }

    /**
     * the note the tuba will take
     * @param note the new note given to the tuba
     */
    public void tune(char note){
        this.tune = tune;
        System.out.println("Tuning Tuba to:" + note);
    }

    /**
     * outputs the song that is currently being played and the times playing it
     */
    public void play(){
        System.out.println("currently playing: " + this.songPlayed);
        for(int i = 0; i < timesPlaying; i++){
            System.out.println("oom pa pa");
        }
    }

}

