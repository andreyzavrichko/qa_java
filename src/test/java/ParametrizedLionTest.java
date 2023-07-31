import com.example.IKitten;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Lion lion;

    private final String name;
    private final Boolean result;

    public ParametrizedLionTest(String name, Boolean result) {
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

}
