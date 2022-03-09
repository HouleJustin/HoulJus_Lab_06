/*
* Name: Justin Houle
* Date: 2022/03/08
* Description: The interface instruments
* which represents instruments in an orchestra.
*/
package Lab06;

/**
 * Represents an instrument in an orchestra.
 * Implemented by Viola, Cello and Tuba classes.
 */
public interface Instruments {

    // Lets the instrument play its designated notes.
    void play();

    // Sets the note the instrument can play, allows to "tune" the instrument
    void tune(char note);

}
