package bodybuildingcalculator.bodybuildingcalculator;

/**
 * Created by Пользователь on 09.11.2017.
 */

public class CompetetionsResult {

    private float ankleCircumference;
    private float bodyFat;
    private float result;
    private float chestCircumference;
    private float hipGirth;
    private float waistCircumference;
    private float hipCircumference;
    private float neckGirth;
    private float girthOfTheBicep;
    private float shinCircumfernce;
    private float forearmGirth;
    private float weight;
    private int height;
    private int age;
    private float wristCircumference;
    private Lifestyle lifestyle;
    private Sex sex;
    private Target target;
    private Gymnastic gymnastic;
    private float shellWeight;
    private int reps;
    private Distance distance;
    private UnitsMass unitsMass;


    public UnitsMass getUnitsMass() {
        return unitsMass;
    }


    public void setUnitsMass(int unitMassIndex) {
        switch (unitMassIndex) {
            case 0:
                unitsMass = UnitsMass.KG;
                break;
            case 1:
                unitsMass = UnitsMass.LB;
        }
    }


    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public float getAnkleCircumference() {
        return ankleCircumference;
    }

    public float getBodyFat() {
        return bodyFat;
    }

    public float getResult() {
        return result;
    }

    public float getChestCircumference() {
        return chestCircumference;
    }

    public float getHipGirth() {
        return hipGirth;
    }

    public float getWaistCircumference() {
        return waistCircumference;
    }

    public float getHipCircumference() {
        return hipCircumference;
    }

    public float getNeckGirth() {
        return neckGirth;
    }

    public float getGirthOfTheBicep() {
        return girthOfTheBicep;
    }

    public float getShinCircumfernce() {
        return shinCircumfernce;
    }

    public float getForearmGirth() {
        return forearmGirth;
    }

    public float getWristCircumference() {
        return wristCircumference;
    }

    public float getShellWeight() {
        return shellWeight;
    }

    public int getReps() {
        return reps;
    }

    public Lifestyle getLifestyle() {
        return lifestyle;
    }

    public Target getTarget() {
        return target;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Sex getSex() {
        return sex;
    }

    public Gymnastic getGymnastic() {
        return gymnastic;
    }

    public void setWristCircumference(float waistCircumference) {
        this.wristCircumference = waistCircumference;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setShellWeight(float shellWeight) {
        this.shellWeight = shellWeight;
    }

    public void setSex(int sexIndex) {
        switch (sexIndex) {
            case 0:
                sex = Sex.MALE;
                break;
            case 1:
                sex = Sex.FEMALE;
                break;
        }
    }

    public void setGymnastic(int gymnasticIndex) {
        switch (gymnasticIndex) {
            case 0:
                gymnastic = Gymnastic.SQUATS;
                break;
            case 1:
                gymnastic = Gymnastic.BENCHPRESS;
                break;
            case 2:
                gymnastic = Gymnastic.DEADLIFT;
        }
    }

    public void setTarget(int targetIndex) {
        switch (targetIndex) {
            case 0:
                target = Target.SLIMMING;
                break;
            case 1:
                target = Target.SET;
                break;
        }
    }

    public void setLifestyle(int lifestyleIndex) {
        switch (lifestyleIndex) {
            case 0:
                lifestyle = Lifestyle.SEDENTARY;
                break;
            case 1:
                lifestyle = Lifestyle.SLIGHT;
                break;
            case 2:
                lifestyle = Lifestyle.AVERAGE;
                break;
            case 3:
                lifestyle = Lifestyle.HIGH;
                break;
            case 4:
                lifestyle = Lifestyle.VERYHIGH;
                break;
        }
    }
}
