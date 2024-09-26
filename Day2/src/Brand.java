public class Brand extends Category {
    String brandName;
    @Override
    public void Display(){
        super.Display();
        System.out.println("Brand Name: " + brandName);
    }
}
