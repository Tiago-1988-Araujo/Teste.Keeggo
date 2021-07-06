package ElementosWeb;

import org.openqa.selenium.By;

public class Elementos {
	
	/********************************************Elementos Cadastro Usuário*************************************/
	
	private By user = By.id("menuUserLink");
	private By criarCont = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By userNome = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By confSenha = By.name("confirm_passwordRegisterPage");
	private By nome =  By.name("first_nameRegisterPage");
	private By sobreNome = By.name("last_nameRegisterPage");
	private By numTel = By.name("phone_numberRegisterPage");
	private By country = By.name("countryListboxRegisterPage");
	private By cidade = By.name("cityRegisterPage");
	private By endereco = By.name("addressRegisterPage");
	private By estado = By.name("state_/_province_/_regionRegisterPage");
	private By codPostal = By.name("postal_codeRegisterPage");
	private By opcao = By.name("i_agree");
	private By registrar = By.id("register_btnundefined");
	private By validarCad = By.xpath("//*[@id=\"menuUserLink\"]/span"); //*[@id="menuUserLink"]/span
	
	/*******************************************Elementos Login Sucesso*********************/
	private By loginName = By.name("username");
	private By loginSenha = By.name("password");
	private By entrar = By.xpath("//*[@id=\"sign_in_btnundefined\"]");
	private By validarLoginSucesso =  By.xpath("//*[@id=\"menuUserLink\"]/span");
	
	
	/******************************************Elementos Login Inválido********************************/
	
	
	
	private By validarLoginInvalido = By.id("signInResultMessage");
	
	
	/******************************************Elementos Login em Branco**********************************/
	
	
	private By esqLogin = By.xpath("/html/body/login-modal/div/div/div[3]/a[1]");
	private By validarLoginBranco = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/label");
	
	
	
	/*************************************Métodos Especiais Públicos**************************************/
	
	
	public By getValidarLoginBranco() {
		return validarLoginBranco;
	}
	public By getLoginName() {
		return loginName;
	}
	public By getLoginSenha() {
		return loginSenha;
	}
	public By getEntrar() {
		return entrar;
	}
	public By getUser() {
		return user;
	}
	public By getCriarCont() {
		return criarCont;
	}
	public By getUserNome() {
		return userNome;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfSenha() {
		return confSenha;
	}
	public By getNome() {
		return nome;
	}
	public By getSobreNome() {
		return sobreNome;
	}
	public By getNumTel() {
		return numTel;
	}
	public By getCountry() {
		return country;
	}
	public By getCidade() {
		return cidade;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getEstado() {
		return estado;
	}
	public By getCodPostal() {
		return codPostal;
	}
	public By getOpcao() {
		return opcao;
	}
	public By getRegistrar() {
		return registrar;
	}
	public By getValidarCad() {
		return validarCad;
	}
	public By getValidarLoginSucesso() {
		return validarLoginSucesso;
	}
	public By getValidarLoginInvalido() {
		return validarLoginInvalido;
	}
	public By getEsqLogin() {
		return esqLogin;
	}

}
