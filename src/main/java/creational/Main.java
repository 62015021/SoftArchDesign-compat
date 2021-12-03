package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException {

        //XML usage
        BookMetadataExporter exporter = new XMLBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        //JSON usage
        BookMetadataExporter jsonExporter = new JSONBookMetadataExporter();
        jsonExporter.add(TestData.sailboatBook);
        jsonExporter.add(TestData.GoFBook);
        jsonExporter.export(System.out);

        //CSV usage
        BookMetadataExporter csvExporter = new CSVBookMetadataExporter();
        csvExporter.add(TestData.sailboatBook);
        csvExporter.add(TestData.GoFBook);
        csvExporter.export(System.out);
    }
}
