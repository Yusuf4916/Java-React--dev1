public class Product {
    int id,price;
    String ProductName,Contents;

    public void Features(int id,String ProductName,int price,String Contents)
    {

        this.id=id;
        this.price=price;
        this.ProductName=ProductName;
        this.Contents=Contents;

        System.out.println("Ürün İsmi: "+ProductName);
        System.out.println("Ürün Fiyatı:"+price);
        System.out.println("Ürün Hakkında bilgiler:"+Contents);
    }
}
