package game;

public class Choice1Deliberately implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {

        return gameChoice = new Choice2Deliberately();
    }
    public String getChoice1(){
        return "";
    }
    public String getChoice2(){
        return "";
    }
    public String getChoice3() {
        return "";
    }
    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {
        return "Гендальф силой и убеждениями заставляет взять кольцо.";
    }
}
