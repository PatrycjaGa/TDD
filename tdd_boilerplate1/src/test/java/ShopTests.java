import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTests {

    @Test
    public void checkIfShopNameIsCorrectlyAssigned() {
        Shop shop = new Shop("O'Briens Veggies");

        assertEquals("O'Briens Veggies", shop.getShopName());
    }

    @Test
    public void addMerchandiseAndCheckOnStockSuccess() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);

        boolean isOnStock = shop.isOnStock("Onion");

        assertTrue(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckOnStockFail() {
        Shop shop = new Shop("Test2");
        shop.addMerchandise("Orange", 4.5);
        shop.addMerchandise("Lemon", 2.3);

        int result = shop.getStock().size();

        Assertions.assertEquals(2, result);
        //todo: add implementation
    }

    @Test
    public void addMerchandiseAndCheckOnStockCaseInsensitiveSuccess() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);
        boolean isOnStock = shop.isOnStock("onion");

    }

    @Test
    public void addMerchandiseAndCheckItsPrice() {
        Shop shop = new Shop("Test2");
        shop.addMerchandise("Orange", 4.5);
        shop.addMerchandise("Lemon", 2.3);
        double lemon = shop.getMerchandisePrice("Lemon");

        Assertions.assertEquals(2.3, lemon);

        //todo: add implementation
    }

    @Test
    public void updateMerchandisePrice() {
        Merchandise merchandise = new Merchandise("Orange", 4.5);

        merchandise.setNewBasePrice(5.6);

        Assertions.assertEquals(5.6, merchandise.getBasePrice());


        //todo: add implementation
    }


}