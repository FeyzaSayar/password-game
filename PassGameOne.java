
/**
 *
 * @author fenna
 */

public class PassGameOne {
    
    //JFramePassGameOne window = new JFramePassGameOne();
    //String input = window.getPassword();
    
    /*
    public void processPassword(String input) {
                
        //TODO button clickable & read text when clicked - x
        //System.out.println(input);
        
        //TODO make label invisible and visible when button clicked - 
        //TODO make label visible after first entry(!!) or when length < 5 - 
         
        - entry count - 
        - if statement, return true or false - x
        
        
        if (ruleOne(input)) {
            System.out.println("The password must be at least 5 characters long");
        } else {
            System.out.println("Rule one validated");
        }
        
        
        //TODO loop to read new entries and add new rules after each iteration - 
        
    }
    */
    
    //how many rules in total - change
    public int totalRules() {
        return 1;
    }
    
    //Rule 1: password must be at least 5 characters
    public boolean ruleOne(String input) {
        return input.length() >= 5;
    }
    /*
    //Rule 2: 
    public boolean ruleTwo(String input) {
        
    }
    
    //Rule 3: 
    public boolean ruleThree(String input) {
        
    }
    */
    //how many rules the input passes
    public int countPassed(String input) {
        int passed = 0;
        if (ruleOne(input)) {
            passed++;
        }
        return passed;
    }
    
    //message to show in the output area
    public String showMessage(String input) {
        if (!ruleOne(input)) {
            return "Rule 1: The password must contain at least 5 characters";
        }
        return "Valid password!";
    }
    
}
