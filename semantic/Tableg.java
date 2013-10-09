package compiler.semantic;
import compiler.myparser.*;
import java.util.Hashtable;
import java.util.Map.Entry;


public class Tableg {
    public static final int typeError = -2;
    private Hashtable<Integer,Table> tablee = new Hashtable<Integer,Table>();

    public boolean put(Integer num,Table tabla) {
	if (tablee.get(num) == null) {
	    tablee.put(num,tabla);
	    return true;
	}

	return false;
	
    }
	
	 public Table get(Integer num) {
	Table t = tablee.get(num);
	if (t != null) {
	    return t;
	}

	return null;
    }
	
	
}