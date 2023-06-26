package game;

public class Choice5Boldly implements GameChoice{
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
        return "Вы с друзьями пытаетесь помешать Арагорну отобрать кольцо, но в суматохе драки кольцо само выпадает и летит в жерло. " +
                "<p>После уничтожения кольца, Арагорн приходит в себя, он не понимает что произошло и что он только что творил." +
                "<p><h2>Мир спасен!<h2>";
    }
}
