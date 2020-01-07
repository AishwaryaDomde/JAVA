package Wrappers;

import java.util.Scanner;
import java.util.Arrays;
public class UserArray {
	Node root;
	static int d1 = -1;
	static int d2 = -1;
	static int dist = 0;
	static class Node {
		Node left, right;
		int key;
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
	static int findLevel(Node root, int k, int level) {
		if (root == null)
			return -1;
		if (root.key == k)
			return level;
		int l = findLevel(root.left, k, level + 1);
		return (l != -1) ? l : findLevel(root.right, k, level + 1);
	}
	static Node findDistUtil(Node root, int n1, int n2, int lvl) {
		// Base case
		if (root == null)
			return null;
		if (root.key == n1) {
			d1 = lvl;
			return root;
		}
		if (root.key == n2) {
			d2 = lvl;
			return root;
		}
		// Look for n1 and n2 in left and right subtrees
		Node left_lca = findDistUtil(root.left, n1, n2, lvl + 1);
		Node right_lca = findDistUtil(root.right, n1, n2, lvl + 1);
		if (left_lca != null && right_lca != null) {
			dist = (d1 + d2) - 2 * lvl;
			return root;
		}
		return (left_lca != null) ? left_lca : right_lca;
	}
	static int findDistance(Node root, int n1, int n2) {
		d1 = -1;
		d2 = -1;
		dist = 0;
		Node lca = findDistUtil(root, n1, n2, 1);
		if (d1 != -1 && d2 != -1)
			return dist;
		if (d1 != -1) {
			dist = findLevel(lca, n2, 0);
			return dist;
		}
		if (d2 != -1) {
			dist = findLevel(lca, n1, 0);
			return dist;
		}
		return -1;
	}
	public Node insertLevelOrder(int[] arr, Node root, int i) {
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;
			root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
			root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
		}
		return root;
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Length of Binary  Tree: ");
		int numberOfEmps = scan.nextInt();
		int[] nOEarray = new int[numberOfEmps]; 
		System.out.println("\nEnter Array(" + numberOfEmps + "):");
		int[] namesArray = new int[numberOfEmps];
		for (int i = 0; i < numberOfEmps; i++) {
			namesArray[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(namesArray));
		UserArray t2 = new UserArray(); 
		Node  root = new Node(1); 
	    t2.root = t2.insertLevelOrder(namesArray, t2.root, 0); 
	    t2.inOrder(t2.root);
	    System.out.print("First Element: ");
		int Felem = scan.nextInt();
	    System.out.print("Second Element: ");
		int Selem = scan.nextInt();
		System.out.println("Dist(" + Felem + "," + Selem + ") = " + findDistance(root, Felem, Selem));
	}
}
