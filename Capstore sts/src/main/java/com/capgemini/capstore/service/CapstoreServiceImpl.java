package com.capgemini.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.FeedbackBean;
import com.capgemini.capstore.beans.LoginBean;
import com.capgemini.capstore.beans.OrderBean;
import com.capgemini.capstore.beans.OrderStatusBean;
import com.capgemini.capstore.beans.PermanentMerchantBean;
import com.capgemini.capstore.beans.ProductBean;
import com.capgemini.capstore.beans.ProductFeedbackBean;
import com.capgemini.capstore.beans.TemporaryCustomerBean;
import com.capgemini.capstore.beans.TemporaryMerchantBean;
import com.capgemini.capstore.customexception.CapstoreException;
import com.capgemini.capstore.dao.CapstoreDAO;

@Service
public class CapstoreServiceImpl implements CapstoreService {

	@Autowired
	private CapstoreDAO dao;

	@Override
	public boolean addThirdMerchant(PermanentMerchantBean permanentMerchantBean) {
		try {
			return dao.addThirdMerchant(permanentMerchantBean);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean deleteMerchant(String Email) {
		try {
			return dao.deleteMerchant(Email);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<FeedbackBean> viewFeedback() {
		try {
			return dao.viewFeedback();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<OrderBean> viewPlaceOrder() {
		try {
			return dao.viewPlaceOrder();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<OrderStatusBean> viewCancelledOrder() {
		try {
			return dao.viewCancelledOrder();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<PermanentMerchantBean> viewVerifiedMerchant() {
		try {
			return dao.viewVerifiedMerchant();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<TemporaryMerchantBean> ViewMerchantListToVerify() {
		try {
			return dao.ViewMerchantListToVerify();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<TemporaryCustomerBean> ViewCustomerListToVerify() {
		try {
			return dao.ViewCustomerListToVerify();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<LoginBean> viewVerifiedCustomer() {
		try {
			return dao.viewVerifiedCustomer();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<ProductBean> viewProduct() {
		try {
			return dao.viewProduct();
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public boolean register(TemporaryMerchantBean temporaryMerchantBean) {
		try {
			return dao.register(temporaryMerchantBean);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean merchantVerification(String email) {
		try {
			return dao.merchantVerification(email);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean customerVerification(String email) {
		try {
			return dao.customerVerification(email);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return false;
	}
	
	@Override
	public List<ProductFeedbackBean> getProductFeedback(int productId) {
		return dao.getProductFeedback(productId);
	}
	
	@Override
	public List<ProductBean> getProductListByBrandName(String brandName) {
		try {
			return dao.getProductListByBrandName(brandName);
		} catch (CapstoreException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}
	
	@Override
	public double getAverageRating(int productId) {
		return dao.getAverageRating(productId);
	}
	
	
}