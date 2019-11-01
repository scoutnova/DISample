package tw.scott.playground.Sample04;

import org.junit.jupiter.api.Test;
import tw.scott.playground.util.DiContainer;

import static org.junit.jupiter.api.Assertions.*;

class Sample04Test {

    @Test
    void getPowerInElementWithDI() {
        //Given
        Sample04 sample04 = new Sample04();

        //When
        int actual = sample04.getPowerInElementWithDI();

        //Then
        assertEquals(1000, actual);
    }

    @Test
    void getPowerInElementWithSingleton() {
        //Given
        Sample04 sample04 = new Sample04();

        //When
        int actual = sample04.getPowerInElementWithSingleton();

        //Then
        assertEquals(1000, actual);
    }

    @Test
    void getPowerInElementWithDIForFutureSpec() {
        //Given
        Sample04 sample04 = new Sample04();
        DiContainer.getInstance().inject("ElementDI", new ElementDI(2000));

        //When
        int actual = sample04.getPowerInElementWithDI();

        //Then
        assertEquals(2000, actual);
    }
}