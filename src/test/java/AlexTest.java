import com.example.Alex;
import com.example.IKitten;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    private IKitten kitten;

    @Test
    public void testGetFriends() {
        Alex alex = new Alex(kitten);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        Alex alex = new Alex(kitten);
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        Alex alex = new Alex(kitten);
        Assert.assertEquals(0, alex.getKittens());
    }


}
