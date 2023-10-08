package second_problem;
import java.util.Random;
public class vers {
    private String line;
    Random random = new Random();
    private int spaceCount = 1;
    private int n = 0;
    vers(String line){
        this.line = line;
    }

    public void Calculate(){
        for (int i = 0; i < line.length();i++)
        {
            if (line.charAt(i) == ' ') {
                spaceCount++;
            }
        }

    }

    public void Steluta(String caractere){
        for (int i = line.length() - caractere.length(); i < line.length()  && n < caractere.length();i++)
        {
            if (line.charAt(i) == caractere.charAt(n)) {
                n++;
            }
        }
        if (n == caractere.length()) line = line + " *";
        line = line +" " +  spaceCount ;
        spaceCount = 0;
        n = 0;
    }

    public void CalculateGenerator(){
        double randomNumbeer = random.nextDouble();
        if (randomNumbeer < 0.1) line = line.toUpperCase();
    }

    public String getLine() {
        return line;
    }

}
