package co.com.choucair.automation.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UA = Target.the("Select Academy")
            .located(By.xpath("//div[@class='nav-sidebar-item__link nav-sidebar-item__link--selected']//[contains(text(),'Academy')]"));
    public static final Target INPUT_COURSE = Target.the("Course search")
            .located(By.id("searchInput"));
    public static final Target TAKE_COURSE = Target.the("Click to select the course")
            .located(By.xpath("//div[@class='course-track-view']//[contains(aria-label(),'Take Course - 1. Introduction to uTest')]"));
    public static final Target NAME_COURSE = Target.the("Gets the course name")
            .located(By.xpath("//h2[contains(text(),'1. Introduction to uTest')]"));
}
