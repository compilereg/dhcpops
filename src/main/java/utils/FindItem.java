package utils;

import java.util.List;


/* 
 * Static method, that accept any list, and a string and search for the string.
 * Return true if the string is found in the list, otherwise return false 
 */
public class FindItem {
	
	public static <T extends IGetName> boolean elementExist(List<T> list, String name) {
		boolean result = false;
			for ( T m : list) {
				if ( m.getName().equals(name)) {
					result = true;
					break;
				}	
			}
		return result;	
	}
	
	public static <T extends IGetName> int getLocation(List<T> list,String name) {
		int result = -1 ;
	
		for ( int i = 0 ; i <  list.size() ; i++ )
			if ( list.get(i).getName().equals(name)) {
				result = i;
				break;
			}
		return result;
	}
}
