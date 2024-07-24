package set;

import java.util.Scanner;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				while (true) {

					Set<Integer> ob = null;
					String nm = "";
					System.out.println("Enter your choice : ");
					System.out.println("1.HashSet<E>" + "\n2.LinkedHashSet<E>" + "\n3.TreeSet" + "\n4.Exit");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						ob = new HashSet<Integer>();
						nm = "HashSet";
						break;
					case 2:
						ob = new LinkedHashSet<Integer>();
						nm = "LinkedHashSet";
						break;
					case 3:
						ob = new TreeSet<Integer>();
						nm = "TreeSet";
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.out.println("Please enter vaild key");

						continue;
					}

					System.out.println("Enter perfrom opertion on " + nm);
					xyz: while (true) {
						System.out.println("Enter your choice : ");
						System.out.println("1.add()" + "\n2.Remove(object)" +"\n3.removeAll()" +"\n4.Exit");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("Enter the Element");
							ob.add(sc.nextInt());
							System.out.println(ob);
							break;
						case 2:
							if (ob.isEmpty()) {
								System.out.println(nm + " is empty");
							} else {
								System.out.println("Enter the Element to be remove ");
								Integer el = sc.nextInt();
								if (ob.remove(el)) {
									System.out.println(el + " is removed");
									System.out.println(ob);
								} else {
									System.out.println("Element not available");
								}
							}
							break;
						case 3:
							if(ob.isEmpty()) {
								System.out.println(nm+" is empty");
							}
							else {
								System.out.println("All Elements are removed"+ob.removeAll(ob));
							}
							break;
						case 4:
							System.out.println("Operation stop on " + nm);
							break xyz;

						default:
							System.out.println("Inavild choice");

						}

					}

				}
			} catch (Exception e) {
             e.printStackTrace();
			}
		}

	}
}
