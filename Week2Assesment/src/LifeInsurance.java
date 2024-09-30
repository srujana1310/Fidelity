public class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo,insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent =benefitPercent;
    }
    public double calculatePremium(){
        return (getAmountCovered() - ((getAmountCovered()* benefitPercent)/100))/policyTerm;
    }
}
