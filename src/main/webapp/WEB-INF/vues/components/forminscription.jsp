<!-- Modal -->
<div class="modal fade" id="modalInsc" tabindex="-1" role="dialog"
	aria-labelledby="inscTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<div class="container">
					<div class="row">
						<h5 class="modal-title" id="modalInscTitle">Inscription</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="row justify-content-md-center">
						<div class="col col-md-auto">
							<span id="inscerror" class="text-danger"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-body">
				<div class="row justify-content-md-center">
					<form id="frmSignin">
						<div class="form-group">
							<label for="email">Adresse courriel</label> <input type="email"
								class="form-control" id="email" aria-describedby="emailHelp"
								placeholder="Enter email" required="required"> <small
								id="emailHelp" class="form-text text-muted">Nous ne
								partagerons pas cette adresse.</small>
						</div>
						<div class="form-group">
							<label for="login">Nom de compte</label> <input type="text"
								id="login" aria-describedby="nomHelp" required="required"
								placeholder="Entrez votre nom de compte" class="form-control">
							<small id="nomHelp" class="form-text text-muted">Ceci est
								votre login</small>
						</div>
						<div class="form-group">
							<label for="motdepasse">Mot de passe</label> <input
								type="password" class="form-control" id="motdepasse"
								required="required" placeholder="Password"><small
								id="passwordHelp" class="form-text text-muted">Ne le
								communiquez à personne</small>
						</div>
						<div class="form-group form-check">
							<input type="checkbox" class="form-check-input" id="rememberme">
							<label class="form-check-label" for="rememberme">Se
								rappeler de moi</label>
						</div>
						<button type="button" id="btnSigninSend" class="btn btn-primary"
							disabled="disabled" onclick="inscrire()">S'inscrire</button>
					</form>
				</div>
			</div>
			<div class="modal-footer"></div>
		</div>
	</div>
</div>

