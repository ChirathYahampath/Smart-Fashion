/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartfashionshop;

import java.awt.event.MouseEvent;

/**
 *
 * @author waths
 */
public class Controller {
    private static int id1 = 0;
   public static boolean addOrder(Orders orders) {
       return DBconnection.getDBConnection().getOrderList().add(orders);
       
    }
    public static boolean removeOrder(int index){
        return DBconnection.getDBConnection().getOrderList().remove(index);
    }
   
    
   public static String generateId() {

        if (DBconnection.getDBConnection().getOrderList().size() > 0) {
            id1 = Integer.parseInt(DBconnection.getDBConnection().getOrderList().get(DBconnection.getDBConnection().getOrderList().size() - 1).getOrderId().split("[#]")[1]);
            id1++;
        } else {
            return "ODR#00001";
        }
        return String.format("ODR#%05d", id1);

    }
    
     public static int amount(String Size,String qty){

			int amo=0;
			if(qty!=null && !qty.isEmpty()){
			amo=Integer.parseInt(qty);
			
			}
													 
			int prise=0;
       switch (Size) {
           case "xs":
               prise=amo*600;
               break;
           case "s":
               prise=amo*800;
               break;
           case "m":
               prise=amo*900;
               break;
           case "l":
               prise=amo*1000;
               break;
           case "xl":
               prise=amo*1100;
               break;
           case "xxl":
               prise=amo*1200;
               break;
           default:
               break;
        }
            return prise;
}
     
     
     public static Orders[] getAllOrders(){
         Orders[] tempOrders=DBconnection.getDBConnection().getOrderList().toArray();
         return tempOrders;
     }
     
     public static boolean searchOrderId(String orderId) {
        for (int i = 0; i < DBconnection.getDBConnection().getOrderList().size(); i++) {
            if (DBconnection.getDBConnection().getOrderList().get(i).getOrderId().equals(orderId)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
     
     public static void sortSearchCustomer(String[] ar, int[] QTYtemp, double[] AMOUNTemp) {
        for (int i = 0; i < AMOUNTemp.length - 1; i++) {
            for (int j = i + 1; j < AMOUNTemp.length; j++) {
                if (AMOUNTemp[i] < AMOUNTemp[j]) {
                    double t1 = AMOUNTemp[i];
                    AMOUNTemp[i] = AMOUNTemp[j];
                    AMOUNTemp[j] = t1;

                    int t2 = QTYtemp[i];
                    QTYtemp[i] = QTYtemp[j];
                    QTYtemp[j] = t2;

                    String t3 = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t3;

                }
            }
        }
    }
     
     public static String[] extendArray1(String[] ar) {
        String[] temp2 = new String[ar.length + 1];
        for (int k = 0; k < ar.length; k++) {
            temp2[k] = ar[k];
        }
        return temp2;

    }

    public static int[] extendArray1(int[] ar) {
        int[] temp2 = new int[ar.length + 1];
        for (int k = 0; k < ar.length; k++) {
            temp2[k] = ar[k];
        }
        return temp2;
    }

    public static double[] extendArray1(double[] ar) {
        double[] temp2 = new double[ar.length + 1];
        for (int k = 0; k < ar.length; k++) {
            temp2[k] = ar[k];
        }
        return temp2;
    }
    
    
     public static void sortByQty(String[] ar, int[] qtytemp2, double[] amounttemp2) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (qtytemp2[i] < qtytemp2[j]) {
                    int t1 = qtytemp2[i];
                    qtytemp2[i] = qtytemp2[j];
                    qtytemp2[j] = t1;

                    double t2 = amounttemp2[i];
                    amounttemp2[i] = amounttemp2[j];
                    amounttemp2[j] = t2;

                    String t3 = ar[i];
                    ar[i] = ar[j];
                    ar[j] = t3;
                }
            }
        }
    }

  

}
   

