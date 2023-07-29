import com.example.IKitten;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;


@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Lion lion;

    @Mock
    private IKitten kitten;

    private final String name;
    private final Boolean result;

    public LionTest(String name, Boolean result) {
        this.name = name;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void testLionName() throws Exception {
        lion = new Lion(name);
        Assert.assertEquals(result, lion.doesHaveMane());
    }


    @Test
    public void testLionOther() {
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
    public void testGetKittens() {
        lion = new Lion(kitten);
        Mockito.when(lion.getKittens()).thenReturn(1);

        Assert.assertEquals(1, lion.getKittens());
    }


}
