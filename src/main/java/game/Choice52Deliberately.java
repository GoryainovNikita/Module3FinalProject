package game;

public class Choice52Deliberately implements GameChoice{
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
        return "Одного из твоих попутчиков, схватили Назгулы, и он выдал им где ты прячешься.";
    }
}
