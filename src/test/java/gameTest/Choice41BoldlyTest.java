package gameTest;

import game.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class Choice41BoldlyTest {
    @Spy
    GameChoice gameChoice = new Choice41Boldly();

    public void testSetNext(){
        assertAll( "object comparison",
                () ->assertEquals(Choice5Boldly.class, gameChoice.setNext(1).getClass()),
                () ->assertEquals(Choice5Deliberately.class, gameChoice.setNext(2).getClass()),
                () ->assertEquals(Choice5Cowardly.class, gameChoice.setNext(3).getClass())
        );
    }
}
