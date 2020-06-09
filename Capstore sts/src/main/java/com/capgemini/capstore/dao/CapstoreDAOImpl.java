package com.capgemini.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

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

@Repository
public class CapstoreDAOImpl implements CapstoreDAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean addThirdMerchant(PermanentMerchantBean permanentMerchantBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			entityTransaction.begin();
			entityManager.persist(permanentMerchantBean);
			entityTransaction.commit();
			isAdded = true;

		} catch (Exception e) {
			throw new CapstoreException("Merchant Already Exists..");
		}
		entityManager.close();

		return isAdded;
	}

	@Override
	public boolean register(TemporaryMerchantBean temporaryMerchantBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		boolean isAdded = false;
		try {
			entityTransaction.begin();
			entityManager.persist(temporaryMerchantBean);
			entityTransaction.commit();
			isAdded = true;

		} catch (Exception e) {
			throw new CapstoreException("Merchant Already Exists..");
		}
		entityManager.close();

		return isAdded;
	}

	@Override
	public boolean deleteMerchant(String Email) {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			PermanentMerchantBean permanentMerchantBean = entityManager.find(PermanentMerchantBean.class, Email);
			entityManager.remove(permanentMerchantBean);
			entityTransaction.commit();
			isDeleted = true;

		} catch (Exception e) {
			throw new CapstoreException("Merchant cannot be deleted..");
		}
		entityManager.close();
		return isDeleted;
	}

	@Override
	public List<FeedbackBean> viewFeedback() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from FeedbackBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<FeedbackBean> feedbackList = null;
			feedbackList = query.getResultList();
			entityTransaction.commit();
			return feedbackList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Feedback list not found..");
		}

	}

	@Override
	public List<OrderBean> viewPlaceOrder() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from OrderBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<OrderBean> orderList = null;
			orderList = query.getResultList();
			entityTransaction.commit();
			return orderList;
		} catch (Exception e) {
			e.printStackTrace();
			// throw new CapstoreException("Something went wrong... Order list not
			// found..");
		}
		return null;
	}

	@Override
	public List<OrderStatusBean> viewCancelledOrder() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from OrderStatusBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<OrderStatusBean> cancelList = null;
			cancelList = query.getResultList();
			entityTransaction.commit();
			return cancelList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Cancelled list not found..");
		}
	}

	@Override
	public List<PermanentMerchantBean> viewVerifiedMerchant() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from PermanentMerchantBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<PermanentMerchantBean> verifiedMerchantList = null;
			verifiedMerchantList = query.getResultList();
			entityTransaction.commit();
			return verifiedMerchantList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Verified merchant list not found..");
		}
	}

	@Override
	public List<TemporaryMerchantBean> ViewMerchantListToVerify() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from TemporaryMerchantBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<TemporaryMerchantBean> temporaryMerchantList = null;
			temporaryMerchantList = query.getResultList();
			entityTransaction.commit();
			return temporaryMerchantList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Temporary merchant list not found..");
		}
	}

	@Override
	public List<TemporaryCustomerBean> ViewCustomerListToVerify() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from TemporaryCustomerBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<TemporaryCustomerBean> temporaryCustomerList = null;
			temporaryCustomerList = query.getResultList();
			entityTransaction.commit();
			return temporaryCustomerList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Temporary customer list not found..");
		}
	}

	@Override
	public List<LoginBean> viewVerifiedCustomer() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from LoginBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<LoginBean> verifiedCustomerList = null;
			verifiedCustomerList = query.getResultList();
			entityTransaction.commit();
			return verifiedCustomerList;
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong... Verified customer list not found..");
		}
	}

	@Override
	public List<ProductBean> viewProduct() {
		entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "from ProductBean";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			List<ProductBean> productList = null;
			productList = query.getResultList();
			entityTransaction.commit();
			return productList;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CapstoreException("Something went wrong... Product list not found..");
		}
	}

	@Override
	public boolean merchantVerification(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isAdded = false;
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "insert into PermanentMerchantBean(email,name,password,brandName,address,phoneNumber,role) select o.email, o.name, o.password, o.brandName, o.address, o.phoneNumber, o.role from TemporaryMerchantBean o where email=: email";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			query.setParameter("email", email);
			int i = query.executeUpdate();
			entityTransaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public boolean customerVerification(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("capstorePersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		boolean isAdded = false;
		try {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			String jpql = "insert into LoginBean(email,name,password,phoneNumber,role) select o.email, o.name, o.password, o.phoneNumber o.role from TemporaryCustomerBean o where email=: email";
			entityTransaction.begin();
			Query query = entityManager.createQuery(jpql);
			query.setParameter("email", email);
			int i = query.executeUpdate();
			entityTransaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdded;
	}

	public List<ProductFeedbackBean> getProductFeedback(int productId) {

		List<ProductFeedbackBean> productFeedbackList = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductFeedbackBean where productId=:productId";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("productId", productId);
		try {
			productFeedbackList = query.getResultList();
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong...products feedback not found");
		}
		return productFeedbackList;
	}

	@Override
	public List<ProductBean> getProductListByBrandName(String brandName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<ProductBean> productList = null;
		try {

			String jpql = "from ProductBean where brandName=:brandName";
			Query query = entityManager.createQuery(jpql);
			// String brandName = hotelInformationBean.getLicenceNumber();
			query.setParameter("brandName", brandName);

			productList = query.getResultList();

			return productList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public double getAverageRating(int productId) {
		double averageRating = 0.0;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select avg(rating) from ProductFeedbackBean where productId=:productId";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("productId", productId);
		try {
			averageRating = (double) query.getSingleResult();
		} catch (Exception e) {
			throw new CapstoreException("Something went wrong...");
		}
		return averageRating;
	}
}