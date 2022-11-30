
    import java.util.*;
//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.Collection;
public class Oddev {

	public static void main(String[] args) {
List<Integer>nums=Arrays.asList(1,2,3,4,5);
		Map<Boolean, List<Integer>> obj = nums.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
	}
}


