package Zaio.deliverables;

public class UberService {
    private String Name;
    private int costPerMinute;
    private int costPerKilometre;
    private int baseFare;
    private int cancellationFee;


    public void setDetails(String name, int costPerMin, int costPerKM, int baseFee, int cancellationFee){
        this.Name = name;
        this.costPerMinute = costPerMin;
        this.costPerKilometre = costPerKM;
        this.baseFare = baseFee;
        this.cancellationFee = cancellationFee;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setCostPerMinute(int cents) {
        this.costPerMinute = cents;
    }

    public int getCostPerMinute() {
        return costPerMinute;
    }

    public void setCostPerKilometre(int cents) {
        this.costPerKilometre = cents;
    }

    public int getCostPerKilometre() {
        return costPerKilometre;
    }

    public void setBaseFare(int cents) {
        this.baseFare = cents;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public void setCancellationFee(int n) {
        this.cancellationFee = n;
    }

    public int getCancellationFee() {
        return cancellationFee;
    }


    public double calculateFare(double minute, double distance) {
        return (minute * costPerMinute) + (distance * costPerKilometre) + baseFare;
    }
}




    








