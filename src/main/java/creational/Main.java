package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException{

//        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage JSONBookMetadataExporter
        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        System.out.println(exporter.export());

        // Expected usage XMLBookMetadataExporter
        BookMetadataExporter exporterXML = new XMLBookMetadataExporter();
        exporterXML.add(TestData.sailboatBook);
        exporterXML.add(TestData.GoFBook);
        System.out.println(exporterXML.export());

        // Expected usage CSVBookMetadataExporter
        BookMetadataExporter exporterCSV = new CSVBookMetadataExporter();
        exporterCSV.add(TestData.sailboatBook);
        exporterCSV.add(TestData.GoFBook);
        System.out.println(exporterCSV.export());
        //test
    }
}
