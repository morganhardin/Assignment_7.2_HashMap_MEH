/** This class calls the HashMap_List class
 * by instantiating a new instance of the class
 * so that its methods can be called and used
 * to create a hash map and search words in the
 * hash map.
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	/** This void method creates a new instance of
	 * the HashMap_List class and prints out
	 * the full hash map and searches for 5 words
	 * that are stored in the map. It also prints
	 * out that words value and its hash code.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		HashMap_List hashMap = new HashMap_List();
		System.out.println("Hash Map List: ");
		hashMap.scan();
		System.out.println("\nSearched Words: ");
		hashMap.search(976071245);
		hashMap.search(-85241559);
		hashMap.search(3381085);
		hashMap.search(3852);
		hashMap.search(3642027);
	}
}
