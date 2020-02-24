package nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Lemma {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Lemma.class);

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String txt = "java. went. Hello World JavaScript.";
        CoreDocument doc = new CoreDocument(txt);

        stanfordCoreNLP.annotate(doc);
        List<CoreLabel> lblList = doc.tokens();
        for (CoreLabel lbl : lblList){
            String lemma = lbl.lemma();
            System.out.println(lbl.originalText() + " - " + lemma);
        }
    }
}
