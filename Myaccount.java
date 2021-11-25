package testingisdone;

class  bankaccount
{
String id;
String name;
int balance=0;
public bankaccount()
{

}
public  bankaccount(String i , String nm)
{
 this.id=i;
   this.name=nm;

}
public bankaccount(String i, String nm ,int bal)

{
   this.id=i;
   this.name=nm;
   this.balance=bal;


}

public String getId() {
   return id;
}

public String getName() {
   return name;
}
public int getBalance() {
   return balance;
}
public void setBalance(int balance) {
   this.balance = balance;
}
public void setId(String id) {
   this.id = id;
}
public void setName(String name) {
   this.name = name;
}
int credit(int amount)
{
   System.out.println("YOUR CURRENT CREDIT IS ******:\n"+amount);
   System.out.println("YOUR TOTAL BALANCE AFTER YOUR CREDIT IS *******:\n");
   balance=balance+amount;return balance;


}
int debit(int amount)
{

   if(amount<=balance)
   {
       //amount=balance-amount;
       balance=balance-amount;
       System.out.println(" \nAMOUNT THAT I WANTED TO DEDUCT FROM MY ACCOUNT******** : "+ " "+amount);
       System.out.println("\n DEAR CUSTOMER YOUR CURRENT BALANCE AFTER DEBIT IS *********: "+balance);
       return amount;
       
   }
   else{
       System.out.println(" AMOUNT EXCEEDED BALANCE ************ ");

   }
   return balance;
   //return balance-amount;
}
int   transferTO(int amount , int account)
{
   if(amount<=balance)
   {  // balance=balance-amount;
       System.out.println("\n TRANSFER AMOUNT TO ANOTHER ACCOUNT *******:"+" AMOUNT IS:"+amount+" ,"+ "ACCOUNT NUMBER IS:"+account);
       System.out.println("\n TRANSFERRING AMOUNT IS *****:"+ " "+amount);
       System.out.println(" \nAFTER TRANSFERRING YOUR BALANCE IS********:");
      balance= balance-amount;
      return balance;

       
       
   }
   else{
       System.out.println(" AMOUNT EXCEEDED BALANCE********");
       
   }

   
   //return balance;
   return balance;
}




public String toString()
{
   return "ID IS:-------->"+id+"\n \nACCOUNT HOLDER NAME IS:--------> "+name+"\n\nAVAIALABLE BALANCE IS:-------> "+ "\n "+balance;

}
}





/*class show{
public static void main(String args [])
{
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
}*/

