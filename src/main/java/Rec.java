import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;

public class Rec {
    public DataModel getBookModel() throws IOException {
        return getModel("books.csv");
    }

    private DataModel getModel(String path) throws IOException {
        File file = new File("src/main/resources/" + path);
        return new FileDataModel(file);
    }

    public DataModel getMovieModel() throws IOException {
        return getModel("movies.csv");
    }
}