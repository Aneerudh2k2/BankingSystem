package Association;
// Composition
public class Account {
    private final Card card;  
    String name;
    int accNumber;
    
    public Account(String name, int accNumber){
       card  = new Card(9876234, 190);
       this.name = name;
       this.accNumber = accNumber;
    }
    
    public void showAlldetails(){
        System.out.println("Name of Card Holder ="+name);
        System.out.println("Account number ="+accNumber);
        System.out.println("Number on debit card ="+card.cardNumber);
        System.out.println("CVC of Card ="+card.cvc);
    }
}

class Card 
{
    int cardNumber;
    int cvc;
    
    Card(int cardNumber, int cvc){
        this.cardNumber = cardNumber;
        this.cvc = cvc;
    }
}

