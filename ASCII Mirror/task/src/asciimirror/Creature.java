package asciimirror;
public class Creature {
    private StringBuilder temp, cow;
    Creature(){
        temp = new StringBuilder();
        cow = new StringBuilder();
        buildCreatures();
    }
    private void buildCreatures() {
        cow();
    }

    private void cow(){
        temp.append("            ^__^\s\n")
            .append("    _______/(oo)\s\n")
            .append("/\\/(       /(__)\s\n")
            .append("   | w----||    \s\n")
            .append("   ||     ||    \s\n");
        cow.append(temp.toString().replace(" ", "*"));
    }

    public String getCow(){
        return cow.toString().replace("*", " ");
    }

    public void printCow(){
        System.out.println("""
                            ^__^
                    _______/(oo)
                /\\/(       /(__)
                   | w----||   \s
                   ||     ||   \s""");
    }

}
