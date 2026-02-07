public class executeGradeReport {
    public static void executeGradeReport(double score) {
        if (validateScore(score)) {
            System.out.println("Invalid score");
            return;
    }
char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }
}

    public static boolean validateScore(double score) {
        return score <0 || score > 100;
    }
    public stataic char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance!");
                break;
            case 'B':
                System.out.println("Good performance!");
                break;
            case 'C':
                System.out.println("Average performance!");
                break;
            case 'D':
                System.out.println("Below average performance!");
                break;
            case 'F':
                System.out.println("Failing performance!");
                break;
        }
    }