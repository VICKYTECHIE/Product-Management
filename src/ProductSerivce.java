import java.util.ArrayList;
import java.util.List;

public class ProductSerivce {
    List<Product>products=new ArrayList<>();
    public void availableProducts(Product available){
        products.add(available);
    }
    public List<Product>getProducts(){
        return products;
    }
    public Product particularProduct(String searchName){
        for (Product availableItem:products){
            if (availableItem.getName().equals(searchName))
                return availableItem;
        }
        return null;
    }
    public  List<Product> particularFlavour(String searchFlavoure){
        List<Product>productFlavoure=new ArrayList<>();
          for(Product flav:products) {
              if (flav.getFlavour().contains(searchFlavoure))
                  productFlavoure.add(flav);
          }
          return productFlavoure;

    }
    public  List<Product> particularQuantity(String searchQuantity){
        List<Product>Quantity=new ArrayList<>();
        for(Product Quan:products) {
            if (Quan.getQuantity().contains(searchQuantity))
                Quantity.add(Quan);
        }
        return Quantity;

    }
    public  List<Product> checkExp(int checkDate){
        List<Product>Exp=new ArrayList<>();
        for(Product productExp:products) {
            if (productExp.getExpDate()>checkDate)
                Exp.add(productExp);
        }
        return Exp;

    }

}
