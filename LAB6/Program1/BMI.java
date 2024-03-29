package Program1;

public class BMI {
    String name;
    int age;
    double weight;
    double feet;
    double inches;

    // Constructors
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    // Methods
    public double getBMI() {
        double h = 12 * feet + inches;
        return (weight * 0.45359237) / ((h * 0.0254) * (h * 0.0254));
    }

    public String getInterpretation() {
        if (getBMI() < 18.5) {
            return "Underweight";
        } else if (getBMI() < 25.0) {
            return "Normal";
        } else if (getBMI() < 30.0) {
            return "Overweught";
        } else {
            return "Obese";
        }
    }
}
