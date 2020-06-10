import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APS {

    static WebDriver driver = null;
    private static String namePaginaPrincipal;

    public APS() {
    }

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Guilherme\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        namePaginaPrincipal = driver.getWindowHandle();
    }

    @Test
    public void testaNomeOk() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        WebElement resultado = driver.findElement(By.id("resultado"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
        alert.accept();
    }

    @Test
    public void testaNomeErro() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        WebElement resultado = driver.findElement(By.id("resultado"));
        inputNome.sendKeys("");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Assert.assertEquals(resultado.getText(), "Preencha o campo nome");
    }

    @Test
    public void testaEnderecoOk() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
        alert.accept();
    }

    @Test
    public void testaEnderecoErro() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        WebElement resultado = driver.findElement(By.id("resultado"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Assert.assertEquals(resultado.getText(), "Preencha o campo endereco");
    }

    @Test
    public void testaSexoOk() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
        alert.accept();

    }

    @Test
    public void testaSexoErro() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        WebElement resultado = driver.findElement(By.id("resultado"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("...");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Assert.assertEquals(resultado.getText(), "Selecione um valor para o campo sexo");
    }

    @Test
    public void testaIdadeOk() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("69");
        btnSubmit.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Cadastro realizado com sucesso");
        alert.accept();
    }

    @Test
    public void testaIdadeErro() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        WebElement inputNome = driver.findElement(By.id("nome"));
        WebElement inputEndereco = driver.findElement(By.id("endereco"));
        WebElement inputSexo = driver.findElement(By.id("sexo"));
        WebElement inputIdade = driver.findElement(By.id("idade"));
        WebElement btnSubmit = driver.findElement(By.id("botao_somar"));
        WebElement resultado = driver.findElement(By.id("resultado"));
        inputNome.sendKeys("Guilherme Jesus");
        inputEndereco.sendKeys("Avenida Assis Brasil");
        inputSexo.sendKeys("f");
        inputIdade.sendKeys("j");
        btnSubmit.click();
        Assert.assertEquals(resultado.getText(), "Preencha o campo idade, somente com numeros");
    }

    @Test
    public void testaTitulo() {
        driver.get("C:\\Users\\Guilherme\\Downloads\\trabalho2-1.html");
        Assert.assertEquals("Trabalho 2-1", driver.getTitle());
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
