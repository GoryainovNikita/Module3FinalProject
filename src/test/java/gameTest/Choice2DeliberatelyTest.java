package gameTest;

import game.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class Choice2DeliberatelyTest {
    @Spy
    GameChoice gameChoice = new Choice2Deliberately();

    public void testSetNext(){
        assertAll( "object comparison",
                () ->assertEquals(Choice3Boldly.class, gameChoice.setNext(1).getClass()),
                () ->assertEquals(Choice3Deliberately.class, gameChoice.setNext(2).getClass()),
                () ->assertEquals(Choice3Cowardly.class, gameChoice.setNext(3).getClass())
        );
    }
}
