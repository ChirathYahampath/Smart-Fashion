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
public class DBconnection {

    public static DBconnection dbConnection;

   
    private OrdersList orderList;

    private DBconnection() {
        orderList = new OrdersList();
    }

    public static DBconnection getDBConnection() {
        if (dbConnection == null) {
            dbConnection = new DBconnection();
        }
        return dbConnection;
    }

    public OrdersList getOrderList() {
        return orderList;
    }

   
}
