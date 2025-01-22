package Array;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
	 private Set<String> hashSet;
	    private Set<String> treeSet;

	    public HashSet() {
	        hashSet = new LinkedHashSet<>();
	        treeSet = new TreeSet<>();
	    }

	    public void addStudent(String name) {
	        hashSet.add(name);
	        treeSet.add(name);
	    }

	    public void removeStudent(String name) {
	        hashSet.remove(name);
	        treeSet.remove(name);
	    }

	    public boolean checkStudent(String name) {
	        return hashSet.contains(name);
	    }

	    public void displayStudentsOrderAdded() {
	        System.out.println("Students in order added: " + hashSet);
	    }

	    public void displayStudentsAlphabetically() {
	        System.out.println("Students in alphabetical order: " + treeSet);
	    }

	    public static void main(String[] args) {
	    	HashSet exercise = new HashSet();

	        exercise.addStudent("Alice");
	        exercise.addStudent("Bob");
	        exercise.addStudent("Charlie");

	        exercise.displayStudentsOrderAdded();

	        exercise.displayStudentsAlphabetically();

	        System.out.println("Is Bob in the collection? " + exercise.checkStudent("Bob"));

	        exercise.removeStudent("Bob");
	        
	        exercise.displayStudentsOrderAdded();
	        exercise.displayStudentsAlphabetically();

	        System.out.println("Is Bob in the collection? " + exercise.checkStudent("Bob"));
	    }
	
	
}
