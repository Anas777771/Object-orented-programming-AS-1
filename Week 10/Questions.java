public class Questions {
    
    private final String question;
    private final String option1;
    private final String option2;
    private final String answer;
    
    public Questions() {
        // constructor
        this.question = "Which keyword creates an object?";
        this.option1 = "new";
        this.option2 = "class";
        this.answer = "new";
    }
    
    public String getQuestion() {
        return question;
    }
    
    // missing components
    public String getOption1() {
        return option1;
    }
    
    public String getOption2() {
        return option2;
    }
    
    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}