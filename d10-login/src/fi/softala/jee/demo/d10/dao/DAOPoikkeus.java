package fi.softala.jee.demo.d10.dao;

public class DAOPoikkeus extends Exception {

	public DAOPoikkeus() {
		super("Tietokantapoikkeus");
	}

	public DAOPoikkeus(String viesti) {
		super(viesti);
	}

	public DAOPoikkeus(Throwable aiheuttaja) {
		super(aiheuttaja);
	}

	public DAOPoikkeus(String viesti, Throwable aiheuttaja) {
		super(viesti, aiheuttaja);
	}

}