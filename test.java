import java.util.ArrayList;
import java.util.Date;

public class test {

    public static void main(String[] args) {
        // String temp = System.getProperty("user.dir");
        // System.out.println(temp.substring(1, temp.length()));
        ConstractDAO dao = new ConstractDAO();
        Date date = new Date();
        ArrayList<Contract> old = new ArrayList<Contract>();
        Contract contract = new Contract(1, 2, 3, date.getTime(), date.getTime(), 2);
        ArrayList<Contract> last = Contract.createContract(contract, old);

        dao.SaveAccountAsByte(last);
        ArrayList<Contract> result = dao.restoreContractList();

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
