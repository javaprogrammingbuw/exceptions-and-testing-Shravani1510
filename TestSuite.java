import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

import java.util.Random;

public class TestSuite {

  /*Initialize*/
  //Test owner constructor 1
  @Test public static void InitTest1() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals(1000.0, account.getBalance(), 0.001 );
  }
  //Test owner constructor 2
  @Test public static void InitTest2() {
	    //define
	    Person owner = new Person("John Doe");
	    double balance = Double.MAX_VALUE;
	    BankAccount account = new BankAccount(owner, balance, 100.0);
	    //test
	    assertEquals(balance, account.getBalance(), 0.001 );
	  }
	  
  
  //Test owner
  @Test public static void InitTest3() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals("John Doe", account.getOwner().name, 0.001 );
  }
  
  @Test public static void InitTest4() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 500.0);
	    //test
	    assertEquals("John Doe", account.getOwner().name, 0.001 );
	  }
	  
  
  //Test owner
  @Test public static void InitTest5() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00, 500.0);
    //test
    assertEquals(500.0, account.getLimit(), 0.001 );
  }
  
  
  @Test public static void InitTest6() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00, 500.00);
    boolean result = account.deposit(500, account.getSecurityNumber());
    //test
     assertEquals(true, result, 0.001 );
    
  }
  
  @Test public static void InitTest7() {
	    //define
	    Person owner = new Person("John Doe");
	    Person remote = new Person("Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 500.0);
	    BankAccount account1 = new BankAccount(remote, 1000.00);
	    double result = account1.transfer(account, 500 , account1.getSecurityNumber());
	    //test
	    assertEquals(500, result, 0.001 );
     }
  
  @Test public static void InitTest8() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 500.00);
	    double result = account.withdraw(500, account.getSecurityNumber());
	    //test
	     assertEquals(500, result, 0.001 );
	    
	  }
  @Test public static void InitTest9() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00);
	    double result = account.withdraw(500, account.getSecurityNumber());
	    //test
	     assertEquals(500, result, 0.001 );
	    
	  }
  
  @Test public static void InitTest10() {
	    //define
	    Person owner = new Person("John Doe");
	    Person remote = new Person("Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 500.0);
	    BankAccount account1 = new BankAccount(remote, 1000.00, 200.0);
	    double result = account1.transfer(account, 500 ,  account1.getSecurityNumber());      
	    //test
	    assertEquals(500, result, 0.001 );
   }
  
   //Test owner constructor 2
  @Test public static void InitTest11() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 000.0, 100.0);
	    //test
	    assertEquals(000.0, account.getBalance(), 0.001 );
	  }
	  
  //Test owner constructor 2
  @Test public static void InitTest12() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 100.0);
	    double result = account.setBalance(1000.0);
	    //test
	    assertEquals(1000.0,result , 0.001 );
	  }
	  
  @Test public static void InitTest13() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00, 100.0);
	    //test
	    assertEquals(account.getIban(), account.getIban(), 0.001 );
	  }
	  
  @Test public static void InitTest14() {
	    //define
	    Person owner = new Person("John Doe");
	    double amount = Double.MAX_VALUE;
	    BankAccount account = new BankAccount(owner, amount, 100.0);
	    double result = account.setBalance(amount);
	    //test
	    assertEquals(amount, result, 0.001 );
	  }
  
  @Test public static void InitTest15() {
	    //define
	    Person owner = new Person("John Doe");
	    double limit = Double.MAX_VALUE;
	    BankAccount account = new BankAccount(owner, 1000.00, limit);
	    //test
	    assertEquals(limit, account.getLimit(), 0.001 );
	  }
 }
