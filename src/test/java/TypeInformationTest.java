import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.*;

/**
 * Created by randallcrame on 2/15/17.
 */
public class TypeInformationTest {

Class c;
    @Before
    public void setUp(){

            c = String.class;
    }

    @Test
    public void classImplementsInterfaceObjectTest(){
        boolean actual = TypeInformation.classImplementsInterface(c, CharSequence.class);
        Assert.assertTrue("String implements CharSequence", actual);
    }

}
