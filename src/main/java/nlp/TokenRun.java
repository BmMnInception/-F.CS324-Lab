package nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.List;


public class TokenRun {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(TokenRun.class);
        logger.info("Begining Java Logger  SLF43");

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String txt = "HI yu bn daa";
        CoreDocument doc = new CoreDocument(txt);

        stanfordCoreNLP.annotate(doc);

        List<CoreLabel> list = doc.tokens();
        for (CoreLabel lbl: list){
            System.out.println(lbl.originalText());
        }

    }
}
