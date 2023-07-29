import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Cat cat;

    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(Collections.singletonList("Хищник"));
        ArrayList<String> data = new ArrayList<>();
        data.add("Хищник");
        Assert.assertEquals(data, cat.getFood());
    }

}
