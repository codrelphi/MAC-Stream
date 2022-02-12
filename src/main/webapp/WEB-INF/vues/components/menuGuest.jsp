<header>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="navbar-brand" href="#">MACStream</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="${pageContext.request.contextPath}/home">ACCUEIL
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
			</ul>
			<form method="GET"
				action="${pageContext.request.contextPath}/rechercher"
				class="form-inline mt-2 mt-md-0">
				<input class="form-control mr-sm-2" type="text" name="search"
					placeholder="Rechercher Titre Film, Série, Acteur..."
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0 mr-1" type="submit">Recherche</button>
			</form>
			<button type="button" class="btn btn-success mr-1" onclick="displayAuth()">Connexion</button>
			<button type="button" class="btn btn-secondary"
				onclick="displayInsc()">Inscription</button>
		</div>
	</nav>
	<%@ include file="formconnexion.jsp"%>
	<%@ include file="forminscription.jsp"%>
	<%@ include file="popupactionvalide.jsp" %>
</header>
