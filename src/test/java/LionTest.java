import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    private Feline feline;


    @Test
    public void testLionOther() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Другое");
        });
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void testGetKittens() {
        Lion lion = new Lion(feline);
        int expectedNumber = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedNumber);
        Assert.assertEquals(expectedNumber, lion.getKittens());
    }


}
