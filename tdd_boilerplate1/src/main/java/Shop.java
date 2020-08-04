import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Shop {

    private String shopName;
    private List<Merchandise> stock;


    public Shop(String shopName) {
        this.shopName = shopName;
        stock = new ArrayList<>();
    }

    /**
     * Shop name - finally the customer wants to recognize the shop
     *
     * @return Shop name
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Adds merchandise to the list
     *
     * @param merchandiseName merchandise name
     * @param basePrice       base price without any sales
     */
    public void addMerchandise(String merchandiseName, double basePrice) {

        Merchandise merchandise = new Merchandise(merchandiseName, basePrice);
        this.stock.add(merchandise);
        //todo: to be implemented
    }

    /**
     * Check if merchandise is on stock
     *
     * @param merchandiseName merchandise name
     * @return true - is on stock, false - not on stock
     */
    public boolean isOnStock(String merchandiseName) {
//        boolean present = stock.stream()
//                .map(Merchandise::getName)
//                .anyMatch(s -> s.equals(merchandiseName));
//        if (present){
//            return true;
//        }
//        return false;

        for (Merchandise merchandise : stock){
            if (merchandise.getName().equals(merchandiseName)){
                return  true;
            }
        }
        return false;

//        todo: to be implemented
    }

    /**
     * Returns the price of merchandise
     *
     * @param merchandiseName merchandise name
     * @return price of merchandise
     */
    public double getMerchandisePrice(String merchandiseName) {
        for (Merchandise merchandise : stock) {
            if (isOnStock(merchandiseName)) {
                return findMerchandiseByName(merchandiseName).getBasePrice();
            }
            //todo: to be implemented
        }
        return 0.0;
    }

    /**
     * Looks for merchandise by name, ignoring case
     *
     * @param merchandiseName searched merchandise
     * @return merchandise object, if found, null if not found
     */
    private Merchandise findMerchandiseByName(String merchandiseName) {
        // todo: use this method in the others and make it case insensitive
        for (Merchandise merchandise : stock) {
            if (merchandise.getName().equalsIgnoreCase(merchandiseName))
                return merchandise;
        }
        return null;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Merchandise> getStock() {
        return stock;
    }

    public void setStock(List<Merchandise> stock) {
        this.stock = stock;
    }
}

