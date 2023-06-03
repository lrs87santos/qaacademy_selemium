package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSite {

    
    String Celulares = "//*[@id='rsyswpsdk']/div/header/div[1]/div[2]/main/div[2]/div[2]/span/a";
    int tempoEspera = 2000; // 2 segundos em milissegundos
    String galaxyM12 = "//*[@id='rsyswpsdk']/div/main/div/div[2]/div[2]/section/div[1]/ul/li[1]/a";
    int tempoEspera1 = 2000; // 2 segundos em milissegundos

    /**
     * @throws InterruptedException
     */
    @Test
    public void testeAberturaNavegador() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.americanas.com.br//");
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(Celulares)).click();
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(galaxyM12)).click();
        Thread.sleep(tempoEspera);

    }

}