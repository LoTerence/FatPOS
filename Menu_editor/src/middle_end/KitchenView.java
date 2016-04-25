/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middle_end;
import javax.swing.*;
/**
 * <!-- begin-user-doc -->
 * Receives orders and displays them, removes the orders once they are finished.
 * <!--  end-user-doc  -->
 * @generated
 */

public class KitchenView
{
	/**
	 * <!-- begin-user-doc -->
	 * A list of orders, when an order is placed, it is added to the list.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private NewOrder orderList[];
        public JList orderJList1;
        public JList orderJList2;
        public JList orderJList3;
        public JList orderJList4;
        public JList orderJList5;
	/**
	 * <!-- begin-user-doc -->
	 * Constructor to initialize KitchenView's order list.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public KitchenView(){
		super();
		orderList = new NewOrder[5];
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add an order to a list. if the list capacity has been reached, dynamically create a new array.
	 * <!--  end-user-doc  -->
     * @param newOrder
	 * @generated
	 * @ordered
	 */
	
	public void addOrder(NewOrder newOrder) {
		if(this.orderList[orderList.length-1] == null)
		{
			for(int i = 0; i < this.orderList.length; i++)
			{
				if(orderList[i] == null)
				{
					this.orderList[i] = newOrder;
					break;
				}
			}
		}
		else
		{
                    int i;
                    NewOrder[] newList = new NewOrder[this.orderList.length * 2];
                    for(i = 0; i < this.orderList.length; i++)
                    {
			newList[i] = this.orderList[i];
                    }
                    newList[i] = newOrder;
                    this.orderList = newList;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes an order from the order list.
	 * <!--  end-user-doc  -->
     * @param order
	 * @generated
	 * @ordered
	 */
	
	public void removeOrder(NewOrder order) {
		for(int i = 0; i < orderList.length; i++)
		{
			if(orderList[i] == order)
			{
				for(int j = i + 1; j < orderList.length; j++)
				{
					orderList[i] = orderList[j];
				}
				break;
			}
		}
	}
        
        /**
	 * <!-- begin-user-doc -->
	 * Add an order to a JList component for the order list.
	 * <!--  end-user-doc  -->
     * @param orderModel
	 * @generated
	 * @ordered
	 */
        public void addOrderList(DefaultListModel orderModel)
        {
            
        }
}