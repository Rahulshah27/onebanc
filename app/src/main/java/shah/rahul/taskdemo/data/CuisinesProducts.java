package shah.rahul.taskdemo.data;

public class CuisinesProducts {
    private String mName;
    private Integer mImage;

    public CuisinesProducts(){}
    public CuisinesProducts(String Name, Integer Image) {

        this.mName = Name;
        this.mImage = Image;
    }

    public void setName(String name) {
        this.mName= name;
    }
    public void setImage(Integer image) {
        this.mImage= image;
    }


    public String getName() {
        return mName;
    }
    public Integer getImage() {
        return mImage;
    }

}