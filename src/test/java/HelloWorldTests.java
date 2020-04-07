import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTests {
    @Test
    public void mainTest() {
        // test a static method
        String[] args = {"arg1", "arg2"};
        HelloWorld.main(args);
    }

    @Test
    public void test_method1() {
        // test an instance method
        HelloWorld hw = new HelloWorld();
        Assert.assertEquals("arg1arg", hw.method1("arg1", "arg2"));
    }
}
