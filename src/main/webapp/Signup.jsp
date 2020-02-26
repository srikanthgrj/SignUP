<html>
<body>

</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="./index.jsp">Idu nande</a>
			</div>
			<ul class="nav navbar-nav">



			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="./index.jsp"><span class="glyphicon "></span>
						Home</a></li>
			</ul>
		</div>
	</nav>
	<div>
		<div class="container">
			<h2>Vertical (basic) form</h2>
			<form action="Signup.do">
				<div class="form-group">
					<label for="username">User name:</label> <input type="text"
						class="form-control" id="username" placeholder="Enter user_name"
						name="username">
				</div>
				<div class="form-group">
					<label for="email">Email:</label> <input type="text"
						class="form-control" id="email" placeholder="Enter email"
						name="email">
				</div>
				<div class="form-group">
					<label for="mobnum">Mobil Number:</label> <input type="text"
						class="form-control" id=""
						mobnum"" placeholder="Enter mobil_number" name=""mobnum"">
				</div>
				<div class="form-group">
					<label for="pwd">Password:</label> <input type="password"
						class="form-control" id="pwd" placeholder="Enter password"
						name="pwd">
				</div>
				<div class="form-group">
					<label for="conpwd">Confirm Password:</label> <input
						type="password" class="form-control" id="conpwd"
						placeholder="Conform password" name="conpwd">
				</div>

				<button type="submit" class="btn btn-default">Sign UP</button>
			</form>
		</div>
	</div>
	
	<div align="center">
    <span style="color:green;font-family:cursive;">${ successmessage}</span>
    <span style="red;font-family:cursive;">${ failuremessage}</span>
    </div>

</body>
</html>
