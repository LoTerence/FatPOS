/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middle_end;

/**
 * <!-- begin-user-doc -->
 * Class to hold a menu item, a menu item consists of a name, cost, and preparation time.
 * <!--  end-user-doc  -->
 * @generated
 */

public class MenuItem
{
	/**
	 * <!-- begin-user-doc -->
	 * Name of the food item.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String itemName;

	/**
	 * <!-- begin-user-doc -->
	 * Cost of the item.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int itemPrice;

	/**
	 * <!-- begin-user-doc -->
	 * How long it takes to prepare the dish.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int itemPrepTime;

        /**
	 * <!-- begin-user-doc -->
	 * How many times the item was ordered.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int orderCount;
        
	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a MenuItem object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MenuItem(){
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a MenuItem object, and will initialize the data fields.
	 * <!--  end-user-doc  -->
     * @param itemName The name of the item.
     * @param itemPrice The cost of the item.
     * @param itemPrepTime The prep time of the item.
	 * @generated
	 */
	public MenuItem(String itemName, int itemPrice, int itemPrepTime){
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemPrepTime = itemPrepTime;
                this.orderCount = 1;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Retrieve the name of the item.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getItemName() {
		return this.itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Retrieve the item price.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getItemPrice() {
		return this.itemPrice;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Retrieve the item preparation time.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getItemPrepTime() {
		return this.itemPrepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assign the name of the item based on the String argument
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assign the cost of the item based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assign the preparation time of the item based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setItemPrepTime(int itemPrepTime) {
		this.itemPrepTime = itemPrepTime;
	}

        /**
	 * <!-- begin-user-doc -->
	 * Returns the number of times a dish was ordered.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
        
        public int getOrderCount()
        {
            return this.orderCount;
        }

}