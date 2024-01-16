package my_json;

 /*
Використовуючи JSON підключитися до НБУ та дізнатися про поточний курс валют (GBP, USD, EUR) по відношенню до гривні.
 */


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}