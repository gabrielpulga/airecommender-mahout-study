import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

import java.io.IOException;
import java.util.List;

public class RecBooks {
    public static void main(String[] args) throws IOException, TasteException {
        DataModel books = new Rec().getBookModel();
        Recommender recommender = new RecBuilder().buildRecommender(books);
        List<RecommendedItem> recommendedItemList = recommender.recommend(4, 4);
        System.out.println("User 4");
        System.out.println("Perhaps you may like the following books :");
        for (RecommendedItem recommendedItem : recommendedItemList) {
            System.out.println(recommendedItem);
        }
    }
}
