import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Commission {

    public static void main(String[] args){

        String input =
                "Let's parse some bad input with regular expressions" +
                        "Expenses\n" +
                "            Johnver Vanston Danbree Vansey  Mundyke\n" +
                "Tea             120        65        890     54      430\n" +
                "iuhfgisghf isdfgh dighdhk dfhjg dkgfh\n" +
                "Coffee 300 10 23 802 235\n" +
                "jjjjjj\n" +
                "Water        50   299  1290   12   145\n" +
                "adsgffagfdggf\n" +
                "Milk             67     254      89              129       76\n" +

                "    ffdfdfdfd   sss     Revenue\n" +
                        "37MEOW MIX\n" +
                "            Johnver Vanston Danbree Vansey  Mundyke\n" +
                "Tea         190       140    1926     14         143\n" +
                "45 777 5 43 53 Test\n" +
                "Coffee          325      19         293   1491       162\n" +
                "Water      682   14  852  56      659\n" +
                "Milk       829   140     609    120    87\n" +
                        "MEOW MIX\n";

        //find names, revenue, expenses
        String[] names = findNames(input);
        ArrayList<ArrayList<Integer>> revenue = findNumbers(input, "revenue");
        ArrayList<ArrayList<Integer>> expenses = findNumbers(input, "expenses");

        Map<String, Double> commissionMap = new HashMap<>();
        for(String name : names){
            commissionMap.put(name, 0.0);
        }

        //populate commissionMap
        int person = 0;
        for(String name : names){
                for(int k = 0; k < revenue.size(); k++){
                    commissionMap.put(name, commissionMap.get(name) +
                            ((revenue.get(k).get(person)-expenses.get(k).get(person)>=0.0)?(revenue.get(k).get(person)-expenses.get(k).get(person))*0.062:0) );
                }
            person++;
        }

        //print formatted commission map
        System.out.printf("%10s", " ");
        for(String name: names){
            System.out.printf("%13s", name);
        }
        System.out.printf("\n%-10s", "Commission");
        for(Map.Entry ke : commissionMap.entrySet()){
            String number = String.format("$%.2f", ke.getValue());
            System.out.print(String.format("%13s", number));
        }

    }


    private static ArrayList<ArrayList<Integer>> findNumbers(String input, String wanted){
        String notWanted;
        switch(wanted){
            case "revenue":
                notWanted = "expenses";
                break;
            case "expenses":
                notWanted = "revenue";
                break;
            default:
                System.out.println("You didn't pass in a good argument to the findNumbers method");
                notWanted = "error";
        }

        input = input.toLowerCase();
        String[] lines = input.split("\n");

        //pass array into List for manipulation
        ArrayList<String> linesList = new ArrayList<>(Arrays.asList(lines));

        //replace multiple white spaces with single white space
        linesList.replaceAll(n -> n.replaceAll("(\\s+)", " "));
        //remove white space if it's at the beginning
        linesList.replaceAll(n -> n.replaceAll("^(\\s)", ""));

        //find lines that say revenue or expenses
        int wantedIndex = -1;
        int notWantedIndex = -1;
        for(int i = 0; i < linesList.size(); i++){
            if(linesList.get(i).contains(wanted)){
                wantedIndex = i;
                //System.out.println("wanted category at line " + wantedIndex); debug
            }
            if(linesList.get(i).contains(notWanted)){
                notWantedIndex = i;
                //System.out.println("not wanted category at line " + notWantedIndex); debug
            }
        }

        if(wantedIndex == -1 || notWantedIndex == -1){
            System.out.println("revenue or expenses missing");
        }

        //remove all lines not associated with wanted numbers
        if(wantedIndex < notWantedIndex){
            int linesToDelete = linesList.size() - notWantedIndex;
            for(int i = 0; i < linesToDelete; i++){
                linesList.remove(notWantedIndex);
            }
        } else{
            for(int i = 0; i < wantedIndex - notWantedIndex; i++){
                linesList.remove(notWantedIndex);
            }
        }

        //remove lines not containing regex pattern of (letters+*.+*\\d+.*)
        linesList.removeIf(n -> !n.matches("([a-z]+)(.*)(\\d)(.*)")
        );

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < linesList.size(); i++){
            result.add(new ArrayList<Integer>());
            String[] temp = linesList.get(i).split(" ");
            for(int k = 1; k < temp.length; k++){
                result.get(i).add(Integer.parseInt(temp[k]));
            }
        }

        return result;
    }



    private static String[] findNames(String input) {
        String[] lines = input.split("\n");

        //pass array into List for manipulation
        ArrayList<String> linesList = new ArrayList<>(Arrays.asList(lines));

        //remove revenue, expenses, anything with a number, anything that doesn't contain a letter, and empty lines
        linesList.removeIf(n -> n.toLowerCase().matches("(.*)revenue(.*)") ||
                n.toLowerCase().matches("(.*)expenses(.*)") ||
                n.matches("(.*)(\\d+)(.*)") ||
                !n.matches("(.*)([a-z])(.*)") ||
                n == "\n"
            );

        //replace multiple white spaces with single white space
        linesList.replaceAll(n -> n.replaceAll("(\\s+)", " "));
        //remove white space if it's at the beginning
        linesList.replaceAll(n -> n.replaceAll("^(\\s)", ""));

        String[] names = linesList.get(0).split(" ");

        return names;

    }
}