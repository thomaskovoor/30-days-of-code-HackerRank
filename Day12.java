import java.util.Scanner;
class Person
{
    String firstName;
    String lastName;
    int idNumber;
    Person(String firstName,String lastName,int idNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=idNumber;
    }
    public void printPerson()
    {
        System.out.println("Name: " + lastName + ", " + firstName+"\nID: " + idNumber); 
   }

}
class Student extends Person{
    private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    
    public char calculate(){
        int average = 0;
        for(int i = 0; i < testScores.length; i++){
            average += testScores[i];
        }
        average = average / testScores.length;
        
        if(average >= 90){
            return 'O'; // Outstanding
        }
        else if(average >= 80){
            return 'E'; // Exceeds Expectations
        }
        else if(average >= 70){
            return 'A'; // Acceptable
        }
        else if(average >= 55){
            return 'P'; // Dreadful
        }
        else if(average >= 40){
            return 'D'; // Dreadful
        }
        else{
            return 'T'; // Troll
        }
    }
}
public class Day12 {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String firstName = sc.next();
    String lastName = sc.next();
    int idNumber = sc.nextInt();
    int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = sc.nextInt();
        }
        sc.close();
        Student obj = new Student(firstName, lastName, idNumber, testScores);
        obj.printPerson();
        System.out.println("Grade: " + obj.calculate() );
}
    
}
