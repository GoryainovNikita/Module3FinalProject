package game;

public class Choice3Boldly implements GameChoice{
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
        return "Ночью, когда ты разбил лагерь где-то в лесу, на тебя напали и загрызли волки.";
    }
}
