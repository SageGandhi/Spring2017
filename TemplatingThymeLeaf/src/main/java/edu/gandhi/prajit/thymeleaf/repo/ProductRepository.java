package edu.gandhi.prajit.thymeleaf.repo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.gandhi.prajit.thymeleaf.pojo.Comment;
import edu.gandhi.prajit.thymeleaf.pojo.Product;


public class ProductRepository {
    private static final ProductRepository INSTANCE = new ProductRepository();
    private final Map<Integer,Product> productsById;
    public static ProductRepository getInstance() {
        return INSTANCE;
    }
    private ProductRepository() {
        this.productsById = new LinkedHashMap<Integer, Product>();

        this.productsById.put(1,Product.builder().id(1).name("Fresh Sweet Basil").inStock(true).price(BigDecimal.valueOf(4.99d)).build());
        this.productsById.put(2,Product.builder().id(2).name("Italian Tomato").inStock(false).price(BigDecimal.valueOf(1.25)).build());
        this.productsById.put(3,Product.builder().id(3).name("Yellow Bell Pepper").inStock(true).price(BigDecimal.valueOf(2.50)).build());
        this.productsById.put(4,Product.builder().id(4).name("Old Cheddar").inStock(true).price(BigDecimal.valueOf(18.75)).build());
        this.productsById.put(5,Product.builder().id(5).name("Extra Virgin Coconut Oil").inStock(true).price(BigDecimal.valueOf(6.34)).build());
        this.productsById.put(6,Product.builder().id(6).name("Organic Tomato Ketchup").inStock(true).price(BigDecimal.valueOf(1.99)).build());
        this.productsById.put(7,Product.builder().id(7).name("Whole Grain Oatmeal Cereal").inStock(true).price(BigDecimal.valueOf(3.07)).build());
        this.productsById.put(8,Product.builder().id(8).name("Traditional Tomato & Basil Sauce").inStock(true).price(BigDecimal.valueOf(2.58)).build());
        this.productsById.put(9,Product.builder().id(9).name("Quinoa Flour").inStock(true).price(BigDecimal.valueOf(3.02)).build());
        this.productsById.put(10,Product.builder().id(10).name("Grapefruit Juice").inStock(true).price(BigDecimal.valueOf(2.58)).build());
        this.productsById.put(11,Product.builder().id(11).name("100% Pure Maple Syrup").inStock(true).price(BigDecimal.valueOf(5.98)).build());
        this.productsById.put(12,Product.builder().id(12).name("Marinara Pasta Sauce").inStock(false).price(BigDecimal.valueOf(2.08)).build());
        this.productsById.put(13,Product.builder().id(13).name("Vanilla Puff Cereal").inStock(false).price(BigDecimal.valueOf(1.75)).build());
        this.productsById.put(14,Product.builder().id(14).name("Extra Virgin Oil").inStock(false).price(BigDecimal.valueOf(5.01)).build());
        this.productsById.put(15,Product.builder().id(15).name("Roasted Garlic Pasta Sauce").inStock(true).price(BigDecimal.valueOf(2.40)).build());
        this.productsById.put(16,Product.builder().id(16).name("Canned Minestrone Soup").inStock(true).price(BigDecimal.valueOf(2.19)).build());
        this.productsById.put(17,Product.builder().id(17).name("Almond Milk 1L").inStock(true).price(BigDecimal.valueOf(3.24)).build());
        this.productsById.put(18,Product.builder().id(18).name("Organic Chicken & Wild Rice Soup").inStock(true).price(BigDecimal.valueOf(3.17)).build());
        this.productsById.put(19,Product.builder().id(19).name("Purple Carrot, Blackberry, Quinoa & Greek Yogurt").inStock(true).price(BigDecimal.valueOf(8.88)).build());
        this.productsById.put(20,Product.builder().id(20).name("Pumpkin, Carrot and Apple Juice").inStock(false).price(BigDecimal.valueOf(3.90)).build());
        this.productsById.put(21,Product.builder().id(21).name("Organic Canola Oil").inStock(true).price(BigDecimal.valueOf(10.13)).build());
        this.productsById.put(22,Product.builder().id(22).name("Potato Corn Tortilla Chips").inStock(true).price(BigDecimal.valueOf(2.44)).build());
        this.productsById.put(23,Product.builder().id(23).name("Canned Corn Chowder Soup").inStock(true).price(BigDecimal.valueOf(2.30)).build());
        this.productsById.put(24,Product.builder().id(24).name("Organic Lemonade Juice").inStock(true).price(BigDecimal.valueOf(2.48)).build());
        this.productsById.put(25,Product.builder().id(25).name("Spicy Basil Dressing").inStock(true).price(BigDecimal.valueOf(4.72)).build());
        this.productsById.put(26,Product.builder().id(26).name("Sweet Agave Nectar").inStock(true).price(BigDecimal.valueOf(6.46)).build());
        this.productsById.put(27,Product.builder().id(27).name("Dark Roasted Peanut Butter").inStock(false).price(BigDecimal.valueOf(3.48)).build());
        this.productsById.put(28,Product.builder().id(28).name("Unsweetened Lemon Green Tea").inStock(true).price(BigDecimal.valueOf(18.34)).build());
        this.productsById.put(29,Product.builder().id(29).name("Whole Grain Flakes Cereal").inStock(true).price(BigDecimal.valueOf(3.52)).build());
        this.productsById.put(30,Product.builder().id(30).name("Berry Chewy Granola Bars").inStock(true).price(BigDecimal.valueOf(4.00)).build());
        
        this.productsById.get(2).getComments().add(Comment.builder().id(1).text("I'm so sad this product is no longer available!").build());
        this.productsById.get(2).getComments().add(Comment.builder().id(2).text("When do you expect to have it back?").build());
        this.productsById.get(9).getComments().add(Comment.builder().id(11).text("Made bread with this and it was great!").build());
        this.productsById.get(9).getComments().add(Comment.builder().id(12).text("Note: this comes actually mixed with wheat flour").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(3).text("Very tasty! I'd definitely buy it again!").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(4).text("My kids love it!").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(5).text("Good, my basic breakfast cereal. Though maybe a bit in the sweet side...").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(6).text("Not that I find it bad, but I think the vanilla flavouring is too intrusive").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(7).text("I agree with the excessive flavouring, but still one of my favourites!").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(8).text("Cheaper than at the local store!").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(9).text("I'm sorry to disagree, but IMO these are far too sweet").build());
        this.productsById.get(13).getComments().add(Comment.builder().id(10).text("Good. Pricey though.").build());
        this.productsById.get(14).getComments().add(Comment.builder().id(13).text("Awesome Spanish oil. Buy it now.").build());
        this.productsById.get(14).getComments().add(Comment.builder().id(14).text("Would definitely buy it again. Best one I've tasted").build());
        this.productsById.get(14).getComments().add(Comment.builder().id(15).text("A bit acid for my taste, but still a very nice one.").build());
        this.productsById.get(14).getComments().add(Comment.builder().id(16).text("Definitely not the average olive oil. Really good.").build());
        this.productsById.get(16).getComments().add(Comment.builder().id(17).text("Great value!").build());
        this.productsById.get(24).getComments().add(Comment.builder().id(18).text("My favourite :)").build());
        this.productsById.get(30).getComments().add(Comment.builder().id(19).text("Too hard! I would not buy again").build());
        this.productsById.get(30).getComments().add(Comment.builder().id(20).text("Taste is OK, but I agree with previous comment that bars are too hard to eat").build());
        this.productsById.get(30).getComments().add(Comment.builder().id(21).text("Would definitely NOT buy again. Simply unedible!").build());
    }
    public List<Product> findAll() {
        return new ArrayList<Product>(this.productsById.values());
    }
    
    public Product findById(final Integer id) {
        return this.productsById.get(id);
    }
}