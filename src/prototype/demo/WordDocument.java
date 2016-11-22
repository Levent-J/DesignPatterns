package prototype.demo;

import java.util.ArrayList;

/**
 * Created by levent_j on 16-11-22.
 */
public class WordDocument implements Cloneable{
    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("------------WordDocument的构造函数------------");
    }

    public void showDocument(){
        System.out.println("-----------Word Content Start-----------");
        System.out.println("text="+mText);
        System.out.println("Images=");
        for (String mImage : mImages) {
            System.out.println("Image name="+mImage);
        }
        System.out.println("-----------Word Content End-----------");
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addmImages(String mImage) {
        this.mImages.add(mImage);
    }

    @Override
    protected Object clone() {
        WordDocument doc = null;
        try {
            doc = (WordDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        doc.mText = this.mText;
        doc.mImages = this.mImages;
        return doc;
    }
}
