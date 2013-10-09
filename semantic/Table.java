package compiler.semantic;
import compiler.myparser.*;
import java.util.Hashtable;
import java.util.Map.Entry;


public class Table {
    public static final int typeError = -2;
    private Hashtable<String,Symbol> table = new Hashtable<String,Symbol>();

    public boolean put(String name, Symbol simb) {
	if (table.get(name) == null) {
	    table.put(name,simb);
	    return true;
	}

	return false;
	
    }
	
	 public Symbol get(String name) {
	Symbol t = table.get(name);
	if (t != null) {
	    return t;
	}

	return null;
    }
	
	
	
 public static String prettyPrintType(int type) {
	switch(type) {
      	  case typeError: return "ERROR!";
	  case DecafParser.INT: return "int";
	  case DecafParser.BOOLEANN: return "boolean";
	}
	return "";
	
    }

	
 public String toString() {
	String au2="";
	String str = "Tabla de Simbolos\t\t\nTIPO\t|\tNOMBRE\n";
	for (Entry e : table.entrySet()) {
		Symbol sy=(Symbol)e.getValue();
	    str += prettyPrintType(((Symbol)e.getValue()).getType()) + "\t\t" + e.getKey() + "\n";
		if(sy.getTable()!=null){
			Table aux=sy.getTable();
			au2="tabla de "+e.getKey()+"\n"+aux.toString();
		}
	}
		str=str+au2;
	return str;
    }
	
	
	

}