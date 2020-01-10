package starbucks;

public class Membership {
    private String status;
    private int reward;
    private double stars,expiringStars;

    public Membership(String status, int reward, double expiringStars, double stars) {
        this.status = status;
        this.reward = reward;
        this.expiringStars = expiringStars;
        this.stars = stars;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public void setExpiringStars(double expiringStars) {
        this.expiringStars = expiringStars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getStatus() {
        return status;
    }

    public int getReward() {
        return reward;
    }

    public double getExpiringStars() {
        return expiringStars;
    }

    public double getStars() {
        return stars;
    } 

     @Override
    public String toString() {
        String membership; 
        membership = "\n  Status:\t   " + status + "\n  Reward:\t   " + reward + "\n  Stars:\t   " + stars + "\n  Expiring Stars:  "
                + expiringStars; 
        return membership; 
    }

    
    
    
    
}

