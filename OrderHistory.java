package starbucks;

public class OrderHistory {
    private double starsEarned, orderCost;
    private int orderMonth;

    public OrderHistory(double starsEarned, double orderCost, int orderMonth) {
        this.starsEarned = starsEarned;
        this.orderCost = orderCost;
        this.orderMonth = orderMonth;
    } 

    public void setStarsEarned(double starsEarned) {
        this.starsEarned = starsEarned;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public void setOrderMonth(int orderMonth) {
        this.orderMonth = orderMonth;
    }

    public double getStarsEarned() {
        return starsEarned;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public int getOrderMonth() {
        return orderMonth;
    }  

    @Override
    public String toString() {
        String order; 
        order = "\n  Stars Earned:\t   " + starsEarned + "\n  Order Cost:\t   " + orderCost + "\n  Order Month:\t   " + orderMonth;  
        return order; 
    }  

    
}

