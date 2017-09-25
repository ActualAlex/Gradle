import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;


import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Alex on 26.08.2017.
 */


public class MyTest {

    @Test
    public void test1() throws Exception {


        assertThat(Arrays.asList("one","two", "three"),hasItems("two"));
     /*   System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://ru.stackoverflow.com");
        Assert.assertEquals("Current url isn't correct","https://ru.stackoverflow.com/",driver.getCurrentUrl());
        driver.quit();*/
    }

    @Test
    public void test2() throws Exception {
        assertThat("albumen", both(containsString("l")).and(containsString("b")));
        /*System.setProperty("webdriver.chrome.driver", "Lib/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ru.stackoverflow.com");
        Assert.assertEquals("Current url isn't correct","https://ru.stackoverflow.com/",driver.getCurrentUrl());
        driver.quit();
*/

    }
    @Test
    public void test3() throws Exception {
       assertEquals("failure-strings are not equals", "text", "text");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before");

    }



    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @BeforeClass
    public static void set() throws Exception {
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("afterClass");

    }

    @Test
    public void testAssertArrayEquals() throws Exception {
        byte[] expected="trial".getBytes();
        byte[] actual="trial".getBytes();
        assertArrayEquals("failure-byte arrays not same", expected, actual);
    }
@Category(MyGroup.class)
@Test
    public void test4() throws Exception {

        Assert.assertThat(" ", "text", is("text"));

    }
    @Ignore("Test is ignored")
    @Test
    public void testSame(){
        assertThat(2,is(1));
    }

}
