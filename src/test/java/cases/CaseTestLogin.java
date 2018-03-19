package cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.PageElementLogin;
import selenium.app.util.Config;
import selenium.app.util.GerenciamentoDriver;




public class CaseTestLogin extends GerenciamentoDriver{
	Config config = new Config();
	PageElementLogin login = new PageElementLogin(driver);
	
	public void inicio() throws InterruptedException {
		System.out.println("CronApp - Login");
		login.btnEntrar();
		
		login.setUsuario("email");
		login.setSenha("senha");
		login.txtUsuario();
		login.btnEntrar();
		login.txtSenha();
		login.btnEntrar();
		Thread.sleep(5000);
	}
	
	@Test
	public void executaLogin() throws InterruptedException {
		inicio();
	}
	
	@After
	public void encerraNavegador() {
		driver.quit();
	}

}