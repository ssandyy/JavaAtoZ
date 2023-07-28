public class StudentAttendance {
    
    
    public static void main(String[] args) {
        int classesHeld;
        int classAttended;
        
        System.out.println("Enter number of days classes held: ");
        classesHeld = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter number of days classes Attend: ");
        classAttended = new java.util.Scanner(System.in).nextInt();

        float studentPercentage = (classAttended*100)/classesHeld;
        if(studentPercentage<75){
            System.out.println("your attendance percentage is "+studentPercentage);
            System.out.println("Sorry!!, your attendance percentage is below 75, So you are mot allowed to sit in Exam..!");

        }else{
            System.out.println("you have attendance percentage is "+studentPercentage);
            System.out.println("Congratulation.!! your attendance percentage is above 75, So you are allowed to sit in Exam..!");

        }
    }
}
