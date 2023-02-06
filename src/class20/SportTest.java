package class20;

public class SportTest {

    public static void main(String[] args) {

        Cricket cricket = new Cricket("Cricket","Pakistan","Green helmet");
        cricket.display();

        Soccer soc = new Soccer("Soccer", "Argentina", "Oliver's", 12);
        soc.display();
        soc.displayTeam();
    }
}
