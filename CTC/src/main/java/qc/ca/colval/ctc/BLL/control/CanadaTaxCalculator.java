package qc.ca.colval.ctc.BLL.control;

public class CanadaTaxCalculator {
    float Taxes;

    public float CTCalculator(float taxes) {

        if (taxes <= 46295) {
            Taxes = (taxes/100)*15;
        }
        if (taxes <= 92580) {
            Taxes = (46295/100)*15 + (taxes-46295/100*20);
        }
        if (taxes <= 112655) {
            Taxes = (46295/100)*15 + (92580-46295/100*20) + (taxes-92580/100*24);
        }
        if (taxes > 112655) {
            Taxes = (float) ((46295/100)*15 + (92580-46295/100*20) + (112655-92580/100*24) + (taxes-112655/100*25.75));
        }

        return Taxes;
    };
}

