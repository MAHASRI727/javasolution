// Interface
interface Playable {
    void play();
}

// Class 1 implementing the interface
class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar yes");
    }
}

// Class 2 implementing the interface
class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano yes");
    }
}

// Main class
public class InstrumentDemo {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();

        myGuitar.play();
        myPiano.play();
    }
}
