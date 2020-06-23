package com.capgemini.set1andset2;

public class CardNo {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading card");
	}
	
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking card");
	}
	public static void main(String[] args) {
		CardNo card = new CardNo();
		int cardNo = 12344;
		//card.readCard(cardNo); compilation error
		card.checkCard(cardNo);
	}
}
