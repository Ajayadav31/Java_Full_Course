package linearSearch;
import java.util.*;

public class SearchInStrings {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String name = in.next();
			char target = in.next().trim().charAt(0);
			System.out.println(search(name,target));
			//System.out.println(Arrays.toString(name.toCharArray()));
			
		}
		static boolean search(String str, char target) {
			if(str.length()==0) {
				return false;
			}
			for(int i=0;i<str.length();i++) {
				if(target==str.charAt(i)) {
					return true;
				}
			}
			return false;
		}
}
