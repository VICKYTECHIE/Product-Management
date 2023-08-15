import java.util.List;

public class Main {
    public static void main(String[] args) {

       ProductSerivce display=new ProductSerivce();
        display.availableProducts(new Product("UNIBIC","CHOCO","25g",2022));
        display.availableProducts(new Product("MARRYGOLD","BEERY","35g",2023));
        display.availableProducts(new Product("GOOD DAY","GEY","40g",2024));
        display.availableProducts(new Product("BOURNVITA","CHOCO","25g",2023));
        display.availableProducts(new Product("HORLICE","PINK","30g",2024));
        display.availableProducts(new Product("SUNFIEST","GRAIN","50g",2022));
        display.availableProducts(new Product("PARALAGE","MILK","25g",2024));
        //CREATING A LIST VARIABLE TO PRINT ALL PEODUCTS
        List<Product>allProducts=display.getProducts();
        for (Product items:allProducts){
            System.out.println(items);
        }
        System.out.println("===========================================================================================");
        System.out.println("SEARCH A PARTICULAR PRODUCT");
        Product availableItem=display.particularProduct("HORLICE");
        System.out.println(availableItem);
        System.out.println("===========================================================================================");
        System.out.println("SEARCH A PARTICULAR PRODUCT FLAVOURE");
        List<Product>searchFlavour=display.particularFlavour("CHOCO");
        for(Product flv:searchFlavour)
          System.out.println(flv);
         System.out.println("===========================================================================================");
         System.out.println("SEARCH A PARTICULAR PRODUCT QUANTITY");
         List<Product>searchQuantity=display.particularQuantity("50g");
          System.out.println(searchQuantity);
          System.out.println("===========================================================================================");
          System.out.println("SEARCH A PARTICULAR PRODUCT EXPDATE");
          List<Product>checkDate=display.checkExp(2023);
          for (Product compareDate:checkDate)
             System.out.println(compareDate);

    }
}