public class Daughter extends Mother {
    private String hairColor;
    private String height;

    public Daughter(String name, int age, String eyeColor, String hairColor, String height) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String getInfo() {
        return getName() + " this is daughter";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHair color: " + hairColor +
                "\nHeigh: " + height;
    }
}
