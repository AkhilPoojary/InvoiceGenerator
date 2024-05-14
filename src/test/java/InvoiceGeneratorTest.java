import org.example.service.CabService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    public void invoiceTest()
    {
        CabService c=new CabService();
        Assertions.assertEquals(158,c.genetateInvoice(10,58));
    }
    @Test
    public void invoiceTestForLessThanKm()
    {
        CabService c=new CabService();
        Assertions.assertEquals(5,c.genetateInvoice(200,10));
    }
}
