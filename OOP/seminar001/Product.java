// Реализуйте класс Товар,
// содержащий данные о товаре, и 
// ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов и getProduct(String name)

package OOP.seminar001;

import java.sql.Date;

public class Product{

    private String name;
    private int price;
    private int quantity;
    private Date bestBefore;
//    int [] storage;

    public Product (String name,int price,int quantity,Date bestBefore){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;

    }
    
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuatity(){
        return quantity;
    }
    public Date getBestBefore(){
        return bestBefore;
    }

    public void setName(String name){

    }
}