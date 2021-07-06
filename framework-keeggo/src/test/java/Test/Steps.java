package Test;

import java.io.IOException;

import ElementosWeb.Elementos;
import Page.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		metodo.abrirSite(site);
		metodo.clicar(el.getUser());

	}

	@When("realizar Cadastro Usuario")
	public void realizar_cadastro_usuario() throws InterruptedException {
		metodo.espera();
		metodo.clicar(el.getCriarCont());
		metodo.escrever("raimundo0024", el.getUserNome());
		metodo.escrever("raimas@teste.com.br", el.getEmail());
		metodo.escrever("Aa123456", el.getSenha());
		metodo.escrever("Aa123456", el.getConfSenha());
		metodo.escrever("Raimundo", el.getNome());
		metodo.escrever("Ataulfo de Lima", el.getSobreNome());
		metodo.escrever("11987654321", el.getNumTel());
		metodo.combo(el.getCountry(), "Brazil");
		metodo.escrever("Osasco", el.getCidade());
		metodo.escrever("Rua Canoa Furada, 71", el.getEndereco());
		metodo.escrever("SP", el.getEstado());
		metodo.escrever("06789345", el.getCodPostal());
		metodo.clicar(el.getOpcao());
		metodo.espera();
		metodo.clicar(el.getRegistrar());

	}

	@Then("eu valido o Cadastro Usuario")
	public void eu_valido_o_cadastro_usuario() throws IOException, InterruptedException {
		metodo.espera();
		metodo.validarMensagem("raimundo0024", el.getValidarCad());
		metodo.screenShot("validação-cadastro");
		metodo.fecharNavegador();

	}

	@When("realizar Login com Sucesso")
	public void realizar_login_com_sucesso() throws InterruptedException {
		metodo.escrever("raimundo0017", el.getLoginName());
		metodo.escrever("Aa123456", el.getLoginSenha());
		metodo.espera();
		metodo.clicar(el.getEntrar());
	}

	@Then("eu valido o Login com Sucesso")
	public void eu_valido_o_login_com_sucesso() throws IOException, InterruptedException {
		metodo.espera();
		metodo.validarMensagem("raimundo0017", el.getValidarLoginSucesso());
		metodo.screenShot("validação-loginSucesso");
		metodo.fecharNavegador();

	}

	@When("realizar Login Invalido")
	public void realizar_login_invalido() throws InterruptedException {
		metodo.escrever("jeremias006", el.getLoginName());
		metodo.escrever("Aa123756", el.getLoginSenha());
		metodo.espera();
		metodo.clicar(el.getEntrar());

	}

	@Then("eu valido o Login Invalido")
	public void eu_valido_o_login_invalido() throws IOException, InterruptedException {
		metodo.espera();
		metodo.validarMensagem("Incorrect user name or password.", el.getValidarLoginInvalido());
		metodo.screenShot("validação-loginInvalido");
		metodo.fecharNavegador();
	}

	@When("realizar Login em Branco")
	public void realizar_login_em_branco() throws InterruptedException {
		metodo.espera();
		metodo.clicar(el.getEsqLogin());
	}

	@Then("eu valido o Login em Branco")
	public void eu_valido_o_login_em_branco() throws IOException, InterruptedException {
		metodo.screenShot("validação-loginBranco");
		metodo.espera();
		metodo.validarMensagem("Username field is required", el.getValidarLoginBranco());
		metodo.screenShot("validação-loginBranco");
		metodo.fecharNavegador();

	}

}