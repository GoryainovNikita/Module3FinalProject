package game;

public class Choice3Deliberately implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice41Boldly();
        } else if (choose == 2) {
            gameChoice = new Choice42Deliberately();
        } else if (choose == 3) {
            gameChoice = new Choice41Cowardly();
        }
        return gameChoice;
    }

    public String getChoice1(){
        return "1. Смело: Подойти к нему\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Не связываться с ним и уйти спать.\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Собраться и сбежать с трактира.";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {

        return "Друзей пришлось долго уговаривать, но в итоге все согласны разделить с тобой эту ношу." +
                "<p>Вы отправляетесь в путь, первая точка на вашем маршруте небольшой трактир, где вы решаете остаться на пару дней и передохнуть." +
                "<p>В углу трактира сидит какой-то незнакомец, который постоянно смотрит на вас.";
    }
}
