<%@ include file="components/header.jsp"%>
<body>
	<%@ include file="components/menu.jsp" %>
	<main>
		<%@ include file="components/carousel.jsp"%>
	</main>
	
<table border="0">
	<tr> 

		<td width="30%" style="vertical-align: bottom;  text-align: left; margin-left: 0">
			<a href="https://image.tmdb.org/t/p/w500/${film.getPosterPath()}"> <img alt="Qries" class="mx-auto d-block img-thumbnail " src="https://image.tmdb.org/t/p/w500/${film.getPosterPath()}"></a>
		</td>
		<td width="2%"></td>
		<td width="20%" style="vertical-align: top;  text-align: left; margin-left: 0em; margin-left: 0">
				<h5 class="card-title font-weight-bold">${film.getTitre()}</h5>
				<h5 class="text-secondary">Titre original : ${film.getTitreOriginal()}</h5>
				
				<span class="text-info">Résumé :</span>
				<p class="card-text">${film.getResume()}</p>
				<span class="text-info">Année de réalisation : </span>
				<small class="card-text">${film.getAnneeRealisation()}</small>
		</td>
		<td width="4%">
		
		</td>
		<td width="5%"  style="vertical-align: top;  text-align: left; margin-left: 0em; margin-left: 0; justify-content: center;">
				<form id="addPLform">
				<a style="width: 100%"
					href="${pageContext.request.contextPath}/playList/add?idFilm=${film.idFilm}&idUser=1"
					type="button" id="bth-addPL" class="btn  btn-sm btn-success">Ajouter
					à la playlist</a><br></br>
					
				<a style="width: 100%"
					href="${pageContext.request.contextPath}/playList/delete?idFilm=${film.idFilm}&idUser=1"
					type="button" id="bth-deletePL" class="btn btn-danger btn-sm">Supprimer de la playlist</a>
					<!-- <button type="button" class="btn btn-secondary btn-sm">Ajouter à la playlist</button> 
					<button onclick="window.location.href = 'href="${pageContext.request.contextPath}/playList/add?idFilm=${film.idFilm}&idUser=1';">Cliquez Ici</button>
					-->
			</form>
		</td>
		<td width="19%"></td>
		<td width="20%" style="vertical-align: top;  text-align: left; margin-left: 0em; margin-left: 0">
			
			<ul class="list-group list-group-flush">
			  <li class="list-group-item"><h5 class="text-info">La cote de popularité :</h5></li>
			  <li class="list-group-item">${film.popularite}</li>
			</ul>
			<ul class="list-group list-group-flush">
			  <li class="list-group-item"><h5 class="text-info">Votes :</h5></li>
			  <li class="list-group-item">Moyenne  : ${film.moyenneVotes}</li>
			  <li class="list-group-item">Décompte : ${film.decompteVote}</li>
			</ul>
			
		</td>
	</tr>

</table>	
	<!-- 
	<div class="card-group ">
		<div class="card">
		</div>
		<div class="card bg-secondary">
			<a href="https://image.tmdb.org/t/p/w500/${film.getPosterPath()}">
				<img alt="Qries" class="mx-auto d-block img-thumbnail "
				src="https://image.tmdb.org/t/p/w500/${film.getPosterPath()}">
			</a>
			<div class="card-body">
				<h5 class="card-title">${film.getTitre()}</h5>
				<p class="card-text">${film.getResume()}</p>
			</div>
			<div class="card-footer">
				<small class="card-text">${film.getAnneeRealisation()}</small>
			</div>
			<form id="addPLform">
				<a 
					href="${pageContext.request.contextPath}/playList/add?idFilm=${film.idFilm}&idUser=1"
					type="button" id="bth-addPL" class="btn btn-secondary btn-sm">Ajouter
					à la playlist</a>
			</form>

		</div>

		<div class="card"></div>

	</div>-->
	<!--  	<div id="resultat"></div>
   <script>
  	 $(document).ready(function () {

	    $("#addPLform").submit(function (event) {

	        //stop submit the form, we will post it manually.
	        event.preventDefault();

	        fire_ajax_submit();

	    });

	});

  	function fire_ajax_submit() {

  		 alert('Bienvenue');
  	    var search = {}
  	 

  	    $("#bth-addPL").prop("disabled", true);

  	    $.ajax({
  	        type: "GET",
  	        contentType: "application/json",
  	        url: "/film/10",
  	        data: JSON.stringify(search),
  	        dataType: 'json',
  	        cache: false,
  	        timeout: 600000,
  	      success : function(result) {
				$("#resultat").html(result);
			},
			error : function() {
				$("#resultat").html(failMsg);
			}
  	    });

  	}
	</script>-->




	<%@ include file="components/footer_accueil.jsp"%>
</body>
</html>

