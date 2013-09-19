package laboratorios.lab04;
 
import java.util.List;
import java.util.LinkedList;
 
public class Root extends Node{
	private List<Node> list;
	
	public Root(){
		list = new LinkedList<Node>();
	}
	
	public void add(Node node){
		list.add(node);
	}
	
	public void getList(){
		System.out.println (this.list);
	}
	
	public void print(String padding){
	try{
		for(Node n : list){
			System.out.println("exp ->");
			n.print(padding + "\t");
		}
	}catch (exception e){
		System.out.println (e);
	}
	}
	
	public void print(){
		print("");
	}

} 
 
