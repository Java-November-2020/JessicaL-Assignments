public class Calculator implements java.io.Serializable{
    private double operandOne;
    private char operation;
    private double operandTwo;
    private double results;

    public Calculator(){

    }

        //setters
    public void setOperandOne(double opOne){
        operandOne = opOne;
    }
    public void setOperation(char op){
        operation = op;
    }
    public void setOperandTwo(double opTwo){
        operandTwo = opTwo;
    }

        //getters
    public double getOperandOne(){
        return operandOne;
    }
    public double getOperandTwo(){
        return operandTwo;
    }
    public char getOperation(){
        return operation;
    }
    public void getResults(){
        System.out.println(results);
    }

    public void performOperation(){
        if(this.operation == '+'){
            results = operandOne + operandTwo;
        }
        if(this.operation == '-'){
            results = operandOne - operandTwo;
        }
    }

}
