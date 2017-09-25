import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Alex on 27.08.2017.
 */
@RunWith(Parameterized.class)
public class Parametr {
    @Parameterized.Parameter
        public String url;

      /*  public Parametr(String url) {
            this.url = url;
        }*/

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{"https://ru.stackoverflow.com/"},{"https://www.google.com.ua/?gfe_rd=cr&ei=6nSiWcraLK_i8Aeu87nAAw"},{"https://translate.google.ru/"}});
    }

    @Test
        public void test() throws Exception {
            System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get(url);
            Assert.assertEquals("Current url isn't correct", url, driver.getCurrentUrl());
            driver.quit();
        }

    }
