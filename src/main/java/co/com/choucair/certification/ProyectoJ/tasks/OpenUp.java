package co.com.choucair.certification.ProyectoJ.tasks;

import co.com.choucair.certification.ProyectoJ.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
