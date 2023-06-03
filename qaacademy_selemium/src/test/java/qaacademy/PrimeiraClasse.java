package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {

    String cursoPresenciaisBotao = "comp-k7g9c7sd1label";
    int tempoEspera = 2000; // 2 segundos em milissegundos
    String CursoOnline = "//*[@id='comp-k7g9c7sd2label']";
    int tempoEspera1 = 2000; // 2 segundos em milissegundos
    String Contato = "//*[@id='comp-k7g9c7sd3label']";
    int tempoEspera2 = 2000; // 2 segundos em milissegundos
    String Nome = "input_comp-k37gdip8";
    int tempoEspera3 = 2000; // 2 segundos em milissegundos
    String Email = "input_comp-k37gdiq1";
    String Telefone = "input_comp-k37gdipq";
    String Endereço = "input_comp-k37gdiqj";
    String Assunto = "input_comp-k37gdiqy";
    String DigitarMensagem = "textarea_comp-k37gdirc";
    String BotaoEnviar = "//*[@id='comp-k37gdiro']/button";
    int tempoEspera4 = 2000; // 2 segundos em milissegundos
    String AceitarFechar = "/html/body/div[2]/div/span/button/img";
    String NaoSouRobo = "//*[@id='CAPTCHA_DIALOG_ROOT_COMP']/div[2]/div/button/svg/path";
    int tempoEspera5 = 3000; // 3 segundos em milissegundos
    

    @Test
    public void testeAberturaNavegador() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qaacademy.com.br/");
        driver.manage().window().maximize();
        Thread.sleep(tempoEspera);
        driver.findElement(By.id(cursoPresenciaisBotao)).click();
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(CursoOnline)).click();
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(Contato)).click();
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(AceitarFechar)).click();
        WebElement campoNome = driver.findElement(By.id(Nome));
        campoNome.sendKeys("Leonardo");
        WebElement campoEmail = driver.findElement(By.id(Email));
        campoEmail.sendKeys("lr87santos@gmail.com");
        WebElement campoTelefone = driver.findElement(By.id(Telefone));
        campoTelefone.sendKeys("(11) 985845674");
        WebElement campoEndereço = driver.findElement(By.id(Endereço));
        campoEndereço.sendKeys("Rua Cambará, 228");
        WebElement campoAssunto = driver.findElement(By.id(Assunto));
        campoAssunto.sendKeys("Curso de automação de API");
        WebElement campoDigitar = driver.findElement(By.id(DigitarMensagem));
        campoDigitar.sendKeys("Tenho interesse no curso de Automação de API");
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(BotaoEnviar)).click();
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(NaoSouRobo)).click();
        Thread.sleep(tempoEspera);
        

        // Rolagem automática de scroll
        Thread.sleep(tempoEspera);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)");
        
    }
}