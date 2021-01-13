import java.util.Scanner;
import java.lang.Math;

class Mathcal{
    Scanner sc = new Scanner(System.in);
    public void Add(){
        System.out.println("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the number b : ");
        float b = sc.nextFloat();
        System.out.println("The sum of a and b is : "+(a+b));
    }
    public void subtract(){
        System.out.println("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the number b : ");
        float b = sc.nextFloat();
        System.out.println("The subtraction of a and b is : "+(a-b));
    }
    public void multiply(){
        System.out.println("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the number b : ");
        float b = sc.nextFloat();
        System.out.println("The multiplication of a and b is : "+(a*b));
    }
    public void division(){
        float result = 0.0f;
        int i=1;
        System.out.println("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the number b : ");
        try{
        float b = sc.nextFloat();
        if(b==0){
            throw new Exception();
        }
        result = a/b;
        }
        catch(Exception e){
            System.out.println("Number is not divided by zero");
             i = 0;
        }
        if(i!=0)
        System.out.println("The division of a and b is : "+result);
    }
    public void modulo(){
        float result = 0.0f;
        int i=1;
        System.out.println("Enter the number a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the number b : ");
        try{
        float b = sc.nextFloat();
        if(b==0){
            throw new Exception();  
        }
        result = a%b;
        }
        catch(Exception e){
            System.out.println("Number is not divided by zero");
            i=0;
        }
        if(i!=0)
        System.out.println("The modulo of a and b is : "+result);
    }
}

class Scientificcal{
    Scanner scan = new Scanner(System.in);
    public void ceil(){
        double result =0.00;
        int i=1;
        System.out.println("Enter the number a : ");
        try{
            float a = scan.nextFloat();
            if(a<=0){
                throw new IllegalAccessError();
            }
            result = Math.ceil(a);
        }
        catch(IllegalAccessError ier){
            System.out.println("Please ! take the number greater than 0");
            i=0;
        }
        if(i!=0)
        System.out.println("The Ceil value of a  : "+result);
    }
    public void floor(){
        double result =0.00;
        int i =1;
        System.out.println("Enter the number a : ");
        try{
            float a = scan.nextFloat();
            if(a<=0){
                throw new IllegalAccessError();
            }
            result = Math.floor(a);
        }
        catch(IllegalAccessError ier){
            System.out.println("Please ! take the number greater than 0");
            i=0;
        }
        if(i!=0)
        System.out.println("The Floor value of a  : "+result);
    }
    public void squareroot(){
        double result = 0.00;
        int i=1;
        System.out.println("Enter the number a : ");
        try{
            double a = scan.nextFloat();
            Squarerooteexception obj = new Squarerooteexception();
            result = obj.squareroot(a);
        }
          
        catch(UserdefinedException ude){
            System.out.println("Please ! take the number greater than 0");
            i=0;
        }
        if(i!=0)
        System.out.println("The Squareroot value of a  : "+result);
    }
    public void exponential(){
        double result = 0.00;
        double a=0.00,b=0.00;
        int i=1;
        try{
            System.out.println("Enter the base : ");
             a = scan.nextFloat();
            System.out.println("Enter the exponent : ");
             b = scan.nextFloat();
            ExpoException obj = new ExpoException();
            result = obj.expo(a,b);
        }
        catch(UserdefinedException ude){
            System.out.println("Please ! take the base and exponent greater than 0");
            i=0;
        }
        if(i!=0)
        System.out.println("The value of "+a+" to the power "+b+" is "+result);
    }
}

class UserdefinedException extends Exception{
    public UserdefinedException(){
    }
}

class Squarerooteexception{
    public double squareroot(double x) throws UserdefinedException{
        if(x<=0){
            throw new UserdefinedException();       
        }
        else
        return Math.sqrt(x);
    }
}

class ExpoException{
    double c;
    public double expo(double a,double b) throws UserdefinedException{
        if(a<=0 || b<=0){
            throw new UserdefinedException();       
        }
        else{ 
            for(int i=1;i<b;i++){
              if(i==1)
              c = a*a;
              else
              c=c*a;
            }
            return c;
        }
    }
}

class Iteration{
    Scanner obj = new Scanner(System.in);
    public void iterate() {
        int x;
        do{
        System.out.println("Enter the operation you wish to perform : ");
        System.out.println("1. Mathematical Calculation \n2. Scientific Calculation \n3. Exit");
         x = obj.nextInt();
        switch(x){
            case 1: System.out.println(" Select an arithmetic operation : ");
                    System.out.println("1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Modulo \n6. Back to Main Menu");
                    int y = obj.nextInt();
                    Mathcal cal = new Mathcal();
                    switch(y){
                        case 1:cal.Add();
                               break;
                        case 2:cal.subtract();
                               break;
                        case 3:cal.multiply();
                               break; 
                        case 4:cal.division();
                               break;
                        case 5:cal.modulo();
                               break;  
                        case 6:break;    
                    }
                    break;
            case 2: System.out.println("Select a scientific operation :"); 
                    System.out.println("1. Ceil \n2. Floor \n3. Square Root \n4. Power Of \n5. Back to Main Menu");
                    int z = obj.nextInt();
                    Scientificcal calc = new Scientificcal();
                    switch(z){
                        case 1:calc.ceil();
                               break;
                        case 2:calc.floor();
                               break;
                        case 3:calc.squareroot();
                               break; 
                        case 4:calc.exponential();
                               break;
                        case 5:break;  
                    }
                    break;
            case 3: break;        
        }
    }while(x!=3);
    }
}


class Challenge30{
    public static void main(String[] args) {
        Iteration object = new Iteration();
        object.iterate();
    }
}
