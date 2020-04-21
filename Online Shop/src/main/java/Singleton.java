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
}
