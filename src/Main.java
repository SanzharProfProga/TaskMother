public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Nana",35, "Black");
        Mother mother1 = new Mother("Nina",38, "Green");
        Daughter daughter = new Daughter("Silvia",18,"Blue","Black","171");
        Mother daughter1 = new Daughter("Samira",19,"Green","White","163");
        Mother [] mothers = {mother,mother1,daughter,daughter1};
        for (Mother mother2 : mothers) {
            System.out.println(mother2.toString());
            System.out.println(mother2.getInfo());
        }



    }
}