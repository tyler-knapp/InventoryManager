import com.philo.demo.account.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void getAccountBalance_before_transaction(){
        Account unit = new Account();
        double result = unit.getAccountBalance();
        Assert.assertEquals(0.0, result, 0);
    }

    @Test
    public void balance_increases_after_add(){
        Account unit = new Account();
        double result = unit.addMoneyToAccount(50.00);
        Assert.assertEquals(50.0, result, 0);
    }

    @Test
    public void balance_can_be_withdrawn_from(){
        Account unit = new Account();
         unit.addMoneyToAccount(100.00);
         double result = unit.subtractMoneyFromAccount(50.00);
         Assert.assertEquals(50.00, result, 0);
    }

}
