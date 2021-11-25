package testingisdone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Myaccounttestingisdone {

	@Test
	void test() {
		bankaccount ac=new bankaccount();
        System.out.println(" <-----------------------------ALL YOUR DETAILS ARE SHOW BELOW BY YOUR BANK --------------------------->\n");
        System.out.println(" YOUR ID WAS ********:");
       ac.setId("\npalem.soumya@capgemini.com");
       System.out.println( ac.getId());
       System.out.println(" \nYOUR NAME IS********:");
         ac.setName("\npalem soumya ");
       System.out.println( ac.getName());
       System.out.println(" <----------------------------BALANCE IS GOING TO SETUP ------------------------------------------------------->\n");
      ac.setBalance(20000);
       System.out.println(" YOUR CURRENT BALANCE IS *****:\n"+ " "+ac.getBalance());
        System.out.println("YOUR CURRENT BALANCE  IS ***** :"+ "  "+ac.credit(40000));
       System.out.println( "\nYOUR  DEBIT BEFORE  IS ****** :"+"  "+ac.debit(4000));
      System.out.println(ac.transferTO(5000, 82353830));

      System.out.println( "<====================================FIANL STATUS  DETAILS ARE ========================================================================>\n"+ " " +ac.toString());

	}

}
