import Singleton.java.User;

public class Singleton {
    
    private static ArrayList<Coupon> allCoupons;
    private static ArrayList<Product> allProducts;
    private static ArrayList<Request> allRequest;
    private static ArrayList<Sale> allSales;
    private static ArrayList<User>allUsers;
    private static ArrayList<Manager> allManagers;
    private static ArrayList<Buyer> allBuyers;
    private static ArrayList<Seller> allSellers;
    private static ArrayList<Category> allCategoriesAndSubcategories;
    private static ArrayList<Filter> allFilters;
    public static final String[] availableSorts = new String[3]{"Sort By Date", "Sort By Rating", "Sort By views"};
    private static String currentSortBeingUsed = "Sort By Views";
    private static ArrayList<Product> existingProducts; // products displayed in products page or offs page
    
    public Singleton() {
    
    }
    
    public void mainPage() {
    
    }
    
    public class User
    public class Seller extends User
    public class Buyer extends User
    public class Manager extends User
    public class Request
    public class Order
    public class Log
    public class LogSell extends Log
    public class LogBuy extends Log
    public class Product
    public class Sale
    public class Comment
    public class Category
    public class Rating
    public class Coupon
    public class Filter
    public class ShoppingCart
}
