package pl.wkn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,5,9};

        Solution solution1 = new Solution();
	System.out.println(solution1.solution(A));
    //List<Integer> list3 = new ArrayList<>();
        //Solution solution2 = new Solution();
        //Integer[] otherList = new Integer[] {9,3,9,3,9,5,9};
        //List<Integer> listOfUniques = new ArrayList<>();
        //listOfUniques.addAll(Arrays.asList(otherList));
        //System.out.println(solution2.getUniques(listOfUniques));
	//System.out.println(solution1.getUniques(a));

	//System.out.println(solution1.solution(A));
	//System.out.println(solution1.solution(A));
	//System.out.println(solution1.solution(A));
	//System.out.println(solution1.getClass());
    }
}

class Solution {

    public int solution(int[] A){
        List<Integer> listOfDigits = new ArrayList<>();
        List lst = Arrays.asList(A);
        List lst2 = new ArrayList<>();
        //List lst3 = this.getUniques(lst);
        //System.out.println(lst3.getClass());
        //System.out.println(lst3);
        List<Integer> listOfUniques = new ArrayList<>();
        listOfUniques.addAll(lst);
        System.out.println(this.getUniques(listOfUniques));

        //System.out.println(lst.toString().length());
        //System.out.println(A.toString().toCharArray());
        for (int i = 0; i < A.length; i++) {
            //System.out.println(i);
            //System.out.println(A[i]);

            int digit1 = A[i];
            //System.out.println(digit1);

        }

        return A.length;}

    //int[] get

    //int counter {}
    List getUniques(List lst) {
        System.out.println(lst);
        List<Integer> inputlistOfUniques2 = new ArrayList<>();
        inputlistOfUniques2.addAll(lst);
        List<Integer> listOfUniques2 = new ArrayList<>();
        int element1 =0;
        for (int y = 0; y < lst.size(); y++) {
            //element = lst.;
            //System.out.println(lst.get(y).);
             element1 = inputlistOfUniques2.get(y);
            //element = inputlistOfUniques2.get(y);
            System.out.println(element1);
            //if (listOfUniques2.contains(element1)) {
             //   System.out.println("Contains");
            //} else {
             //   System.out.println("Not Contains");
              //  listOfUniques2.add(0);
            //}

            lst.get(0);

        }
        System.out.println(listOfUniques2);
        return lst;}

}
