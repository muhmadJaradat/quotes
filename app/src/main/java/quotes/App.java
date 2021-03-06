/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package quotes;

import java.io.*;



public class App {
    private  static String pathUrl="app/src/main/resources/quotes.JSON";

    public static void main(String[] args) throws IOException {
        try {
            QuotesFromWeb webQuote = new QuotesFromWeb();

            System.out.println(webQuote.WebQuoteGetter());
        } catch (IOException e) {
            // If no internet, will print random quote from file.
            QuotesFromFile fileQuote = new QuotesFromFile();
            System.out.println(fileQuote.fromJson(pathUrl));
        }

    }


}
