package co.com.choucair.certification.ProyectoJ.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_CYC = Target.the("Select the section courses and certifications")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("click button go for the search course")
            .located(By.xpath("//Button[contains(@Type, 'sub')]"));

    public static final Target SELECT_COURSE = Target.the("select the course")
            .located(By.linkText("Foundation Express"));

    public static final Target SELECT_NAME = Target.the("Extract course name")
            .located(By.xpath("//h1[contains(text(), 'Foundation Express')]"));

}
