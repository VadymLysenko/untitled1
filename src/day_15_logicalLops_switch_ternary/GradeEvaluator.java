package day_15_logicalLops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'f';

        grade = 'D';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c'){
            System.out.println("Passed - " + grade);
        }else if (grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retake - " + grade);
        }else if(grade == 'F' || grade == 'f'){
            System.out.println("Fail - " + grade);
        }else{
            System.out.println("Invalid grade! - " + grade);
        }
    }
}
