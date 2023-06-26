package gameTest;

import game.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Choice0Test {
    @Spy
    GameChoice gameChoice = new Choice0();

    public void testSetNext(){
        assertAll( "object comparison",
                () ->assertEquals(Choice1Boldly.class, gameChoice.setNext(1).getClass()),
                () ->assertEquals(Choice1Deliberately.class, gameChoice.setNext(2).getClass()),
                () ->assertEquals(Choice1Cowardly.class, gameChoice.setNext(3).getClass())
                );
    }
}
