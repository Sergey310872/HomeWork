package HomeWork_1.Task_7.Keyboards;

public class KeysOrchestra {
    public Harpsichord harpsichord;
    public Organ organ;
    public Piano piano;

    public KeysOrchestra(){
        harpsichord=new Harpsichord();
        organ=new Organ();
        piano=new Piano();
    }
    public void playYourParts(){
        harpsichord.playKeys();
        organ.playKeys();
        piano.playKeys();
    }
}
