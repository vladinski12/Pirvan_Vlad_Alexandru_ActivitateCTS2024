package Tests.Suite;

import Tests.Categorii.CuMock;
import Tests.Categorii.FaraMock;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@org.junit.runners.Suite.SuiteClasses({Tests.PachetTuristicTest.class, Tests.PersoanaTest.class})
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {
}
