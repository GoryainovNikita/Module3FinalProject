package gameTest;

import game.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class Choice3CowardlyTest {
    @Spy
    GameChoice gameChoice = new Choice3Cowardly();

    public void testSetNext(){
        assertAll( "object comparison",
                () ->assertEquals(Choice42Boldly.class, gameChoice.setNext(1).getClass()),
                () ->assertEquals(Choice42Deliberately.class, gameChoice.setNext(2).getClass()),
                () ->assertEquals(Choice42Cowardly.class, gameChoice.setNext(3).getClass())
        );
    }
}
