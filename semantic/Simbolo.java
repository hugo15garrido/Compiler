package compiler.semantic;
import java.io.*;
import java.util.*;
import java.util.List;

public class Simbolo{
	//campos
	 String simboloprinc;	
	 String tiposimbolo1;
	Integer Offset;
	Integer array;
	String scope;
	LinkedList  argumt= new LinkedList();
	
	//constructor  SYmbol varible
	public Simbolo(String simbolo1, Integer Offset1, String tiposimbolo){
		simboloprinc= simbolo1;
		tiposimbolo1 = tiposimbolo;
		array=null;
		Offset=Offset1;
	}

	//constructor  SYmbol varible array
	public Simbolo(String simbolo1,Integer array1, Integer Offset1, String tiposimbolo){
		simboloprinc= simbolo1;
		tiposimbolo = tiposimbolo;
		array1=array;
		Offset1=null;
	}
	
	//Constructor Symbol Metodos
	public Simbolo (String scope,String simbolo1, LinkedList  argumt, String tiposimbolo){
	tiposimbolo = tiposimbolo;
	scope=scope;
	array=null;
	Offset=null;
	simboloprinc = simbolo1;
	argumt=argumt;
	}

	public String toString(){
		return "simbolo: " + simboloprinc + ", Offset: " + (String.valueOf(Offset)) + ", Tipo : "+ tiposimbolo1 + "\n";
	}

} 
