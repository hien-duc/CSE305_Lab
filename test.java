
import java.util.ArrayList;
import java.util.Date;

public class test {

    public static void main(String[] args) {

        ConstractDAO dao = new ConstractDAO();
        Date date = new Date();
        ArrayList<Contract> old = new ArrayList<Contract>();
        // Contract contract = new Contract(1, 2, 3, date.getTime(), date.getTime(), 2);
        Contract contract = new ContractConcreteBuilder().setContractID(123).setTenantID(123).setEndDate((long) 2015)
                .setPropertyID(123).build();
        ArrayList<Contract> last = Contract.createContract(contract, old);

        dao.SaveAccountAsByte(last);
        ArrayList<Contract> result = dao.restoreContractList();

        for (int i = 0; i < last.size(); i++) {
            System.out.println(last.get(i).getContractID());
        }
        // test DAO----------------------------------------------------------------

    }
}
