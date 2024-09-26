public class Inheritance {
    public static void main(String[] args) {
        Category cat = new Category ();
        cat.proname = "Apple";
        cat.proprice=100;
        cat.proid=123;
        cat.catName="Automobile";
        cat.catId=456;
        Brand bc = new Brand();
        bc.brandName="abb";
        cat.show();
        cat.Display();
        bc.Display();
    }
}
