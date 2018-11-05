/*
Kevin Nguyen
Basic program (Java) that when given two trees, check if the leaves are in sequential order and they're identical.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java LeafSimilarTrees"
*/

//imports
import java.io.*;
import java.util.*;

//class
class LeafSimilarTrees {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		
		//get trees

		//call leafSimilar
	}

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        //Local declaration
        List<Integer> r1List = new ArrayList<Integer>(), r2List = new ArrayList<Integer>();
        
        //empty case
        if(root1 == null || root2 == null) {
            return false;
        }
        
        //get leaf sequences respectively
        r1List = getLeafSeq(root1, r1List);
        r2List = getLeafSeq(root2, r2List);
        
        //Collections.sort(r1List); Collections.sort(r2List);
        return r1List.equals(r2List);
    }
    
    //getLeafSeq will return a list of leaves given a tree
    public List<Integer> getLeafSeq(TreeNode root, List<Integer> list) {
        if(root == null) { //base
            return list;
        }
        else { //recursive casae
            list = getLeafSeq(root.left, list);
            list = getLeafSeq(root.right, list);
            //add to list if both left and right branches are null
            if(root.left == null && root.right == null) {
                list.add(root.val);
            }
            return list;
        }
    }
}
