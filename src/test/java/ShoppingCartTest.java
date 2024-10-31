import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingCartTest extends BaseUIState {
    private static final int BOOK_PRICE = 10;

    public void getValues() {
        discountPercent = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        discount$ = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        total = driver.
                findElement(By.xpath("//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
    }

    public void doAsserts(SoftAssert softAssert, int expectedDiscountPercent, double expectedDiscount$, double expectedTotal) {
        softAssert.assertEquals(discountPercent,
                String.valueOf(expectedDiscountPercent),
                "процент дисконта не равен " + expectedDiscountPercent);
        softAssert.assertEquals(Double.parseDouble(discount$),
                expectedDiscount$,
                0.0001,
                "Сумма дисконта не равна " + expectedDiscount$);
        softAssert.assertEquals(Double.parseDouble(total),
                expectedTotal,
                0.0001,
                "Общая сумма стоимости книг не равна " + expectedTotal);
    }

    @Test
    public void checkDownBorderForDiscount0() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 0;
        final int book_amount = 1;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount0() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 0;
        final int book_amount = 19;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount2() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 2;
        final int book_amount = 20;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount2() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 2;
        final int book_amount = 49;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount3() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 3;
        final int book_amount = 50;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount3() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 3;
        final int book_amount = 99;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount4() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 4;
        final int book_amount = 100;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount4() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 4;
        final int book_amount = 499;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount5() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 5;
        final int book_amount = 500;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount5() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 5;
        final int book_amount = 999;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount6() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 6;
        final int book_amount = 1000;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount6() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 6;
        final int book_amount = 4999;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount7() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 7;
        final int book_amount = 5000;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkUpBorderForDiscount7() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 7;
        final int book_amount = 9999;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDownBorderForDiscount8() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 8;
        final int book_amount = 10000;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount8() {
        SoftAssert softAssert = new SoftAssert();

        final int expectedDiscountPercent = 8;
        final int book_amount = 12345;
        final double expectedDiscount$ = (double) (book_amount * BOOK_PRICE) / 100 * expectedDiscountPercent;
        final double expectedTotal = book_amount * BOOK_PRICE - expectedDiscount$;

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(String.valueOf(book_amount));
        driver.findElement(By.cssSelector("[value = Update]")).click();

        getValues();

        doAsserts(softAssert, expectedDiscountPercent, expectedDiscount$, expectedTotal);

        driver.quit();
        softAssert.assertAll();
    }
}