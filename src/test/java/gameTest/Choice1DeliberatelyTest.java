package gameTest;

import game.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Choice1DeliberatelyTest {
    @Spy
    GameChoice gameChoice = new Choice1Deliberately();

    public void testSetNext(){

        assertEquals(Choice2Deliberately.class, gameChoice.setNext(1).getClass());

    }
}
