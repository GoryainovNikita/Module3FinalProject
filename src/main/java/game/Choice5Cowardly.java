package game;

public class Choice5Cowardly implements GameChoice{
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
        return "Арагорн забирает кольцо." +
        "<p>С помощью кольца он убивает Назгулов, но не может справиться с злыми чарами Саура, и в итоге становиться его приспешником.";
    }
}
