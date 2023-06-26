package game;

public class Choice42Deliberately implements GameChoice{
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
        return "1. Смело: Начать сражаться с Назгулами\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Спрятаться в подвале.\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Убегать из трактира.";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {

        return "Ты и ещё несколько хоббитов просто уходите спать в свою комнату." +
                "<p>Ночью на трактир нападают назгулы.";
    }
}
