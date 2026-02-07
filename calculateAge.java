public class calculateAge {
    public static int calculateAge (int birthYear) {
        return 2026 - birthYear;
    }
    public static void main(String[] args) {
        int age = calculateAge.calculateAge(2006);
        System.out.println(age);
    }
}