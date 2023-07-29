import com.example.Cat;
import com.example.Feline;
import com.example.IKitten;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Lion lion;

    @Mock
    private IKitten kitten;

    @Test
    public void testLionFeMale() throws Exception {
        lion = new Lion("Самка");

        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testLionMale() throws Exception {
        lion = new Lion("Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionMale1() {
        try {
            lion = new Lion("Другое");
        } catch (AssertionError | Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void testGetFood() throws Exception {
        lion = new Lion(kitten);
        Mockito.when(lion.getFood("Хищник")).thenReturn(Collections.singletonList("Хищник"));
        ArrayList<String> data = new ArrayList<>();
        data.add("Хищник");
        Assert.assertEquals(data, lion.getFood("Хищник"));
    }

    @Test
    public void testGetFood2(){
        lion = new Lion(kitten);
        Mockito.when(lion.getKittens()).thenReturn(1);

        Assert.assertEquals(1, lion.getKittens());
    }


}
