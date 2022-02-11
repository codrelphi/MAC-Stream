<!-- Modal -->
<div class="modal fade" id="modalInsc" tabindex="-1" role="dialog"
	aria-labelledby="inscTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modalInscTitle">Inscription</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
			<div class="row justify-content-md-center">
			<div>
				<form>
					<div class="form-group">
						<label for="login">Email address</label> <input
							type="email" class="form-control" id="login"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">Nous ne
							partagerons pas cette adresse.</small>
					</div>
					<div class="form-group">
						<label for="motdepasse">Mot de passe</label> <input
							type="password" class="form-control" id="motdepasse"
							placeholder="Password">
					</div>
					<div class="form-group form-check">
						<input type="checkbox" class="form-check-input" id="exampleCheck1">
						<label class="form-check-label" for="exampleCheck1">Se rappeler de moi</label>
					</div>
					<button type="button" class="btn btn-primary" onclick="inscrire()">S'inscrire</button>
				</form>
			</div>
		</div>
		</div>
		<div class="modal-footer">
<!-- 			<button type="button" class="btn btn-primary"
				data-dissmis="modal">Fermer</button>
			<button type="button" class="btn btn-success btn-lg"
				onclick="inscrire()">S'inscrire</button>
-->				
		</div>
	</div>
</div>

