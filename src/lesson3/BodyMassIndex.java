package lesson3;

import java.util.Scanner;

class BodyMassIndex {
    public static void main(String[] args) {

        getBodyMassIndex();
    }

    public static void  getBodyMassIndex(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height: ");
        int height = scanner.nextInt();
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
                                                            //BMI = kg/m2
        double bmi = weight/((Math.pow(height * 0.01, 2))); // Math.pow - метод возведения в степень, в качестве степень принимает второй аргумент
                                                            // (height * 0.01) перевод с сантиметров в метры
        System.out.println("Your BMI - " + bmi);
    }
}
