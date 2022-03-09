/*
 * Name: Justin Houle
 * Date: 2022/03/08
 * Description: The class where the tests are preformed
 */
package Lab06;

public class Main {
    public static void main(String[] args) {

        // variables for genOrchestra using iterator and arraylist
        GenOrchestra genOrchestra = new GenOrchestra();
        Viola viola = new Viola("The Great Square of Peagaus");
        Cello cello = new Cello("The Great Square of Peagaus");
        Tuba tuba = new Tuba("The Great Square of Peagaus", 5);
        Tuba tuba1 = new Tuba("The Great Square of Peagaus", 5);

        // variables for Orchestra using iterator and array
        Orchestra orchestra = new Orchestra(3);
        Viola viola1 = new Viola("Bach");
        Cello cello1 = new Cello("Bach");
        Tuba tuba2 = new Tuba("Bach", 5);
        Tuba tuba3 = new Tuba("Bach", 5);

        // Test for GenOrchestra
        System.out.println("\nTests for GenOrchestra");
        viola.tune('c');
        cello.tune('b');
        tuba.tune('f');
        tuba1.tune('r');

        // Test for GenOrchestra
        genOrchestra.addGenInstrument(viola);
        genOrchestra.addGenInstrument(cello);
        genOrchestra.addGenInstrument(tuba);
        genOrchestra.addGenInstrument(tuba1);

        // Test for GenOrchestra
        System.out.println();
        genOrchestra.tuneAllGen('z');
        System.out.println();
        genOrchestra.playAllGen();

        // Test for Orchestra
        System.out.println("\nTests for Orchestra");
        viola1.tune('c');
        cello1.tune('b');
        tuba2.tune('f');
        tuba3.tune('r');

        // Test for Orchestra NOT WORKING
        orchestra.addInstrument(viola1);
        orchestra.addInstrument(cello1);
        orchestra.addInstrument(tuba2);
        orchestra.addInstrument(tuba3);

        // Test for Orchestra NOT WORKING
        orchestra.tuneAll('z');
        orchestra.playAll();

    }
}
