public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;
    public Insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }
    public String getInsuranceNo() {
        return insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
}
