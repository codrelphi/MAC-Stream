
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
<<<<<<< HEAD
						</c:if>
					</div></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">PLAYLIST</a>
				</li>
			</ul>
			<form method="GET" action="<%= request.getContextPath() %>/produits"
				class="form-inline mt-2 mt-md-0">
				<input class="form-control mr-sm-2" type="text" name="search"
					placeholder="Rechercher Titre Film, Série, Acteur..."
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Recherche</button>
			</form>
			<div class="mx-auto" >
				<button type="button" class="btn btn-warning" data-toflle="modal"
					data-target="modalAuthCenter">Mon compte</button>
=======
							</c:if>	
						</div></li>
					<c:if test="${! empty sessionScope.userid}"><li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/playlist">PLAYLIST</a>
					</li></c:if>
				</ul>
				<form method="GET" action="${pageContext.request.contextPath}/rechercher"
					class="form-inline mt-2 mt-md-0">
					<input class="form-control mr-sm-2" type="text" name="search"
						placeholder="Rechercher Titre Film, Série, Acteur..."
						aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Recherche</button>
				</form>
					<button type="button" class="btn btn-warning" data-toggle="modal" data-target="modalAuth" onclick="displayAuth()">Mon compte</button>
					
				<button type="button" class="btn btn-success" onclick="displayAuth()">Connexion</button>
				<button type="button" class="btn btn-secondary" onclick="displayInsc()">Inscription</button>
>>>>>>> b303b7a37d38d8b554a92723ddbd24a0de941e60
			</div>
		</div>
	</nav>

<<<<<<< HEAD
	<%@ include file="formconnexion.jsp"%>
</header>
=======

	</header>
>>>>>>> b303b7a37d38d8b554a92723ddbd24a0de941e60
