package game;

public class Choice42Boldly implements GameChoice{
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
        return "Ты заступился за своих попутчиков, но в драке какой-то незнакомец пырнул тебя ножом.";
    }
}
