package kr.or.dgit.bigdata.swmng.customer;

import javax.swing.JPanel;

interface RegEditInterface {
	
	void updateAction(int no);
	void refresh(JPanel p);
	boolean inputValidation();
	boolean duplicateValidation(String e);
}
