package prototype.demo;

/**
 * Created by levent_j on 16-11-22.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WordDocument originDoc = new WordDocument();
        originDoc.setmText("origin text");
        originDoc.addmImages("origin image1");
        originDoc.addmImages("origin image2");
        originDoc.addmImages("origin image3");
        originDoc.showDocument();

        WordDocument doc2 = (WordDocument) originDoc.clone();
        doc2.showDocument();

        doc2.setmText("doc2 text");
        doc2.showDocument();

        originDoc.showDocument();
    }
}
