public class  TaskOne{
    public static int maximumNumber (int firstNumber, int secondNumber){
    if (firstNumber > secondNumber){
    return  firstNumber;
    }
else {
    return secondNumber;
    }


}


    public static boolean isEven (int number ){
    if (number % 2 == 0){
    return true;
 }
    else{
    return false;
   
}
    
}


    public static boolean isPrime(int number){
    
    if(number < 2){
    return false;

    }
    else{ 
       for(int count = 2; count < number;  count++ ) {
            if (number % count == 0 ){
                return  false;
}
}
       
    }
        return true; 
    }


    public static int subtract(int numberOne, int numberTwo){
        int largest = numberOne;
        int smallest = numberTwo;
        if (numberTwo > numberOne){
            largest = numberTwo;
            smallest = numberOne;
}
        int difference = largest - smallest;
        return difference;
}


    public  static float divide (int numberOne, int numberTwo){
        float quotient = 0;
        if (numberTwo == 0){
            quotient = 0;

    }
       else{
        quotient = numberOne/numberTwo;
                    
}

        return quotient; 
}

 
public static int factor(int number){
    int counter = 0;
    for(int count = 1; count <= number;  count++){
        if (number % count == 0){
            counter++;    
}
} 

        return counter;
   }



public static boolean isPerfectSquare (int number){
    for (int count = 1; count < number; count++){
        if(count*count == number){  
            return true;
    }

}   
        return false;

    }




//public static boolean isPailndrome (int number){
  //  for (int count = 1  count < number; count++){
    //    if (count == )}}







public static long factorial (int number){
    long result = 0L;
    for (int count = number ; count <= 1 ; count--){
        int factor = count * count;


        result = factor;
}
        return result;

}















public static void main(String[] args){
    int numberOne = 25;
    int numberTwo = 5;

    int primeNum = 997 ;
    System.out.println(isPrime(primeNum));

    int  number = 82   ; 

    System.out.println(maximumNumber(numberOne, numberTwo));
    System.out.println(subtract(numberOne, numberTwo));
    System.out.println(divide(numberOne, numberTwo));
    System.out.println(factor(numberOne));
    System.out.println(isPerfectSquare(numberOne));
    System.out.println(factorial(numberTwo));



}
}



