
import java.util.Scanner;
import java.security.SecureRandom;

public class hollander_p1 {

    public static int multiplicationQuestion(int difficulty) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int i = 0, j = 0, k;
        int wrongCase;
        int rightCase;

        switch(difficulty) {
            case 1:
                i = random.nextInt(10);
                j = random.nextInt(10);
                break;
            case 2:
                i = random.nextInt(100);
                j = random.nextInt(100);
                break;
            case 3:
                i = random.nextInt(1000);
                j = random.nextInt(1000);
                break;
            case 4:
                i = random.nextInt(10000);
                j = random.nextInt(10000);
                break;
            default:
        }

        System.out.printf("How much is " + i + " times " + j + "?\n");
        System.out.print("Please Enter a number: ");
        k = scnr.nextInt();

        if(k != i * j) {
            wrongCase = random.nextInt(4);
            switch(wrongCase) {
                case 0:
                    System.out.println("No. Please try again");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }

            return 0;
        }

        else if(k == i * j) {
            rightCase = random.nextInt(4);
            switch(rightCase) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;
            }

            return 1;
        }

        return 0;
    }
    public static int additionQuestion(int difficulty) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int i = 0, j = 0, k;
        int wrongCase;
        int rightCase;

        switch(difficulty) {
            case 1:
                i = random.nextInt(10);
                j = random.nextInt(10);
                break;
            case 2:
                i = random.nextInt(100);
                j = random.nextInt(100);
                break;
            case 3:
                i = random.nextInt(1000);
                j = random.nextInt(1000);
                break;
            case 4:
                i = random.nextInt(10000);
                j = random.nextInt(10000);
                break;
            default:
        }

        System.out.printf("How much is " + i + " plus " + j + "?\n");
        System.out.print("Please Enter a number: ");
        k = scnr.nextInt();

        if(k != i + j) {
            wrongCase = random.nextInt(4);
            switch(wrongCase) {
                case 0:
                    System.out.println("No. Please try again");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }

            return 0;
        }

        else if(k == i + j) {
            rightCase = random.nextInt(4);
            switch(rightCase) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;
            }

            return 1;
        }

        return 0;
    }
    public static int subtractionQuestion(int difficulty) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int i = 0, j = 0, k;
        int wrongCase;
        int rightCase;

        switch(difficulty) {
            case 1:
                i = random.nextInt(10);
                j = random.nextInt(10);
                break;
            case 2:
                i = random.nextInt(100);
                j = random.nextInt(100);
                break;
            case 3:
                i = random.nextInt(1000);
                j = random.nextInt(1000);
                break;
            case 4:
                i = random.nextInt(10000);
                j = random.nextInt(10000);
                break;
            default:
        }

        System.out.printf("How much is " + i + " minus " + j + "?\n");
        System.out.print("Please Enter a number: ");
        k = scnr.nextInt();

        if(k != i - j) {
            wrongCase = random.nextInt(4);
            switch(wrongCase) {
                case 0:
                    System.out.println("No. Please try again");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }

            return 0;
        }

        else if(k == i - j) {
            rightCase = random.nextInt(4);
            switch(rightCase) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;
            }

            return 1;
        }

        return 0;
    }
    public static int divisionQuestion(int difficulty) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int i = 0, j = 0;
        double k;
        int wrongCase;
        int rightCase;

        switch(difficulty) {
            case 1:
                i = random.nextInt(10);
                j = random.nextInt(10);
                break;
            case 2:
                i = random.nextInt(100);
                j = random.nextInt(100);
                break;
            case 3:
                i = random.nextInt(1000);
                j = random.nextInt(1000);
                break;
            case 4:
                i = random.nextInt(10000);
                j = random.nextInt(10000);
                break;
            default:
        }

        System.out.printf("How much is " + i + " divided by " + j + "?\n");
        System.out.print("Please Enter a number: ");
        k = scnr.nextDouble();

        if(k != ((double) i) / ((double) j)) {
            wrongCase = random.nextInt(4);
            switch(wrongCase) {
                case 0:
                    System.out.println("No. Please try again");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don’t give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
                default:
                    break;
            }

            return 0;
        }

        else if(k == ((double) i) / ((double) j)) {
            rightCase = random.nextInt(4);
            switch(rightCase) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
                default:
                    break;
            }

            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int i;
        int numQuestions = 10;
        int score;
        double percentCorrect;
        char status = 'Y';
        int difficulty;
        int arithmeticType;
        int randomType;

        while (status == 'y' || status == 'Y') {

            System.out.println("Welcome to this math tutorial!");
            System.out.println("Select from the following difficulty levels: \n");
            System.out.println("1: easy");
            System.out.println("2: medium");
            System.out.println("3: hard");
            System.out.println("4: very hard\n");
            System.out.print("Please enter the desired difficulty: ");
            difficulty = scnr.nextInt();

            while (difficulty > 4 || difficulty < 0) {
                System.out.print("Please enter the desired difficulty: ");
                difficulty = scnr.nextInt();
            }

            System.out.println("\nSelect from the following arithmetic problem types: \n");
            System.out.println("1: addition only");
            System.out.println("2: multiplication only");
            System.out.println("3: subtraction only");
            System.out.println("4: division only");
            System.out.println("5: random mixture\n");
            System.out.print("Please enter the desired option: ");
            arithmeticType = scnr.nextInt();

            while (arithmeticType > 5 || arithmeticType < 0) {
                System.out.print("Please enter the desired option: ");
                arithmeticType = scnr.nextInt();
            }

            System.out.println("\nPlease answer the following questions:\n");


            for(i = 0, score = 0; i < numQuestions; ++i) {

                randomType = random.nextInt(4) + 1;

                switch(arithmeticType) {
                    case 1:
                        score += additionQuestion(difficulty);
                        break;
                    case 2:
                        score += multiplicationQuestion(difficulty);
                        break;
                    case 3:
                        score += subtractionQuestion(difficulty);
                        break;
                    case 4:
                        score += divisionQuestion(difficulty);
                        break;
                    case 5:
                        switch (randomType) {
                            case 1:
                                score += additionQuestion(difficulty);
                                break;
                            case 2:
                                score += multiplicationQuestion(difficulty);
                                break;
                            case 3:
                                score += subtractionQuestion(difficulty);
                                break;
                            case 4:
                                score += divisionQuestion(difficulty);
                                break;
                        }
                        break;
                }
                System.out.println("");
            }

            percentCorrect = ((double) score / (double) numQuestions) * 100;

            //System.out.printf("%.1f \n", percentCorrect);

            if (percentCorrect < 75.0) {
                System.out.println("Please ask your teacher for extra help.");
            }
            else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            System.out.print("\nContinue with this program? (y/n): ");
            status = scnr.next().charAt(0);

            while (status != 'Y' && status != 'y' && status != 'N' && status != 'n') {
                System.out.print("\nContinue with this program? (y/n): ");
                status = scnr.next().charAt(0);
            }

            System.out.println("");

        }
    }
}
