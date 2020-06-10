package ReplitCollections;

import java.util.ArrayList;

public class TwoDArrayWithArraylist {
    /*
    Create one 2d array [][] which is  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
Store all the elements in one arraylist and print the arraylist
Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,4,5,6,7,8,9]
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        ArrayList<Integer> twoDtoOneD = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                twoDtoOneD.add(array[i][j]);
            }
        }
        System.out.println(twoDtoOneD);
    }


}
