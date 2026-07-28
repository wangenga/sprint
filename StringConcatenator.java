package sprint;

public class StringConcatenator {
    public static String concatenate (String... arguments){
        StringBuilder con = new StringBuilder();

        for (String argument : arguments){
            con.append(argument);
        }
        return con.toString();
    }
}