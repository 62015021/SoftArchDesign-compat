package creational;

import java.io.IOException;
import java.io.PrintStream;

public class JSONMetadataExporter extends BookMetadataExporter{

    BookMetadataFormatter bookMetadataFormatter = new JSONBookMetadataFormatter();

    public JSONMetadataExporter() throws IOException {
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
