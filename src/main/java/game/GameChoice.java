package game;

public interface GameChoice {

    GameChoice setNext(int choose);
    String getText();
   String getChoice1();
   String getChoice2();
   String getChoice3();
   boolean winner();
}
