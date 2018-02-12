package bodybuildingcalculator.bodybuildingcalculator;

/**
 * Created by Пользователь on 09.11.2017.
 */

public class SizeSpec extends Throwable {

    private int height;
    private float wristCircumference;
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
    /*ПОЛЯ ДЛЯ ТИПА ТЕЛОСЛОЖЕНИЯ*/
    private String bodyType;
    private String ekto = "Эктоморф";
    private String mezo = "Мезоморф";
    private String endo = "Эндоморф";
    /*ПОЛЯ ДЛЯ ОПРЕДЕЛЕНИЯ СООТНОШЕНИЯ МЫШЕЧНЫХ ВОЛОКОН*/
    private String ratioOfMuscleFibers;
    private float maximumWeight;
    private float weight;

    private String muscle1 = "преобладают быстрые мышечные волокна";
    private String muscle2 = "поровну обоих типов волокон";
    private String muscle3 = "преобладают медленные мышечные волокна";
    /*ПОЛЯ ДЛЯ ОБМЕНА ВЕЩЕСТВ И БЖУ*/
    private Lifestyle lifestyle;
    private double caloricCalculation;
    private float proteins;
    private float fats;
    private float carbohydrates;
    /*ОДНОПОВТОРНЫЙ МАКСИМУМ*/
    private float shellWeight;
    private int reps;
    private float weightSportsman;
    private float oneRepWeight;

    /*ОПТИМАЛЬНЫЙ ПУЛЬС*/
    private int age;
    private int lowerPulseLimit;
    private int upperLimitOfPulse;
    private int maxPulse;
    private int hardPulse;
    private int averagePulse;
    private int lightPulse;
    private int veryLightPulse;


    /*ОДНОПОВТОРНЫЙ МАКСИМУМ*/
    public CompetetionsResult oneRepWeight(float shellWeight, int reps, Gymnastic gymnastic) throws Exception {
        this.reps = reps;
        this.shellWeight = shellWeight;
        CompetetionsResult competetionsResult = new CompetetionsResult();


        if (gymnastic == Gymnastic.SQUATS) {
            if (reps == 1) {
                oneRepWeight = (float) (shellWeight * 1.0);
            } else if (reps == 2) {
                oneRepWeight = (float) (shellWeight * 1.0475);
            } else if (reps == 3) {
                oneRepWeight = (float) (shellWeight * 1.13);
            } else if (reps == 4) {
                oneRepWeight = (float) (shellWeight * 1.1575);
            } else if (reps == 5) {
                oneRepWeight = (float) (shellWeight * 1.2);
            } else if (reps == 6) {
                oneRepWeight = (float) (shellWeight * 1.242);
            } else if (reps == 7) {
                oneRepWeight = (float) (shellWeight * 1.284);
            } else if (reps == 8) {
                oneRepWeight = (float) (shellWeight * 1.326);
            } else if (reps == 9) {
                oneRepWeight = (float) (shellWeight * 1.368);
            } else if (reps == 10) {
                oneRepWeight = (float) (shellWeight * 1.41);
            }

        } else if (gymnastic == Gymnastic.BENCHPRESS) {
            if (reps == 1) {
                oneRepWeight = (float) (shellWeight * 1.0);
            } else if (reps == 2) {
                oneRepWeight = (float) (shellWeight * 1.035);
            } else if (reps == 3) {
                oneRepWeight = (float) (shellWeight * 1.08);
            } else if (reps == 4) {
                oneRepWeight = (float) (shellWeight * 1.115);
            } else if (reps == 5) {
                oneRepWeight = (float) (shellWeight * 1.15);
            } else if (reps == 6) {
                oneRepWeight = (float) (shellWeight * 1.18);
            } else if (reps == 7) {
                oneRepWeight = (float) (shellWeight * 1.22);
            } else if (reps == 8) {
                oneRepWeight = (float) (shellWeight * 1.255);
            } else if (reps == 9) {
                oneRepWeight = (float) (shellWeight * 1.29);
            } else if (reps == 10) {
                oneRepWeight = (float) (shellWeight * 1.325);
            }
        } else if (gymnastic == Gymnastic.DEADLIFT) {
            if (reps == 1) {
                oneRepWeight = (float) (shellWeight * 1.0);
            } else if (reps == 2) {
                oneRepWeight = (float) (shellWeight * 1.065);
            } else if (reps == 3) {
                oneRepWeight = (float) (shellWeight * 1.13);
            } else if (reps == 4) {
                oneRepWeight = (float) (shellWeight * 1.147);
            } else if (reps == 5) {
                oneRepWeight = (float) (shellWeight * 1.164);
            } else if (reps == 6) {
                oneRepWeight = (float) (shellWeight * 1.181);
            } else if (reps == 7) {
                oneRepWeight = (float) (shellWeight * 1.198);
            } else if (reps == 8) {
                oneRepWeight = (float) (shellWeight * 1.232);
            } else if (reps == 9) {
                oneRepWeight = (float) (shellWeight * 1.232);
            } else if (reps == 10) {
                oneRepWeight = (float) (shellWeight * 1.24);
            }
        }
        return competetionsResult;
    }

