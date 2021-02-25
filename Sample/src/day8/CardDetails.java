package day8;

import java.io.Serializable;

public class CardDetails implements Serializable{
	


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		// TODO Auto-generated method stub
		private long cardno;
		public long getCardno() {
			return cardno;
		}
		public void setCardno(long cardno) {
			this.cardno = cardno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getExpmon() {
			return expmon;
		}
		public void setExpmon(int expmon) {
			this.expmon = expmon;
		}
		public int getExpyear() {
			return expyear;
		}
		public void setExpyear(int expyear) {
			this.expyear = expyear;
		}
		private String name;
		private int expmon;
		private int  expyear;
		private int cvv;
		public CardDetails() {
			
		}
		public CardDetails(long cardno,String name,int expmon,int expyear,int cvv) {
			this.cardno=cardno;
			this.name=name;
			this.expmon=expmon;
			this.expyear=expyear;
			this.setCvv(cvv);
			
		
		

	}
		public int getCvv() {
			return cvv;
		}
		public void setCvv(int cvv) {
			this.cvv = cvv;
		}

}
