package HomeWork_1.Task_7.Strings;

public class StringOrchestra {
    private Guitar guitar;
    private Bass bass;
    private Cello cello;
    private Violin violin;
    public StringOrchestra(){
        guitar=new Guitar();
        bass=new Bass();
        cello=new Cello();
        violin=new Violin();
    }
    public void playYourParts(){
        guitar.playStrings();
        bass.playStrings();
        cello.playStrings();
        violin.playStrings();
    }

}
