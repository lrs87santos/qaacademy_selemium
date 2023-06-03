import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarCampo {

    String PrimeiroNome = "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
    int tempoEspera1 = 2000; // 2 segundos em milissegundos

    String SobreNome = "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
    int tempoEspera2 = 2000; // 2 segundos em milissegundos

    String Endereco = "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
    int tempoEspera3 = 2000; // 2 segundos em milissegundos

    String Email = "//*[@id='eid']/input";
    int tempoEspera4 = 2000; // 2 segundos em milissegundos

    String Telefone = "//*[@id='basicBootstrapForm']/div[4]/div/input";
    int tempoEspera5 = 2000; // 2 segundos em milissegundos

    String Sexo = "//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input";
    int tempoEspera6 = 2000; // 2 segundos em milissegundos

    String EscolherArquivo = "//*[@id='imagesrc']";
    int tempoEspera7 = 2000; // 2 segundos em milissegundos

    String Filmes = "checkbox2";
    int tempoEspera8 = 2000; // 2 segundos em milissegundos

    String Idioma1 = "//*[@id='msdd']";
    int tempoEspera9 = 2000; // 2 segundos em milissegundos

    String Idioma = "//*[@id='//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[29]/a";
    int tempoEspera10 = 2000; // 2 segundos em milissegundos

    String País = "//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul";
    int tempoEspera11 = 2000; // 2 segundos em milissegundos

    String Java = "//*[@id='Skills']/option[39]";
    int tempoEspera12 = 2000; // 2 segundos em milissegundos

    String ClicarPais = "//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span";

    String EscolherPais = "//*[@id='select2-country-results']/li[2]";
    int tempoEspera13 = 2000; // 2 segundos em milissegundos

    String Ano = "//*[@id='yearbox']";

    String Ano1 = "//*[@id='yearbox']/option[73]";

    @Test
    public void testeCadastro() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        WebElement campoNome = driver.findElement(By.xpath(PrimeiroNome));
        campoNome.sendKeys("Leonardo");

        WebElement campoSobrenome = driver.findElement(By.xpath(SobreNome));
        campoSobrenome.sendKeys("Santos");

        WebElement campoEndereco = driver.findElement(By.xpath(Endereco));
        campoEndereco.sendKeys("Rua Cambará");

        WebElement campoEmail = driver.findElement(By.xpath(Email));
        campoEmail.sendKeys("lr87santos@mail.com");

        WebElement campoTelefone =driver.findElement(By.xpath(Telefone));
        campoTelefone.sendKeys("(11) 985845674");

        driver.findElement(By.xpath(Sexo)).click();
        Thread.sleep(tempoEspera6);

       // driver.findElement(By.xpath(EscolherArquivo)).click();
       // Thread.sleep(tempoEspera7);

        driver.findElement(By.id(Filmes)).click();
        Thread.sleep(tempoEspera8);

          // Rolagem automática de scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)");

        driver.findElement(By.xpath(Java)).click();
        Thread.sleep(tempoEspera12);

        driver.findElement(By.xpath(Idioma1)).click();
        Thread.sleep(tempoEspera9);  

        js.executeScript("window.scrollBy(0, 350)");

       // driver.findElement(By.xpath(País)).click();
       // Thread.sleep(tempoEspera11);

        js.executeScript("window.scrollBy(0, 350)");

       // driver.findElement(By.xpath(Idioma)).click();
        //Thread.sleep(tempoEspera10);

        js.executeScript("window.scrollBy(0, 350)");

       // driver.findElement(By.xpath(ClicarPais)).click();
       // Thread.sleep(tempoEspera10);

        driver.findElement(By.xpath(EscolherPais)).click();
        Thread.sleep(tempoEspera10);

        driver.findElement(By.xpath(Ano));
        js.executeScript("window.scrollBy(0, 350)");
        driver.findElement(By.xpath(Ano1));





        

        

    }

    
}
