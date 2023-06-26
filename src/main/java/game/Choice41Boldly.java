package game;

public class Choice41Boldly implements GameChoice{
    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice5Boldly();
        } else if (choose == 2) {
            gameChoice = new Choice5Deliberately();
        } else if (choose == 3) {
            gameChoice = new Choice5Cowardly();
        }
        return gameChoice;
    }

    public String getChoice1(){
        return "1. Смело: Вступить в драку\n";
    }
    public String getChoice2(){
        return "2. Обдуманно: Попытаться образумить Арагорна.\n";
    }
    public String getChoice3(){
        return "3. Трусливо: Отдать кольцо";
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getText() {
        return "Этим незнакомцем оказывается отважный воин и мудрец Арагорн, готовый сопровождать вас."+
                "<p>Он сопровождает и защищает вас до самого жерла вулкана." +
                "<p>Но в самый ответственный момент, кольцо затуманило рассудок Арагорна и он пытается силой отобрать у вас кольцо и не даёт его сбросить.";
    }
}
