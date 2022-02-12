/**
 * 
 */
 $(document).ready(function(){
	$('#carousel').elastislide({minItems : 2});
	formValidator("#frmLogin","#btnLoginSend");
	formValidator("#frmSignin","#btnSigninSend");

});

function displayAuth(){
	$('#modalAuth').modal('toggle');
}

function displayInsc(){
	$("#modalInsc").modal('toggle');
}

function inscrire(){
	$.ajax({
		url:'http://localhost:8686/user/inscrire',
		method: 'post',
		data:{
			login: $("#login").val(),
			motdepasse: $("#motdepasse").val(),
			nom: $("#nom").val(),
			rememberme: $("#rememberme").val()
		},
		success:function(data){
			if(data == true){
				$("#modalValidationTitle").html("Inscription");
				$("#modalValidationMsg").html("Bienvenue parmi nous, " + nom);
				$("#modalValidation").modal('toggle');
				setTimeout(function(){
					$("#modalValidation").modal('hide');
					window.location.reload();
				},2000);
			}
			else{
				$("#inscerror").html("Hélas ce compte est déjà utilisé !");
			}
		},
		error:function(error){
			$("#inscerror").html("Problème de connexion au serveur !");	
		}
		
	});
}
	
function connecter(){
$.ajax({
	url:"http://localhost:8686/user/connecter",
	method: "post",
	data: {
		login: $("#username").val(),
		motdepasse: $("#password").val()	
	},
	success:function(data){
			if(data == true){
				$("#modalValidationTitle").html("connexion");
				$("#modalValidationMsg").html("Content de vous revoir " + login);
				$("#modalValidation").modal('toggle');
				setTimeout(function(){
					$("#modalValidation").modal('hide');
					window.location.reload();
				},2000);
			}
			else{
				$("#connerror").html("Login ou mot de passe incorrecte !");
			}
		
	},
	error:function(error){
		$("#connerror").html("Problème de connexion au serveur !");	
	}
});
}

function formValidator(form, submitbtn){
	let inputs = $(form + ">div>input").attr("required","required");

	inputs.on("input",function(){
		let isFormCompleted = true;
		for(let i = 0; i < inputs.length; i++){
			if(! (inputs[i].value))
				isFormCompleted = false;
		}
		if(isFormCompleted == true)
			$(submitbtn).removeAttr("disabled");
		else
			$(submitbtn).attr("disabled","disabled");	
	});
}