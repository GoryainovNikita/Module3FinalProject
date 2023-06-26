package game;

public class Choice2Deliberately implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice3Boldly();
        } else if (choose == 2) {
            this.gameChoice = new Choice3Deliberately();
        } else if (choose == 3) {
            this.gameChoice = new Choice3Cowardly();
        }
        return gameChoice;
    }
    public String getChoice1(){
        return "1. Смело: Нет, я пойду один\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Мне не помешает помощь друзей, пусть их придётся долго уговаривать.\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Взять хоть кого-нибудь, вместе безопасней.";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {

        return "Ты отправляешься в путь, и тебе предстоит выбор, взять ли с собой в дорогу попутчиков.";
    }
}
