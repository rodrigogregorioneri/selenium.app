package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium.app.util.Config;





public class PageElementLogin {
	protected ChromeDriver driver;
	protected WebElement elemento;
	protected WebElement elementoAlvo;
	protected Actions action;
	protected Robot robot;
	protected int vkEsc = KeyEvent.VK_ESCAPE;
	protected int vkEnter = KeyEvent.VK_ENTER;
    
	
	private String usuario;
	private String senha;
	
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	Config config = new Config();
	
	public PageElementLogin(ChromeDriver driver){
		this.driver = driver;
	}
	
	public void txtUsuario() throws InterruptedException{
		Thread.sleep(1000);
		elemento = driver.findElementById("username");
		elemento.sendKeys(usuario);

	}

	// campo Senha
	public void txtSenha() throws InterruptedException{
		Thread.sleep(500);
		elemento = driver.findElementById("password");
		elemento.sendKeys(senha);
	}
	
	
	public void btnEntrar() throws InterruptedException{
		Thread.sleep(2000);
		int aguarde = 1;
		
		do {
			try {
				elemento = driver.findElementById("btn_logar");
				elemento.click();
				aguarde=6;
			} catch (Exception e) {
				System.out.println("Aguardando carregamento da página, tetantiva = "+ aguarde + ". Esperando botão Entrar.");
				Thread.sleep(5000);
				
				aguarde++;
			}
		}while(aguarde
				!= 6);

	}
	
	
	
	
}