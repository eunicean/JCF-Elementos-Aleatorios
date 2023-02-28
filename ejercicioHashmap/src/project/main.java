package project;

import java.util.HashMap;
import java.util.*;
import java.util.Queue;
import java.util.Arrays;
import java.util.Stack;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		String id,nombre,precio;
		Random rand = new Random();
		
		// Hashmap list of videogames
		HashMap<String, videogame> myHashmap = new HashMap<>();	
		
		for(int i = 0 ; i<100 ; i++) {
			id = Integer.toString(10 + rand.nextInt(500-10));
			nombre = "Videojuego gran" + Integer.toString(rand.nextInt(1000));
			precio = Integer.toString(rand.nextInt(1000));
			
			myHashmap.put(id, new videogame(id, nombre, precio));
		}
		
		System.out.println(myHashmap);

		//queue
		Queue<videogame> myqueue = new LinkedList<> ();
		for(int i = 0 ; i<100 ; i++) {
			id = Integer.toString(10 + rand.nextInt(500-10));
			nombre = "Videojuego gran" + Integer.toString(rand.nextInt(1000));
			precio = Integer.toString(rand.nextInt(1000));
			
			myqueue.add(new videogame(id, nombre, precio));
		}
		
		//array
		videogame[] myArray = new videogame[100];
		for(int i = 0 ; i<100 ; i++) {
			id = Integer.toString(10 + rand.nextInt(500-10));
			nombre = "Videojuego gran" + Integer.toString(rand.nextInt(1000));
			precio = Integer.toString(rand.nextInt(1000));
			
			myArray[i] = new videogame(id, nombre, precio);
		}
		
		//Stack
		Stack<videogame> myStack = new Stack<videogame>();
		for(int i = 0 ; i<100 ; i++) {
			id = Integer.toString(10 + rand.nextInt(500-10));
			nombre = "Videojuego gran" + Integer.toString(rand.nextInt(1000));
			precio = Integer.toString(rand.nextInt(1000));
			
			myStack.push(new videogame(id, nombre, precio));
		}
	}

}
