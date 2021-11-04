/** These two import java.io and java.util so
 * that the built in hash map methods can be 
 * used and the scanner and file readers can
 * be used.
 * 
 */
import java.io.*;
import java.util.*;

/** This class has two methods that create a hashmap
 * and print out its contents (keys and values) and
 * a search class that searches for a specific word
 * in the hash map and prints the key, value, and
 * its hash code.
 * 
 * @author morganhardin
 *
 */
public class HashMap_List
{
	/** This creates a new instance of the hash map class
	 * with strings as the objects. This allows the keys
	 * and values to be of type string. It also means that
	 * list will hold the values and the methods in the
	 * hash map class can be called and used in this class.
	 * 
	 */
	private HashMap<String, String> list = new HashMap<String, String>();
	
	/** This void scan method uses a try catch block to read
	 * the keys and values text files. If the files can be read, 
	 * then they will be added to the hash map list and looped
	 * through so the contents of list will be printed. If the
	 * files are unreadable, it is caught and file not found
	 * will be printed.
	 * 
	 */
	@SuppressWarnings("resource")
	void scan()
	{
		try
		{
			FileReader keyFile = new FileReader("Keys.txt");
			FileReader valueFile = new FileReader("Values.txt");
			Scanner scan = new Scanner(keyFile);
			Scanner scan2 = new Scanner(valueFile);
				
			while (scan.hasNextLine() && scan2.hasNextLine())
			{
				list.put(scan.nextLine(), scan2.nextLine());
			}
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("File Not Found.");
		}
		int index = 1;
		for (String i : list.keySet())
		{
			System.out.println(index + ") Hash Code: " + i.hashCode() + " --> " + i + ": " + list.get(i));
			index = index + 1;
		}
	}
	
	/** This void search method takes the int parameter
	 * hashCode. It uses a for loop to loop through the
	 * hash map list and proceeds to check to see if the
	 * parameter equals the current key value hashCode.
	 * If it does, then the hash code, key, and value will
	 * be printed. If not, then it will loop to the next
	 * key and will continue until the parameter hash code
	 * equals the current key's hash code or until all of
	 * the hash codes have be compared.
	 * 
	 * @param word
	 */
	void search(int hashCode)
	{
		for (String i : list.keySet()) 
		{
			if (hashCode == i.hashCode())
			{
				System.out.println("HashCode: " + i.hashCode() + " --> " + i + ": " + list.get(i));
			}
		}
	}
}
