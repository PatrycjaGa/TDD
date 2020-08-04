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

        int result = shop.getStock().size();

        Assertions.assertEquals(1, result);




//        boolean isOnStock = shop.isOnStock("Onion");
//
//        assertTrue(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckOnStockFail() {
        //todo: add implementation
    }

    @Test
    public void addMerchandiseAndCheckOnStockCaseInsensitiveSuccess() {
        Shop shop = new Shop("test");

        shop.addMerchandise("Onion", 2.1);
        boolean isOnStock = shop.isOnStock("onion");

        assertTrue(isOnStock);
    }

    @Test
    public void addMerchandiseAndCheckItsPrice() {
        //todo: add implementation
    }

    @Test
    public void updateMerchandisePrice() {
        //todo: add implementation
    }


}