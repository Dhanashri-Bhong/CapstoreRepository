package com.capgemini.capstore.dao;

import java.util.List;

import com.capgemini.capstore.beans.FeedbackBean;
import com.capgemini.capstore.beans.LoginBean;
import com.capgemini.capstore.beans.OrderBean;
import com.capgemini.capstore.beans.OrderStatusBean;
import com.capgemini.capstore.beans.PermanentMerchantBean;
import com.capgemini.capstore.beans.ProductBean;
import com.capgemini.capstore.beans.ProductFeedbackBean;
import com.capgemini.capstore.beans.TemporaryCustomerBean;
import com.capgemini.capstore.beans.TemporaryMerchantBean;


public interface CapstoreDAO {

    public boolean addThirdMerchant(PermanentMerchantBean permanentMerchantBean);
	
	public boolean deleteMerchant(String Email);
	
	public List<FeedbackBean> viewFeedback();
	
	public List<OrderBean> viewPlaceOrder();
	
	public List<OrderStatusBean> viewCancelledOrder();
	
	public List<PermanentMerchantBean> viewVerifiedMerchant();
	
	public List<TemporaryMerchantBean> ViewMerchantListToVerify();
	
	public List<TemporaryCustomerBean> ViewCustomerListToVerify();
	
	public List<LoginBean> viewVerifiedCustomer();
	
	public List<ProductBean> viewProduct();
	
	public boolean register(TemporaryMerchantBean temporaryMerchantBean);
	
	public boolean merchantVerification(String email);
	
	public boolean customerVerification(String email);
	
	public List<ProductFeedbackBean> getProductFeedback(int productId);
	
	public List<ProductBean> getProductListByBrandName(String brandName);
	
	public double getAverageRating(int productId);

}
