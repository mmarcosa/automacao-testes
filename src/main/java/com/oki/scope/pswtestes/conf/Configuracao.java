package com.oki.scope.pswtestes.conf;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oki.scope.pswtestes.main.MainAppTestes;

public class Configuracao {
	
	WebDriver driver;
	
	private static final Logger logger = LoggerFactory.getLogger(MainAppTestes.class);
	
	@Before
	public void inicializaChrome(){
		System.setProperty("webdriver.chrome.driver", "exe\\chromedriver.exe");
		driver = new ChromeDriver();
		//acessar um site		
		driver.get("https://10.50.17.47:8643/scope/");
		System.out.println("Iniciando browser ..");
		driver.manage().window().maximize();
		logger.info("Inicializando drivers: {}", driver);
	}	
	
	
	@Before
	public void inicializaFirefox(){
		System.setProperty("webdriver.gecko.driver", "exe\\geckodriver.exe");
		driver = new FirefoxDriver();
		//acessar um site		
		driver.get("https://10.50.17.47:8643/scope/");
		System.out.println("Iniciando browser ..");
		driver.manage().window().maximize();
		logger.info("Inicializando drivers: {}", driver);
	}	
	
	@Before
	public void inicializaIE(){
		System.setProperty("webdriver.ie.driver", "exe\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		//acessar um site		
		driver.get("https://10.50.17.47:8643/scope/");
		System.out.println("Iniciando browser ..");
		driver.manage().window().maximize();
		logger.info("Inicializando drivers: {}", driver);
	}
	
	@After
	public void finaliza(){
		System.out.println("==================ACABOU====================");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Browser fechando em 3");
		System.out.println("Browser fechando em 2");
		System.out.println("Browser fechando em 1");
		driver.close();
		logger.info("Inicializando drivers: {}", driver);
	}
	
}
