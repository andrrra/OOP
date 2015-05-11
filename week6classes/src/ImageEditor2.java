import java.awt.*;

/**
 * Created by Andra on 02.03.2015.
 */
public class ImageEditor2 {
    public static Picture threshold(Picture p, int thresh){
        Picture p2 = new Picture(p.width(), p.height());
        for(int i=0;i<p.width();i++)
            for(int j=0;j<p.height();j++) {
                int l=(int) Math.round(ImageEditor1.luminance(p.get(i, j)));
                if(l<thresh) p2.set(i,j, Color.BLACK);
                else p2.set(i, j, ImageEditor1.toGrey(p.get(i,j)));
            }
        return p2;
    }

    public static void main(String[] args){
        Picture p=new Picture("lion1.jpg");
        Picture t = threshold(p, 120);
        t.show();
    }
}
