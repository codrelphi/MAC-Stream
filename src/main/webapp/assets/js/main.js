/**
 * 
 */
 $(document).ready(function(){
	$('#carousel').elastislide({minItems : 2});
});

function displayAuth(){
	$('#modalAuth').modal('toggle');
}

function displayInsc(){
	$('#modalAuth').modal('hide');
	$("#modalInsc").modal('toggle');
}

function inscrire(){
	$.ajax({
		method: 'POST',
		url: 'http://localhost:8686/users/inscrire',
		data:{
			login: $('#login').val(),
			motdepasse: $("#motdepasse").val()
		},
		success: function(result){
			if(result){
				$("#modalAuth").modal('show');
			}
		},
		error: function(){
			alert("erreur de connexion serveur");
		}
	})
}	
function connecter(){
	$.ajax({
		method: 'POST',
		url: 'http://localhost:8686/users/connecter',
		data:{
			login: $("#username").val(),
			motdepasse: $("#password").val()
		},
		success: function(result){
			if(result){
				window.location.reload();
				$("#btnauthsend").attr("hidden","hidden");
				$("#toto").html("<p> Vous êtes connecté !</p>");
				$("#modalAuth").modal('show');
			}
		},
		error: function(){
			alert("erreur de connexion au serveur");
		}
	})
	
}