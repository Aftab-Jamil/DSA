package PW_Skills.queue;

import java.util.LinkedList;
import java.util.Queue;
// leetcode 1700 : proceed as in the question
public class NumberOfStudentUnableToEatTheLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        int count=students.length;
        int currentQueueLength;
        int i=0;
        Queue<Integer> studentQueue=new LinkedList<>();
        for(int s:students) studentQueue.add(s);
        for(int sandwich:sandwiches){
            currentQueueLength=studentQueue.size();
            i=0;
            while(i<currentQueueLength){
                if(studentQueue.peek()!=sandwich){
                    studentQueue.add(studentQueue.remove());
                }else{
                    studentQueue.remove();
                    break;
                }
                i++;
            }
            if(i>=currentQueueLength) return studentQueue.size();
        }
        return 0;

    }

    public static void main(String[] args) {
        int [] students = {1,1,0,0};
        int [] sandwiches = {0,1,0,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
