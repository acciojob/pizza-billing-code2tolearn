package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private  boolean addExtraCheese = false ;
    private  boolean addExtraToppings = false ;
    private  boolean  addTakeaway = false ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         if(isVeg)
         {
             price = 300 ;
         }else{
             price = 400 ;
         }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.addExtraCheese)
        {
          price += 80 ;
          this.addExtraCheese  = true ;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (! this.addExtraToppings) {
             this.addExtraToppings = true ;
            if (isVeg) {
                price += 70;
            }
            else {
                price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.addTakeaway)
        {
            price += 20 ;
            this.addTakeaway = true ;
        }
    }

    public String getBill(){
        // your code goes here
       StringBuilder str = new StringBuilder() ;
       int toppings  ;
        if(isVeg)
        {
            toppings = 70 ;
        }else {
            toppings = 120 ;
        }
        str.append("Base Price Of The Pizza: "+(isVeg?300:400)+'\n' ) ;
        if(addExtraCheese){
            str.append("Extra Cheese Added: "+80+'\n') ;
        }
        if(addExtraToppings)
        {
            str.append("Extra Toppings Added: "+toppings+'\n' );
        }
        if(addTakeaway)
        {
            str.append("Paperbag Added:"+20+'\n') ;
        }
       str.append("Total Price:"+price+'\n') ;
        this.bill = new String(str) ;
        return this.bill;
    }
}
