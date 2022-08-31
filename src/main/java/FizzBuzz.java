public class FizzBuzz {
    public static void main(String[] args) {

        for (int i =1; i<=17; i++){
            System.out.println(proof(i));
        }
    }

    public static String proof(int value){

        if(value%5 == 0 && value%3 == 0){
            return "FizzBuzz";
        } else if (value%5 == 0) {
            return "Buzz";
        } else if (value%3 == 0) {
            return "Fizz";
        }else {
            String numWord = Integer.toString(value);
            return numWord;
        }

    }
}
