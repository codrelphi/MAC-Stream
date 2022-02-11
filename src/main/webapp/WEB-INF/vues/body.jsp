<div class="album py-5 bg-light">
	<h2>Tous les films</h2>
	<!-- 
		<div class="col-sm-2" style="background-color: yellow;">
			<ul class="nav flex-column">
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>

		</div> -->
	<div class="row">

		<c:forEach begin="0" end="8" var="film" items="${films}">
			<div class="col-md-4">
				<div class="card mb-4 box-shadow">
					<img class="card-img-top"
						src="https://image.tmdb.org/t/p/w200/${film.imagePath}"
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


