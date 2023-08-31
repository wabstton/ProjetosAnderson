package Visto2;

import java.io.FileWriter;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

public class Application {
	public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Iron_Maiden").get();
            Elements titleElements = doc.getElementsByTag("title");

            if (!titleElements.isEmpty()) {
                Element titleElement = titleElements.first();
                String titleText = titleElement.text();

                String txtFilePath = "titulo.txt";
                try (FileWriter writer = new FileWriter(txtFilePath)) {
                    writer.write(titleText);
                }

                System.out.println("Título salvo no arquivo " + txtFilePath);
            } else {
                System.out.println("Nenhuma tag <title> encontrada na página.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
