<!-- Modal -->
<div class="modal fade" id="modalAuth" tabindex="-1" role="dialog"
	aria-labelledby="authTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<div class="container">
					<div class="row">
						<h5 class="modal-title" id="modalAuthTitle">Authentification</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="row justify-content-md-center">
						<div class="col col-md-auto">
							<span id="connerror" class="text-danger"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-body">
				<div class="row justify-content-md-center">
					<div id="authRetour">
						<form id="frmLogin">
							<div class="form-group">
								<label for="username"><span
									class="glyphicon glyphicon-user"></span> Nom Utilisateur : </label> <input
									type="text" id="username" name="username" required="required"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="psw"><span
									class="glyphicon glyphicon-eye-close"></span> Mot de passe : </label> <input
									type="password" id="password" name="password"
									required="required" class="form-control">
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-success btn-lg"
					id="btnLoginSend" disabled="disabled" onclick="connecter()">Connexion</button>
			</div>
		</div>
	</div>
</div>
<!--page d'authentification de l'application-->
