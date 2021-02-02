package be.intecbrussel.dynamic;
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class Factorial {
    public int getFactorial(int number) throws NotFactorisableNumberException {
        if(number < 0) {
            throw new NotFactorisableNumberException(number + " is a negative number, so it cannot be factorised.");
        } else {
            OptionalInt returnValue = IntStream.rangeClosed(1, number).reduce((acc, e) -> (acc * e));
            if (returnValue.isEmpty()) {
                return 1;
            } else {
                return returnValue.getAsInt();
            }
        }
    }

    public int getFactorial2(int number) throws NegativeNumberInputException{
        if(number < 0){
            throw new NegativeNumberInputException("Number must be > or = to 0 ");
        }

        int factorial = 1;
        for (int i = factorial; i <= number; i++) {
            factorial*=i;
        }
        return factorial;
    }

    public int calculateFactorial(int number){

        if(number<0){
            throw new IllegalArgumentException("Number can not be smaller than 0.");
        }

        return IntStream.range(1,number+1).reduce(1, (acc,el)->acc*el);
    }
}