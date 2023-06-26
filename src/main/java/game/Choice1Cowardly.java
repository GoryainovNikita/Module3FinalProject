package game;

public class Choice1Cowardly implements GameChoice{

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

        return "Гендальф уходит, подумав, что Бильбо уже рассказал тебе о твоей миссии и ты ушёл вместе с ним. " +
                "<p>Гендальф уезжает искать тебя в Ривенделле." +
                "<p>Ты живёшь как и раньше, наслаждаешься миром и природой, но через пару дней приходят Назгулы, сжигают всю деревню и забирают кольцо.";
    }
}
