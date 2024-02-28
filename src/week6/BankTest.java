package week6;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class BankTest {
    public boolean compareAccounts(BankAccount a1,BankAccount a2){
        if (!a1.getAccountHolder().equals(a2.getAccountHolder())){
            return false;
        }
        if (Math.abs(a1.checkAccount()-a2.checkAccount()) > .001){
            return false;
        }
        return true;
    }
    @Test
    public void testCompareAccountS(){
        BankAccount b1=new BankAccount("A",1);
        BankAccount b2=new BankAccount("A",1);
        BankAccount b3=new BankAccount("B",1);
        BankAccount b4=new BankAccount("A",2);
        BankAccount b5=new BankAccount("A",2.00001);
        assertTrue("same",compareAccounts(b1,b2));
        assertFalse("different account",compareAccounts(b1,b3));
        assertFalse("different balance",compareAccounts(b1,b4));
        assertFalse("different everything",compareAccounts(b4,b3));
        assertTrue("same with small balance difference",compareAccounts(b4,b5));
    }
    public boolean compareBAArrays(ArrayList<BankAccount> a1,ArrayList<BankAccount> a2){
        if (a1.size()!=a2.size()){
            return false;
        }
        for (BankAccount b1 : a1){
            boolean found=false;
            for (BankAccount b2 : a2){
                if (compareAccounts(b1,b2)){
                    found=true;
                }
            }
            if (!found){
                return false;
            }
        }
        return true;
    }
    @Test
    public void testBank(){
        Bank bank=new Bank();
        bank.addAccount(new BankAccount("A",1));
        bank.addAccount(new BankAccount("B",2));
        bank.addAccount(new BankAccount("C",3));

        ArrayList<BankAccount> accounts=new ArrayList<>();
        accounts.add(new BankAccount("A",1));
        accounts.add(new BankAccount("B",2));
        accounts.add(new BankAccount("C",3));
        //check they are the same
        assertTrue("values same same order",compareBAArrays(accounts,bank.getAccounts()));
        accounts.add(new BankAccount("D",4));
        //check they are different
        assertFalse("extra value",compareBAArrays(accounts,bank.getAccounts()));
        bank.addAccount(new BankAccount("E",5));
        //check they are different
        assertFalse("same length different values",compareBAArrays(accounts,bank.getAccounts()));
        bank.addAccount(new BankAccount("D",4));
        accounts.add(new BankAccount("E",5));
        //check thye are the same
        assertTrue("values same different order",compareBAArrays(accounts,bank.getAccounts()));
    }
}
