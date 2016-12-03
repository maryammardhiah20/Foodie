package stud01_4145.unikl.edu.my.restaurantfoodie;

/**
 * Created by User on 28/11/2016.
 */

public class RestaurantMenu {

    private String foodname;
    private String description;
    private String price;
    private String image;



    public RestaurantMenu(String image, String price, String description, String foodname) {
        this.image = image;
        this.price = price;
        this.description = description;
        this.foodname = foodname;
    }


    public RestaurantMenu(){}


    public String getFoodname() {
        return foodname;
    }

  public void setFoodname(String foodname) {
       this.foodname = foodname;
   }

    public String getDescription() {
        return description;
    }

   public void setDescription(String description) {
       this.description = description;
   }

    public String getPrice() {
        return price;
    }

   public void setPrice(String price) {
      this.price = price;
   }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