    public String printOneRepWeight() {
        return String.valueOf(oneRepWeight);
    }

     /*ОПТИМАЛЬНЫЙ ПУЛЬС*/

    public CompetetionsResult optimalPulse(int age) {
        this.age = age;
        CompetetionsResult competetionsResult = new CompetetionsResult();
        lowerPulseLimit = (int) ((220 - age) * 0.6);
        upperLimitOfPulse = (int) ((220 - age) * 0.8);
        maxPulse = (int) ((220 - age) * 0.8);
        hardPulse = (int) (maxPulse * 0.85);
        averagePulse = (int) (maxPulse * 0.75);
        lightPulse = (int) (maxPulse * 0.65);
        veryLightPulse = (int) (maxPulse * 0.5);

        return competetionsResult;
    }

    public String printMaxPulse() {
        return maxPulse + " уд. в минуту";
    }

    public String printHardPulse() {
        return hardPulse + " уд. в минуту";
    }

    public String printAveragePulse() {
        return averagePulse + " уд. в минуту";
    }

    public String printLightPulse() {
        return lightPulse + " уд. в минуту";
    }

    public String printVeryLightPulse() {
        return veryLightPulse + " уд. в минуту";
    }


    public String printOptimalPulse() {
        return
                "Для результативной тренировки Ваше сердце должно биться с частотой не ниже "
                        + lowerPulseLimit + " ударов в минуту.\n " + "\n" +
                        "Верхняя граница, которую не следует пересекать " + upperLimitOfPulse + " ударов " +
                        "в минуту.";
    }


    /*Формула вычесления максимального мышечного веса и измерений от Кейси Батта*/
    public void buildingParameters() {
        float v = (float) (((Math.pow(height, 1.5)) * ((Math.sqrt(wristCircumference) / 22.6670) + (Math.sqrt(ankleCircumference) / 17.0104)) * (bodyFat) / 224) + 1);
        float m = (v / (100 - bodyFat) * 100);
        System.out.println(v);
    }


    /*Формула Джона Маккалума "Идеальное Телосложение"*/
    public CompetetionsResult perfectPhysique(float chest) {
        CompetetionsResult competetionsResult = new CompetetionsResult();
        this.chestCircumference = (float) (6.5 * chest);
        this.hipGirth = (float) (chestCircumference * 0.85 * 1.1);
        this.waistCircumference = (float) (chestCircumference * 0.7 * 1.1);
        this.hipCircumference = (float) (chestCircumference * 0.53 * 1.1);
        this.neckGirth = (float) (chestCircumference * 0.37);
        this.girthOfTheBicep = (float) (chestCircumference * 0.36);
        this.shinCircumfernce = (float) (chestCircumference * 0.34 * 1.1);
        this.forearmGirth = (float) (chestCircumference * 0.29);
        return competetionsResult;
    }

    public String printChest() {
        return Math.round(chestCircumference) + "";
    }

    public String printNeck() {
        return Math.round(neckGirth) + "";
    }

    public String printBiceps() {
        return Math.round(girthOfTheBicep) + "";
    }

    public String printTalia() {
        return Math.round(waistCircumference) + "";
    }

    public String printWrist() {
        return Math.round(forearmGirth) + "";
    }

    public String printHip() {
        return Math.round(hipCircumference) + "";
    }

    public String printShin() {
        return Math.round(shinCircumfernce) + "";
    }


    /*МЕТОД ДЛЯ ВЫЧИСЛЕНИЯ ТИПА ТЕЛОСЛОЖЕНИЯ*/
    public CompetetionsResult bodyType(float wrist) {
        CompetetionsResult competetionsResult = new CompetetionsResult();
        this.wristCircumference = wrist;
        if (wrist < 18) {
            bodyType = ekto;
        } else if (wrist >= 18 && wrist < 20) {
            bodyType = mezo;
        } else if (wrist >= 20 && wrist < 30) {
            bodyType = endo;
        }
        return competetionsResult;
    }

