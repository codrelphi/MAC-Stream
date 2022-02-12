<header>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="navbar-brand" href="#">MACStream</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="#">ACCUEIL
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> FILMS </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<c:if test="${! empty genres}">
							<c:forEach var="genre" items="${genres}">
								<a class="dropdown-item" href="#">${genre.genre}</a>
							</c:forEach>
						</c:if>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/playlist">PLAYLIST</a></li>
			</ul>
			<form method="GET"
				action="${pageContext.request.contextPath}/rechercher"
				class="form-inline mt-2 mt-md-0">
				<input class="form-control mr-sm-2" type="text" name="search"
					placeholder="Rechercher Titre Film, Série, Acteur..."
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0 mr-1" type="submit">Recherche</button>
			</form>
			<div class="dropdown">
				<i class=""></i>
  				<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    				Mon compte
  				</button>
  				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    				<a class="dropdown-item" href="${pageContext.request.contextPath}/playlist">Ma Playlist</a>
    				<div class="dropdown-divider"></div>
    				<a class="dropdown-item" href="${pageContext.request.contextPath}/user/deconnecter">Déconnexion</a>
  				</div>
			</div>
		</div>
	</nav>
</header>