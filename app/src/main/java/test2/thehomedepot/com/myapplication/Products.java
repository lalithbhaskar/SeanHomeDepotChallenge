package test2.thehomedepot.com.myapplication;

/**
 * Created by lalithbhaskar on 2/23/18.
 */

public class Products {
    String name;
    String label;
    String photoId;

    Products(String name, String label, String photoId) {
        this.name = name;
        this.label= label;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
