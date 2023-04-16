package qc.ca.colval.ctc.BLL.control;

public class CanadaTaxCalculator {
    double Taxes;

    public double CTCalculator(double taxes) {

        if (taxes <= 49020) {
            Taxes = (taxes/100)*15;
        }
        if (taxes <= 98040) {
            Taxes = (49020/100)*15 + (taxes-49020/100*20.5);
        }
        if (taxes <= 151978) {
            Taxes = (49020/100)*15 + (98040-49020/100*20.5) + (taxes-98040/100*26);
        }
        if (taxes <= 216511) {
            Taxes = ((49020/100)*15 + (98040-46295/100*20.5) + (151978-98040/100*26) + (taxes-151978/100*29));
        }
        if (taxes > 216511) {
            Taxes = ((49020/100)*15 + (98040-46295/100*20.5) + (151978-98040/100*26) + (216511-151978/100*29) + (taxes-216511/100*33));
        }

        return Taxes;
    }
}

