<div class="album py-5 bg-light">
<div class="container">
	<h2>Tous les films</h2>
	<div class="row">		
		<c:forEach begin="0" end="8" var="film" items="${films}">
			<div class="col-md-4">
				<div class="card mb-4 box-shadow">
					<img class="card-img-top"
						src="https://image.tmdb.org/t/p/w500/${film.imagePath}"
						alt="Card image cap">
					<div class="card-body">
						<p class="card-text">${film.titre }</p>
						<div class="d-flex justify-content-between align-items-center">
							<div class="btn-group">
								<button type="button" class="btn btn-success">Ajouter +</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</div>	
</div>