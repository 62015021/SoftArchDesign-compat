package creational;

import java.io.IOException;
import java.io.PrintStream;

public class CVSBookMetadataExporter  extends BookMetadataExporter{

        BookMetadataFormatter bookMetadataFormatter = new CSVBookMetadataFormatter();

        CVSBookMetadataExporter() throws IOException {
        }

        @Override
        public void export(PrintStream stream) {
            stream.println(bookMetadataFormatter.getMetadataString());
        }

        @Override
        public void add(Book b) {
            bookMetadataFormatter.append(b);
        }

}
