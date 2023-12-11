import Package.business.ProductManager;
import Package.core.logging.DatabaseLogger;
import Package.core.logging.FileLogger;
import Package.core.logging.Logger;
import Package.core.logging.MailLogger;
import Package.dataAccess.HibernateProductDao;
import Package.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"IPhone",10000);
        Logger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};
        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
