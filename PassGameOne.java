
public class PassGameOne {
    
    //how many rules in total - change
    public int totalRules() {
        return 6;
    }
    
    //Rule 1: password must be at least 5 characters
    public boolean ruleOne(String input) {
        return input.length() >= 5;
    }
    
    //Rule 2: password must contain a number
    public boolean ruleTwo(String input) {
        return input.matches(".*[0-9].*");
    }
    //.* allows any other characters before and after the digit
    
    //Rule 3: password must contain special character
    public boolean ruleThree(String input) {
        return input.matches(".*[^a-zA-Z0-9].*");
    }
    
    //Rule 4: password must contain a season
    public boolean ruleFour(String input) {
        return input.matches("(?i).*(spring|summer|autumn|fall|winter).*");
    }
    
    //Rule 5: password must contain country utc+5
    public boolean ruleFive(String input) {
        return input.matches("(?i).*"
                + "(Kazakhstan|Pakistan|Tajikistan|"
                + "Turkmenistan|Uzbekistan|Maldives|Russia).*");
    }
    
    //Rule 6: all vowels must be capitalized
    public boolean ruleSix(String input) {
        if (input.matches(".*(a|e|i|o|u).*")) {
            return false;
        }
        return true;
    }
    //a|e|i|o|u checks if there's any lowercase vowels, this isn't allowed
    
    //how many rules the input passes for progress bar
    public int countPassed(String input) {
        int passed = 0;
        if (ruleOne(input)) {
            passed++;
        }
        if (ruleTwo(input)) {
            passed++;
        }
        if (ruleThree(input)) {
            passed++;
        }
        if (ruleFour(input)) {
            passed++;
        }
        if (ruleFive(input)) {
            passed++;
        }
        if (ruleSix(input)) {
            passed++;
        }
        return passed;
    }
    
    //message to show in the output area
    public String showMessage(String input) {
        if (!ruleOne(input)) {
            return "Rule 1: The password must contain at least 5 characters";
        }
        if (!ruleTwo(input)) {
            return "Rule 2: The password must include at least one number";
        }
        if (!ruleThree(input)) {
            return "Rule 3: The password must include a special character";
        }
        if (!ruleFour(input)) {
            return "Rule 4: The password must include a season";
        }
        if (!ruleFive(input)) {
            return "Rule 5: Password must include a country listed "
                    + "as using the UTC+5 time";
        }
        if (!ruleSix(input)) {
            return "Rule 6: All vowels in the password must be capitalised";
        }
        return "Valid password!";
    }
}
