import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {

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
        Lion lion = new Lion(name);
        Assert.assertEquals(result, lion.doesHaveMane());
    }

}
