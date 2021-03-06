/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middle_end;

/**
 * <!-- begin-user-doc -->
 * Class that allows wait staff to edit a menu. This involves adding and removing items and categories.
 * <!--  end-user-doc  -->
 * @generated
 */

public class MenuEditor
{
	/**
	 * <!-- begin-user-doc -->
	 * The actual menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Menu menu;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a MenuEditor object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MenuEditor(){
		super();
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * Add a category to the menu.
	 * <!--  end-user-doc  -->
     * @param categoryName Th name of the category to be added.
	 * @generated
	 * @ordered
	 */
	
	public void addCategory(String categoryName) {
		if(menu.categoryArray == null)
		{
			menu.initializeCategories(10);
			menu.categoryArray[0].setCategoryName(categoryName);
			menu.categoryArray[0].initializeItems(10);
		}
		else
		{
			for(int i = 0; i < menu.categoryArray.length; i++)
			{
				if(menu.categoryArray[i] == null)
				{
					menu.categoryArray[i] = new Category();
					menu.categoryArray[i].setCategoryName(categoryName);
					menu.categoryArray[i].initializeItems(10);
				}
				break;
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Remove a category from the menu.
	 * <!--  end-user-doc  -->
     * @param categoryName The name of the category to be removed.
	 * @generated
	 * @ordered
	 */
	
	public void removeCategory(String categoryName) {
		for(int i = 0; i < menu.categoryArray.length; i++)
		{
			if(menu.categoryArray[i].categoryName.equals(categoryName))
			{
				for(int j = i + 1; j < menu.categoryArray[i].itemList.length; j++)
				{
					menu.categoryArray[i] = menu.categoryArray[j];
					i++;
				}
				break;	
			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Add an item to a category in the menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
    /**
     * <!-- begin-user-doc -->
 Add an item to a category in the menu.<!--  end-user-doc  -->
     * @param categoryName The name of the category to be added.
     * @param itemName The name of the item, which belongs to the category
     * @param itemPrice The cost of the item.
     * @param itemPrepTime Amount of time it takes to prepare the food item.
     * @generated
     * @ordered
     */
    public void addItem(String categoryName, String itemName, int itemPrice, int itemPrepTime) {
        for (Category categoryArray : menu.categoryArray) {
            if (categoryArray.categoryName.equals(categoryName)) {
                for (int j = 0; j < categoryArray.itemList.length; j++) {
                    if (categoryArray.itemList[j] == null) {
                        categoryArray.itemList[j] = new MenuItem(itemName, itemPrice, itemPrepTime);
                        break;
                    }
                }
                break;
            }
        }
    }
	
	/**
	 * <!-- begin-user-doc -->
	 * Remove an item from a category.
	 * <!--  end-user-doc  -->
     * @param itemName
        * the name of the item you want to remove
     * @param categoryName
	 * the name of the category of the item you want to remove
	 */
	
	public void removeItem(String itemName, String categoryName) {
            int i;
		for(i = 0; i < menu.categoryArray.length; i++)
		{
			if(menu.categoryArray[i].categoryName.equals(categoryName))
			{
				break;		
			}
		}
		for(int j = 0; j < menu.categoryArray[i].itemList.length; j++)
		{
			if(menu.categoryArray[i].itemList[j].getItemName().equals(itemName))
			{
				for(int k = j + 1; k < menu.categoryArray[i].itemList.length; k++)
				{
					menu.categoryArray[i].itemList[j] = menu.categoryArray[i].itemList[k];
					j++;
				}
				break;	
			}
		}
	}
	

}