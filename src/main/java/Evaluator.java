import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

import java.io.IOException;

public class Evaluator {
    public static void main(String[] args) throws IOException, TasteException {
        RandomUtils.useTestSeed();
        DataModel dataModel = new Rec().getMovieModel();
        RecommenderEvaluator recommenderEvaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        RecBuilder recBuilder = new RecBuilder();
        double error = recommenderEvaluator.evaluate(recBuilder, null, dataModel, 0.9, 1.0);
        System.out.println("The current system has an error percentage of : ");
        System.out.println(error);
    }
}