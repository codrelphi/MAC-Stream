package fr.macstream.ap.clienthttp;

public class SessionUser {

		private int userId;
		private String login;
		private String nom;
		private String prenom;
		private boolean connected;
		private String cookies;
		public SessionUser() {
			super();
		}

		public SessionUser(int userId, String login, String nom, String prenom, boolean connected, String cookies) {
			super();
			this.userId = userId;
			this.login = login;
			this.nom = nom;
			this.prenom = prenom;
			this.connected = connected;
			this.cookies = cookies;
		}

		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		
		
		public String getLogin() {
			return login;
		}


		public void setLogin(String login) {
			this.login = login;
		}


		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public boolean isConnected() {
			return connected; 
		}
		public void setConnected(boolean connected) {
			this.connected = connected;
		}

		public String getCookies() {
			return cookies;
		}

		public void setCookies(String cookies) {
			this.cookies = cookies;
		}
}
