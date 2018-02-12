package bodybuildingcalculator.bodybuildingcalculator;

/**
 * Created by Пользователь on 09.11.2017.
 */

public enum Lifestyle {SEDENTARY(1.2), SLIGHT(1.375), AVERAGE(1.55), HIGH(1.725), VERYHIGH(1.9);

    private double index;

    public double getIndex() {
        return index;
    }

    Lifestyle(double index) {
        this.index = index;
    }
}
