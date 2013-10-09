package compiler.semantic;

import java.io.*;
import java.util.*;


public class Symbol{
	int type1;
	Integer Offset;
	Integer array;
	Table tableLocal;
	LinkedList  argumt= new LinkedList();
	LinkedList<Table> stmt = new LinkedList<Table>();


	
	

//constructor  SYmbol varible
public Symbol(int type, Integer Offset){
	type1= type;
	array=null;
	Offset=Offset;
}


//constructor  SYmbol varible array
public Symbol(int type,Integer array, Integer Offset){
	type1= type;
	array=array;
	Offset=null;
}


//Constructor Symbol Metodos
public Symbol (int type, Table local, LinkedList  argumt){
	type1=type;
	array=null;
	Offset=null;
	tableLocal= local;
	argumt=argumt;
	stmt=stmt;


}


//Constructor Symbol Metodos si tienen stmt
public Symbol (int type, Table local,LinkedList  argumt, LinkedList<Table> stmt){
	type1=type;
	array=null;
	Offset=null;
	tableLocal= local;
	argumt=argumt;
	stmt=stmt;


}

public int getType(){
 return type1;
}

public Integer getArray(){
 return this.array;
}

 public Table getTable() {
	return this.tableLocal;
    }

/*public LinkedList getLisStmt() {
	return stmt.toArray();
    }

public LinkedList getLisargumt() {
	return argumt.toArray();
}*/

}