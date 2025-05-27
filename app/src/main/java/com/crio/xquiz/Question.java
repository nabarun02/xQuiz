package com.crio.xquiz;
import java.util.*;

public class Question{
    //TODO: Define the variable to store the question text
        String questionText;
    //TODO: Define the variable to store the answer text
        String answer;
    //TODO: Define the variable to store the list of text choices
        List<String> choices;
    // TODO: Create the Question class constructor
        public Question(String questionText, List<String> choices, String answer) {

                if(questionText == null){
                        System.out.println("Question text cannot be null or empty!");
                }

                else if(choices.size() == 0){
                        System.out.println("Choices cannot be null or empty!");
                }
                
                else if(answer == null){
                        System.out.println("Answer cannot be null or empty!");
                }

                else if(!choices.contains(answer)){
                        System.out.println("Answer is not present among the choices!");
                }

                else{
                        this.questionText = questionText;
                        this.choices = choices;
                        this.answer = answer;
                }
                
        }
    // use the  signature :  public Question(String questionText, List<String> choices, String answer)
    // Include the following validations

        // Validate: If QuestionText is  null or empty
                // Print "Question text cannot be null or empty!"
        // Else If List of Choices is null or EmptyList,
                //  print “Choices cannot be null or empty!”
        // Else If answer is  null or Empty
                // print “Answer cannot be null or empty!”
        // Else If answer is not one of the choices in the List of choices by iterating over the list
                // print “Answer is not present among the choices!”
        // Else
                // initialise all the defined variables using `this` keyword
            
                
    // Note: The print statements should match exactly with the one specified above, since we have test cases designed on this
    // If the print statements do not match then the tests might fail, so be cautious

    //TODO: Create the getter method : public String getAnswer(), which returns the answer
        
        public String getQuestionText() {
                return questionText;
        }

        public String getAnswer() {
                return answer;
        }

        public List<String> getChoices() {
                return choices;
        }

    //TODO: Create the getter method : public String getQuestionText(), which returns the questionText

    //TODO: Create the getter method : public List<String> getChoices(), which returns the choices

    //TODO: Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        
        boolean checkAnswer(String ans){
                
                if(ans.equalsIgnoreCase(answer)){
                    return true;
                }

                else{
                    return false;
                }

        }
        // Validate: If answer provided in the input matches the existing answer for the given question, then return True
        // Else:  return False.


        public void display(){
        System.out.println(getQuestionText());
        for(int i = 0; i < choices.size(); i++){
                int choiceNumber = i + 1;
                System.out.println(choiceNumber + ":" + choices.get(i));
        }
        }


}

