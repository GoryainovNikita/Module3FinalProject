package game;

public class Choice42Cowardly implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        return gameChoice;
    }
    public String getChoice1(){
        return "";
    }
    public String getChoice2(){
        return "";
    }
    public String getChoice3(){
        return "";
    }
    @Override
    public boolean winner() {
        return true;
    }

    public String getText() {
        return "Тебя всё таки находят, и убивают в потасовке.";
    }
}
