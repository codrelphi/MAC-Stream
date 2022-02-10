<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Application de streaming</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>

<body>

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
							<a class="dropdown-item" href="#">TOUS LES FILMS </a> <a
								class="dropdown-item" href="#">ACTION</a> <a
								class="dropdown-item" href="#">AVENTURE</a> <a
								class="dropdown-item" href="#">DRAME</a> <a
								class="dropdown-item" href="#">FANTASTIQUE</a> <a
								class="dropdown-item" href="#">HISTOIRE</a> <a
								class="dropdown-item" href="#">GUERRE</a>
						</div></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> SERIES </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">TOUTES LES SERIES </a> <a
								class="dropdown-item" href="#">ACTION</a> <a
								class="dropdown-item" href="#">AVENTURE</a> <a
								class="dropdown-item" href="#">DRAME</a> <a
								class="dropdown-item" href="#">FANTASTIQUE</a> <a
								class="dropdown-item" href="#">HISTOIRE</a> <a
								class="dropdown-item" href="#">GUERRE</a>
						</div></li>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> ANIMES </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">TOUS LES ANIMES </a> <a
								class="dropdown-item" href="#">ACTION</a> <a
								class="dropdown-item" href="#">AVENTURE</a> <a
								class="dropdown-item" href="#">DRAME</a> <a
								class="dropdown-item" href="#">FANTASTIQUE</a> <a
								class="dropdown-item" href="#">HISTOIRE</a> <a
								class="dropdown-item" href="#">GUERRE</a>
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



				<button type="button" class="btn btn-warning">Mon compte</button>

			</div>

		</nav>

		<!--page d'authentification de l'application-->
		<h2 style="text-align: center">
			<span class="glyphicon glyphicon-lock"></span> Authentification
		</h2>

		<!--formulaire d'authentification-->
		<div class="container mt-5">
			<div class="row justify-content-md-center">
				<div class="col-md-4">
					<form>
						<div class="form-group">
							<label for="username"><span
								class="glyphicon glyphicon-user"></span> Nom Utilisateur : </label> <input
								type="text" name="username" class="form-control"
								[(ngModel)]="user.username">
						</div>
						<div class="form-group">
							<label for="psw"><span
								class="glyphicon glyphicon-eye-close"></span> Mot de passe : </label> <input
								type="password" name="password" [(ngModel)]="user.password"
								class="form-control">
						</div>
						<div class="row justify-content-md-center">
							<button type="btn btn-default btn-lg" (click)="login()"
								class="btn btn-success btn-lg">Connexion</button>
						</div>
						<div class="">
							<button type="btn btn-default btn-lg" (click)="login()"
								class="btn btn">Inscription</button>
						</div>


					</form>

					<!--formulaire d'inscription-->
					<h2 style="text-align: center">
						<span class="glyphicon glyphicon-lock"></span> formulaire
						d'inscription
					</h2>

					<form>
						<div class="form-group">
							<label for="exampleInputEmail1">Email address</label> <input
								type="email" class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" placeholder="Enter email">
							<small id="emailHelp" class="form-text text-muted">We'll
								never share your email with anyone else.</small>
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Mot de passe</label> <input
								type="password" class="form-control" id="exampleInputPassword1"
								placeholder="Password">
						</div>
						<div class="form-group form-check">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck1"> <label class="form-check-label"
								for="exampleCheck1">Se rappeler de moi</label>
						</div>
						<button type="submit" class="btn btn-primary">S'inscrire</button>
					</form>

				</div>

			</div>
		</div>

	</header>

</body>
</html>
