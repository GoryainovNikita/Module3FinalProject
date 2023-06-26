package game;

public class Choice0 implements GameChoice{

    private GameChoice gameChoice;

    public GameChoice setNext(int choose) {
        if(choose == 1){
            this.gameChoice = new Choice1Boldly();
        } else if (choose == 2) {
            gameChoice = new Choice1Deliberately();
        } else if (choose == 3) {
            gameChoice = new Choice1Cowardly();
        }
        return gameChoice;
    }

    @Override
    public boolean winner() {
        return false;
    }

    public String getChoice1(){
        return "1. Смело: Крикнуть Гендальфу через закрытую дверь, сказав, что он сильней, он и должен нести кольцо.";
    }
    public String getChoice2(){
        return "2. Обдуманно: Открыть дверь, Гендальф мой друг, он не будет подвергать меня такой опасности.";
    }
    public String getChoice3(){
        return "3. Трусливо: Спрятаться под одеялом и претвориться, что тебя здесь нет.";
    }

    public String getText() {

        return "Одним прекрасным днём ты проснулся от стука в дверь."+
                "<p>Это Гендальф, приехал сказать тебе, что Бильбо уехал доживать свои дни в Ривенделл," +
                "<p>что зло снова восстало и тебе придётся взять кольцо и уничтожить его.";
    }
}
