package selenium.app.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;



public class GerenciamentoDriver {
	protected ChromeDriver driver;

	Config config = new Config();

	public GerenciamentoDriver() {
		System.setProperty(config.pacoteChromeDrive, config.conexaoLocal);
		this.driver = new ChromeDriver();
	}

	@Before
	public void inicializaNavegador() throws InterruptedException {
		driver.get(config.urlCronApp);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@After
	public void encerraNavegador() {
		driver.quit();
	}
}
