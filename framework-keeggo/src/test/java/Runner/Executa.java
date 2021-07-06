package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Caminho das Features
		features = "./src/test/resources/test.feature",
		// caminho dos staps
		glue = "Test",
		// tag para indicar qual teste deverá ser executado
		tags = "@executa",
		// pretty deixa o console igual a execução do cucumber
		plugin = { "pretty", "html:target/report.json" },
		// nÃ£o executar o teste, validar se foi incluso algum novo bdd,
		// FALSE
		dryRun = false,

		monochrome = true

)

public class Executa {

}
