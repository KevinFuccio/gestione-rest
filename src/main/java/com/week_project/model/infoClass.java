package com.week_project.model;



public class infoClass {

	private String title;
	private String info1;
	private String info2;
	private String info3;
	private String info4;
	private String error;
	
	
	public infoClass(String lang) {

		if(lang.contains("it")) {
			this.title ="Benvenuto!";
			this.info1="Segui queste regole per prenotare";
			this.info2="Puoi avere piu prenotazioni ma non puoi prenotare piu di una prenotazione al giorno!";
			this.info3="metti una data valida!";
			this.info4="diveriti!";
		}else if(lang.contains("en")){
			this.title ="Welcome!";
			this.info1="Follow those rules for booking";
			this.info2="You can have multiple booking but you can only book one a day!";
			this.info3="Put a valid booking date!";
			this.info4="Have fun!";
		}else {
			this.setError("Language not supported");
		}
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getInfo1() {
		return info1;
	}


	public void setInfo1(String info1) {
		this.info1 = info1;
	}


	public String getInfo2() {
		return info2;
	}


	public void setInfo2(String info2) {
		this.info2 = info2;
	}


	public String getInfo3() {
		return info3;
	}


	public void setInfo3(String info3) {
		this.info3 = info3;
	}


	public String getInfo4() {
		return info4;
	}


	public void setInfo4(String info4) {
		this.info4 = info4;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}
}
