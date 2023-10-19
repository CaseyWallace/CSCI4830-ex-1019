package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      checkString(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      checkString(edgeList, p);
      return null;
   }

   <T extends Graph> void checkString(List<T> objects, String s) {
	   for (T object : objects) {
			if (object.contains(s))
				System.out.println(object);
		}
   }
}

class Graph {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}


class Node extends Graph{}

class Edge extends Graph {}