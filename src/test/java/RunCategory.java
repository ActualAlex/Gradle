import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



/**
 * Created by Alex on 27.08.2017.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(MyGroup.class)
@Suite.SuiteClasses({MyGroup.class,MyTest.class,MyTest1.class,MyTest2.class})
public class RunCategory {
}
