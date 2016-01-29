
public class NumericQuestion extends Question
{
    private double answer;
    
    //example of method overloading
    //this method overloads the setAnswer method of the Question class
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    
    //this is an example of method overriding
    //this method overrides the checkAnswer method of the Question class
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
}
