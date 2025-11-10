package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	String name;
	boolean rented;
	int id;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.name = name;
		this.id = id;
		rented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		rented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		rented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return name;
	}

	public int getId() {
		// TODO: Fill in
		return id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return rented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID " + id + ". " + name;
	}

}