    /*РАСЧЕТ КАЛОРИЙНОСТИ*/
    public CompetetionsResult caloricCalculation1(float weight, int height, int age, Lifestyle lifestyle, Target target, Sex sex) {

        CompetetionsResult competetionsResult = new CompetetionsResult();
        this.weight = competetionsResult.getWeight();
        this.height = competetionsResult.getHeight();
        this.age = competetionsResult.getAge();
        /*СТАНДАРТНАЯ СУТОЧНАЯ КАЛОРИЙНОСТЬ ПОЛЬЗОВАТЕЛЯ*/
        caloricCalculation = (9.99 * weight) + (6.25 * height) - (4.92 * age);
         /*СТАНДАРТНАЯ КАЛОРИЙНОСТЬ, В ЗАВИСИМОСТИ ОТ ПОЛА ПОЛЬЗОВАТЕЛЯ*/
        if (sex == Sex.MALE) {
            caloricCalculation = caloricCalculation + 5;
        } else if (sex == Sex.FEMALE) {
            caloricCalculation = caloricCalculation - 161;
        }
        /*ПОДСЧЕТ ОБЩЕГО КОЛИЧЕСТВА КАЛОРИЙ ЗА СУТКИ (В ЗАВИСИМОСТИ ОТ ОБРАЗА ЖИЗНИ ПОЛЬЗОВАТЕЛЯ*/
        if (lifestyle == Lifestyle.SEDENTARY) {
            caloricCalculation = (float) (caloricCalculation * 1.2);
        } else if (lifestyle == Lifestyle.SLIGHT) {
            caloricCalculation = (float) (caloricCalculation * 1.375);
        } else if (lifestyle == Lifestyle.AVERAGE) {
            caloricCalculation = (float) (caloricCalculation * 1.55);
        } else if (lifestyle == Lifestyle.HIGH) {
            caloricCalculation = (float) (caloricCalculation * 1.725);
        } else if (lifestyle == Lifestyle.VERYHIGH) {
            caloricCalculation = (float) (caloricCalculation * 1.9);
        }
        /*ПОДСЧЕТ КАЛОРИЙНОСТИ В ЗАВИСИМОСТИ ОТ ЦЕЛИ ПОЛЬЗОВАТЕЛЯ*/
        if (target == Target.SLIMMING) {
            proteins = (float) (caloricCalculation / 4 * 0.25);
            fats = (float) (caloricCalculation / 9 * 0.35);
            carbohydrates = (float) (caloricCalculation / 4 * 0.4);
        } else if (target == Target.SET) {
            proteins = (float) (caloricCalculation / 4 * 0.2);
            fats = (float) (caloricCalculation / 9 * 0.3);
            carbohydrates = (float) (caloricCalculation / 4 * 0.5);
        }

        return competetionsResult;
    }


    public String printCaloricCalculation() {
        return String.valueOf(Math.round(caloricCalculation));
    }

    public String printProteins(){
        return String.valueOf(Math.round(proteins));
    }

    public String printFats(){
        return String.valueOf(Math.round(fats));
    }

    public String printCarbohydrates(){
        return String.valueOf(Math.round(carbohydrates));
    }

    /*МЕТОД ДЛЯ ВЫЧИСЛЕНИЯ СООТНОШЕНИЯ МЫШЕЧНЫХ ВОЛОКОН*/
    public CompetetionsResult ratioOfMuscleFibers(float reps) {
        CompetetionsResult competetionsResult = new CompetetionsResult();

        if (reps < 7 && reps < 8) {
            ratioOfMuscleFibers = muscle1;
        } else if (reps == 9) {
            ratioOfMuscleFibers = muscle2;
        } else if (reps > 10 && reps > 12) {
            ratioOfMuscleFibers = muscle3;
        }
        return competetionsResult;
    }

    public String printRatioOfMuscleFibers() {
        return ratioOfMuscleFibers;
    }

    public String printBodyType() {
        return bodyType;
    }

    public String printBicepsResult() {
        return "Бицепс =" + girthOfTheBicep;
    }

    public String printPerfectPhusique() {
        return " Грудь =" + chestCircumference +
                ", Таз =" + hipGirth +
                ", Талия =" + waistCircumference +
                ", Бедро =" + hipCircumference +
                ", Шея =" + neckGirth +
                ", Бицепс =" + girthOfTheBicep +
                ", Голень =" + shinCircumfernce +
                ", Предплечье =" + forearmGirth +
                '}';
    }

    @Override
    public String toString() {
        return "SizeSpec{" +
                "height=" + height +
                ", wristCircumference=" + wristCircumference +
                ", ankleCircumference=" + ankleCircumference +
                ", bodyFat=" + bodyFat +
                ", result=" + result +
                ", chestCircumference=" + chestCircumference +
                ", hipGirth=" + hipGirth +
                ", waistCircumference=" + waistCircumference +
                ", hipCircumference=" + hipCircumference +
                ", neckGirth=" + neckGirth +
                ", girthOfTheBicep=" + girthOfTheBicep +
                ", shinCircumfernce=" + shinCircumfernce +
                ", forearmGirth=" + forearmGirth +
                ", bodyType='" + bodyType + '\'' +
                ", ekto='" + ekto + '\'' +
                ", mezo='" + mezo + '\'' +
                ", endo='" + endo + '\'' +
                ", ratioOfMuscleFibers='" + ratioOfMuscleFibers + '\'' +
                ", maximumWeight=" + maximumWeight +
                ", weight=" + weight +
                ", reps=" + reps +
                ", muscle1='" + muscle1 + '\'' +
                ", muscle2='" + muscle2 + '\'' +
                ", muscle3='" + muscle3 + '\'' +
                ", lifestyle=" + lifestyle +
                ", caloricCalculation=" + caloricCalculation +
                ", age=" + age +
                '}';
    }
}
