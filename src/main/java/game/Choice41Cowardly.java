package game;

public class Choice41Cowardly implements GameChoice{
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
        return "Вы сбежали из трактира, но так как вы не смогли нормально отдохнуть и выспаться, ночью вы засыпаете все, позабыв про безопасность. " +
                "<p>Назгулы находят вас и убивают.";
    }
}
