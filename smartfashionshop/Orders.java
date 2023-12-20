/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartfashionshop;

/**
 *
 * @author waths
 */
public class Orders {
     String orderId;
    String customerId;
    String Size;
    int qty;
    double amount;
    private int status=0;


    public Orders(String orderId,String phoneNumber,String Size,int qty,double amount){

        this.orderId=orderId;
        this.customerId=phoneNumber;
        this.Size=Size;
        this.qty=qty;
        this.amount=amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
   
    
    public String getStatus(){
        switch(status){
            case 0:return "processing";
            case 1:return "delivering";
            case 2:return "delivered";
        }
        return null;
        
    }

    public void setStatus(int status){
        this.status=status;
        
    }

   
}
