public enum Day {

    MONDAY("Дүйшөнбү"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private String translation;

    Day(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}



