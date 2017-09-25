import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Alex on 26.08.2017.
 */
public class MyTest2 {
    @Test
    public void test1() throws Exception {

        System.out.println("test1");
     /*   System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://ru.stackoverflow.com");
        Assert.assertEquals("Current url isn't correct","https://ru.stackoverflow.com/",driver.getCurrentUrl());
        driver.quit();*/
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test2");

        /*System.setProperty("webdriver.chrome.driver", "Lib/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ru.stackoverflow.com");
        Assert.assertEquals("Current url isn't correct","https://ru.stackoverflow.com/",driver.getCurrentUrl());
        driver.quit();
*/

    }
    @Test
    public void test3() throws Exception {
        System.out.println("test3");
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
}
