package Day_31_2025;

import java.util.*;

public class LuckyPhoneNumberSelector {

    // Define forbidden and lucky pairs
    private static final Set<String> FORBIDDEN_PAIRS = Set.of(
            "46", "64", "56", "65", "58", "85", "16", "61", "97", "79",
            "41", "14", "48", "84", "54", "45", "44", "28", "82"
    );

    private static final Set<String> LUCKY_PAIRS = Set.of(
            "93", "31", "11", "15", "25", "57", "73"
    );

    public static void main(String[] args) {
        // Replace this list with your candidate phone numbers
        List<String> candidates = new ArrayList<>(Arrays.asList(
                "7300044633", "7300054830", "7300055942", "7300057414", "7300059359",
                "7300062135", "7300063932", "7300065367", "7300069091", "7300069593",
                "7300069865", "7300071703", "7300083153", "7300083396", "7300083599",
                "7300084196", "7300089405", "7300095753", "7300096748", "7300086790",
                "7300073623", "7300091840", "7300062896", "7300027856", "7300018937",
                "7300036907", "7300053351", "7300017706", "7300087401", "7300046063",
                "7300045987", "7300078259", "7300023453", "7300081380", "7300028610",
                "7300070223", "7300057599", "7300099662", "7300099180", "7300043423",
                "7300098212", "7300067052", "7300077829", "7300062925", "7300085060",
                "7300027044", "7300089780", "7300065766", "7300073245", "7300020812",
                "7300081747", "7300028756", "7300036026", "7300088656", "7300053822",
                "7300089406", "7300046099", "7300051542", "7300094705", "7300021676",
                "7300086609", "7300054955", "7300055243", "7300080967", "7300087017",
                "7300020148", "7300093551", "7300015864", "7300067881", "7300039272",
                "7300058026", "7300040584", "7300023341", "7300069794", "7300088399",
                "7300043780", "7300076269", "7300061040", "7300052478", "7300091289",
                "7300090577", "7300073142", "7300082829", "7300046716", "7300052611",
                "7300065363", "7300038696", "7300097641", "7300091169", "7300055132",
                "7300063568", "7300043255", "7300082879", "7300072015", "7300022909",
                "7300091166", "7300026086", "7300091640", "7300052782", "7300076710",
                "7300043168", "7300037837", "7300050393", "7300061558", "7300071384",
                "7300091039", "7300083474", "7300028013", "7300016448", "7300076377"
        ));

        List<PhoneNumber> validNumbers = new ArrayList<>();

        for (String num : candidates) {
            String cleaned = num.replaceAll("[^0-9]", ""); // Remove non-digits
            if (isValid(cleaned)) {
                int luckyScore = countLuckyPairs(cleaned);
                validNumbers.add(new PhoneNumber(cleaned, luckyScore));
            }
        }

        // Sort by: 1. Most lucky pairs, 2. Contains '8', 3. Natural order
        validNumbers.sort(Comparator
                .comparingInt(PhoneNumber::getLuckyScore).reversed()
                .thenComparing(n -> n.getNumber().contains("8") ? 0 : 1)
                .thenComparing(PhoneNumber::getNumber)
        );

        System.out.println("Best phone numbers:");
        validNumbers.forEach(n -> System.out.println(n.getNumber() + " | Lucky Pairs: " + n.getLuckyScore()));
    }

    // Rule 1-3: Validate digit repetition limits
    private static boolean isValid(String number) {
        int count9 = 0, count7 = 0, count8 = 0;
        for (char c : number.toCharArray()) {
            if (c == '9') count9++;
            else if (c == '7') count7++;
            else if (c == '8') count8++;
        }
        if (count9 > 2 || count7 > 1 || count8 > 1) return false;

        // Rule 4: Check forbidden pairs
        for (int i = 0; i < number.length() - 1; i++) {
            String pair = number.substring(i, i + 2);
            if (FORBIDDEN_PAIRS.contains(pair)) return false;
        }

        return true;
    }

    // Rule 5: Count lucky pairs
    private static int countLuckyPairs(String number) {
        int count = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            String pair = number.substring(i, i + 2);
            if (LUCKY_PAIRS.contains(pair)) count++;
        }
        return count;
    }

    static class PhoneNumber {
        private final String number;
        private final int luckyScore;

        public PhoneNumber(String number, int luckyScore) {
            this.number = number;
            this.luckyScore = luckyScore;
        }

        public String getNumber() { return number; }
        public int getLuckyScore() { return luckyScore; }
    }
}

