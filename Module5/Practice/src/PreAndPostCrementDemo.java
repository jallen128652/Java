public class PreAndPostCrementDemo {
//    both ++value and value++ result in value becoming 25. However, when a prefix or postfix operator is
//    used as part of a larger expression, it does make a difference which operator you use because they
//    function differently in terms of what they return. When a prefix operator is used in an expression,
//    the value after the calculation is used, but when a postfix operator is used in an expression,
//    the value before the calculation is used.
//    example: if b = 4 and c = b––, 4 is assigned to c, but b is decreased and takes the value 3.
//    If b = 4 and c = ––b, b is decreased to 3 and 3 is assigned to c.
    public static void main(String[] args){
        int myNumber, answer;
        myNumber = 17;
        System.out.println("Before pre-incrementing my number is " + myNumber);
        answer = ++myNumber;
        System.out.println("After pre-incrementing my number is " + myNumber + " and answer is " +
                  answer);
        myNumber = 17;
        System.out.println("Before post-incrementing my number is " + myNumber);
        answer = myNumber++;
        System.out.println("After post-incrementing my number is " + myNumber + " and answer is " +
                 answer);
//        additional example
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }
}
