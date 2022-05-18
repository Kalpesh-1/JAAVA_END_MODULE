package Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class inv {

	public static void main(String[] args) {

		ArrayList<Item> itemlist = new ArrayList<Item>();
		Scanner sc = new Scanner(System.in);
		
		itemlist.add(new Item(3, "item1"));
		itemlist.add(new Item(4, "item2"));
		itemlist.add(new Item(5, "item3"));
		int choice=0;
		do
		{
			System.out.println("Enter choice: \n"
					+ "1: Add item to the list.\n"
					+ "2: Display items from list.\n"
					+ "3: Remove item from list.\n"
					+ "4: Exit.\n");
			choice = sc.nextInt();
			if(choice == 4)
			{
				break;
			}
			switch (choice)
			{
			case 1:
			{
				System.out.println(" Enter itemID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter item name: ");
				String name = sc.nextLine();

				Item obj = new Item(id, name);
				if(itemlist.contains(obj))
				{
					System.out.println("This item is already present in list...");
				}
				else
				{
					itemlist.add(obj);
				}
				System.out.println("nxt op");
				break;		
			}
			case 2:
			{
				for(Item i1 : itemlist)
				{
					System.out.println(i1);
				}
				System.out.println("nxt op");
				break;
			}
			case 3:
			{
				sc.nextLine();
				System.out.println("Enter item name to remove from list: ");
				String name = sc.nextLine();
				for(int i = 0;i<itemlist.size();i++)
				{
					if(itemlist.get(i).getItemName().equals(name))
					{
						itemlist.remove(i);
						System.out.println("Done");
						break;
					}
				}
				System.out.println("nxt op");
				break;
			}
			default : 
			{
				System.out.println("Enter valid choice..");
				break;
			}
			}
		}while(choice != 4); e
		sc.close();
	}
}
