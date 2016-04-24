/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_editor;

public class Category
{
	/**
	 * <!-- begin-user-doc -->
	 * List of items that belong to a category.
	 * In this case a category could be breakfast,
	 * and itemList could contain eggs, toast, and bacon.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public MenuItem itemList[];

	/**
	 * <!-- begin-user-doc -->
	 * The name of the category, such as breakfast.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String categoryName;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a Category object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Category(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the category name.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getCategoryName() {
		return this.categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assigns the category name based on the String argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Initialize the item list to the number of items specified by the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void initializeItems(int numItems) {
		this.itemList = new MenuItem[numItems];
                for(int i = 0; i < itemList.length; i++)
                {
                    itemList[i] = new MenuItem("", 0, 0);
                }
	}

}