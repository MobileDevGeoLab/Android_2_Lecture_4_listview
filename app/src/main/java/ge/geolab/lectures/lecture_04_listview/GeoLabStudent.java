package ge.geolab.lectures.lecture_04_listview;

/**
 * Created by GeoLab on 10/26/15.
 */
public class GeoLabStudent {
    private String name, surName;
    private int image;

    public GeoLabStudent(String name, String surName, int image) {
        this.name = name;
        this.surName = surName;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
