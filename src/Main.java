import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myDay = scanner.nextLine();
        Day [] day = {Day.MONDAY,Day.THURSDAY,Day.TUESDAY,Day.WEDNESDAY,Day.FRIDAY,Day.SATURDAY,Day.SUNDAY};
        for (Day days:day) {
          if(days.name().equals(myDay)){
        switch(days) {
            case MONDAY:
                System.out.println(days.getTranslation()+" күнү theory by java");
                break;
            case TUESDAY:
                System.out.println(days.getTranslation()+" күнү practice by java");
                break;
            case WEDNESDAY:
                System.out.println(days.getTranslation()+" күнү english lesson");
                break;
            case THURSDAY:
                System.out.println(days.getTranslation()+" күнү soft skills lesson");
                break;
            case FRIDAY:
                System.out.println(days.getTranslation()+" күнү repetition of lessons and solving various tasks");
                break;
            case SATURDAY:
                System.out.println(days.getTranslation()+" дем алыш күн: leisure and hobbies");
                break;
            case SUNDAY:
                System.out.println(days.getTranslation()+" family time");

            }
          }

        }
    }
}