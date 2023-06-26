package game;

public class Choice2Cowardly implements GameChoice{
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
        return "Ты трусливо вылазишь через окно, Гендальф бросается в погоню." +
                "<p>Чтобы замести следы ты хочешь переплыть реку, но течение оказывается слишком сильным и ты тонешь.";
    }
}
