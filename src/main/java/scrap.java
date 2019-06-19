import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class scrap {
    public static void main(String[] args) {
//        for (int i = 1; i <= 1 ; i++) {
            scraping(1);
//        }
    }

    public static void scraping(int x) {

        System.setProperty("webdriver.gecko.driver", "/home/azzam/Downloads/geckodriver");
        String url = "https://www.linkedin.com/directory/companies-"+ (char)(x+96);

            WebDriver driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://inogit.com");
            WebElement link;
            link = driver.findElement(By.linkText("Projects"));
            link.click();
            Thread.sleep(5000);
            WebElement searchBox;
            searchBox = driver.findElement(By.id())


        String pageSource = driver.getPageSource();

        System.out.println(pageSource);
//            WebClient webClient = new WebClient(BrowserVersion.FIREFOX_60);
//            webClient.getOptions().setTimeout(20000);
//            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
//            webClient.getOptions().setCssEnabled(true);
//            webClient.getOptions().setJavaScriptEnabled(true);
//            webClient.getOptions().setUseInsecureSSL(true);
//            webClient.getOptions().setRedirectEnabled(true);

//            HtmlPage page = webClient.getPage("https://www.inogit.com");

//            String htmlContent = page.();
//            System.out.println(page.getAnchors());

//            File htmlFile = new File("C:/index.html");
//            PrintWriter pw = new PrintWriter(htmlFile, true);
//            pw.print(htmlContent);
//            pw.close()

//            Connection con = Jsoup.connect(url)
//                    .userAgent("Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36")
//                    .timeout(10000);
//
//            Connection.Response response = con.execute();
//            Document doc;
//            if (response.statusCode()== 200){
//                doc = con.get();
//                System.out.println(doc.title());
//
//            }


//            Elements el = doc.getElementsByClass("content");
//
//
//            System.out.println(el.text());



    }

}