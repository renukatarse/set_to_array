package settoarray;
import java.util.*;

public class Blagh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        String[] array = set.toArray(new String[0]);
        System.out.println(set);
        System.out.println(array);
    }
	}


