package greedy_algorithm;
//que--> u are given n activites with their start and end times. select the maximum number of activities that can be performed by a single person. assuming that a person can only work on a single activity at a time. activities are sorted according to end time.
//srart=[10,20,30]
//end=[20,25,30]
//ans = 2(A0 & A2)
//approach--short on end time basis--select first activity(A0)--
import java.util.*;
public class Activity_selection {
    public static void main(String[] args) { // time complexity --O(n)
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis shorted activity
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        //first activity
        maxAct = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i=1; i<end.length; i++){
            if (start[i] >= lastend) {
                //select activity
                maxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }

        System.out.println("max activity = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }

    }
}
