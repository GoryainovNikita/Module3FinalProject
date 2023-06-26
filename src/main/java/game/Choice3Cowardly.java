package game;

public class Choice3Cowardly implements GameChoice {
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice42Boldly();
        } else if (choose == 2) {
            gameChoice = new Choice42Deliberately();
        } else if (choose == 3) {
            gameChoice = new Choice42Cowardly();
        }
        return gameChoice;
    }

    public String getChoice1(){
        return "1. Смело: Заступиться, вам ещё вместе идти дальше\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Оставить их разбираться самих, ты их даже не знаешь.\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Спрятаться под столом, вдруг никто не заметит.";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {
        return "Ты набрал всех, кто хотел с тобой пойти, у некоторых ты даже не знаешь имён." +
                "<p>Вы отправляетесь в путь, первая точка на вашем маршруте небольшой трактир, где вы решаете остаться на пару дней и передохнуть." +
                "<p>Твои попутчики изрядно напились и устроили драку, в которой они явно проигрывают.";
    }
}
