package game;

public class Choice52Cowardly implements GameChoice{
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
        return "Ты пытаешься спастись что есть сил, но в суматохе теряешь кольцо, которое находят Назгулы.";
    }
}
