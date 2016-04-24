/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_editor;

public class Menu
{
	/**
	 * <!-- begin-user-doc -->
	 * A list of categories, Each category holds a list of items.
	 * A category for this software would be like 
	 * breakfast, lunch, dinner, etc..
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Category categoryArray[];

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a Category object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Menu(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
     * @param numCategories Initialize the categories to the amount of categories
     * specified by numCategories
	 * @generated
	 * @ordered
	 */
	
	public void initializeCategories(int numCategories) {
		this.categoryArray = new Category[numCategories];
                for(int i = 0; i < categoryArray.length; i++)
                {
                    categoryArray[i] = new Category();
                    categoryArray[i].setCategoryName("");
                    categoryArray[i].initializeItems(numCategories);
                }
	}

}