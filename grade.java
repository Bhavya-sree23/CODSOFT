import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        int maths,social,science,english,telugu;
       int total;
       Scanner obj=new Scanner(System.in);
       String name;
        System.out.println("enter your name:-");
        name=obj.next();
        System.out.println("enter your maths marks:-");
        maths=obj.nextInt();
        System.out.println("enter your social marks:-");
        social=obj.nextInt();
        System.out.println("enter your science marks:-");
        science=obj.nextInt();
        System.out.println("enter your english marks:-");
        english=obj.nextInt();
        System.out.println("enter your telugu marks:-");
        telugu=obj.nextInt();
        total=maths+english+social+telugu+science;
        System.out.println("your total marks are:" +total);
        int average;
        average=total/5;
        System.out.println("your average is:-" +average);
        int percentage;
        percentage=(total*100)/500;
        System.out.println("your percentage is:" +percentage);
        if(percentage>=90 && percentage<=100)
        {
           System.out.println("your name is:-"+name+" and your grade is:'A+'");
        }
        else if(percentage>=80 && percentage<=89)
        {
            System.out.println("your name is:-"+name+" and your grade is:'A'");
        }
        else if(percentage>=70 && percentage<=79)
        {
            System.out.println("your name is:-"+name+" and your grade is:'B'");
        }
        else if(percentage>=60 && percentage<=69)
        {
            System.out.println("your name is "+name+" and your grade is:'C'");
        }
        else if(percentage>=50 && percentage<=59)
        {
            System.out.println("your name is "+name+" and your grade is:'D'");
        }
        else if(percentage>=40 && percentage<=49)
        {
            System.out.print("your name is "+name+" and your grade is:'E'");
        }
        else
        {
            System.out.print("your name is "+name+" and your grade is:'F'");
        }
        
    }
}