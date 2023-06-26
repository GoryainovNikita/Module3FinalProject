package game;

public class Choice1Boldly implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice2Boldly();
        } else if (choose == 2) {
            gameChoice = new Choice2Deliberately();
        } else if (choose == 3) {
            gameChoice = new Choice2Cowardly();
        }
        return gameChoice;
    }
    public String getChoice1(){
        return "1. Смело: \"Да как ты посмел?!\" Наброситься на него с ножом\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Понять Гендальфа и согласиться взять кольцо\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Убежать через окно в задней стене.";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {
        return "Гендальф ломает дверь и заходит в дом.";
    }
}
