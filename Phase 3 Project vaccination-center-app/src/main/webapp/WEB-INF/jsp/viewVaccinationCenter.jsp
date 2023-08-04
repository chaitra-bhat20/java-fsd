<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>            <!--taglib directive for <forEach> tag  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  <!-- this taglib for "form:form" tags  -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="com.example.demo.entity.pacUser" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Vacination Center</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8"><br>
		   <table class="table table-bordered table-striped table-hover">
		         <thead style="text-decoration:underline">
		         	<th><a href="/citizens">Citizens</a></th>
		         	<th><a href="/vaccinationcenter">Vaccination Centers</a></th>
		         	<th><a href="/login"> Logout</a></th>
		         	<%-- <th>Welcome, ${user.name}</th> --%>
		         	<th>Welcome, <%= ((pacUser) session.getAttribute("user")).getName() %></th>
		         </thead>
					<tr>

					</tr>                                
		  </table>
		
		</div>
		<div class="col-md-2"></div>
	</div>
<!-- 	<div class="jumbotron">
		<h1 class="text-center">View Vacination Center</h1>
	</div> -->
	   <h2 style="text-align:center">Center Information</h2>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
		   <table class="table table-bordered table-striped table-hover">					
			<tbody>
		        <tr>
            		<td colspan="2" style="text-align:center"> <h3>${viewVaccinationCenter.name}</h3></td>
        		</tr>
        		<tr>
            		<th>ID</th>
            		<td>${viewVaccinationCenter.id}</td>
        		</tr>
        		<tr>
            		<th>City</th>
            		<td>${viewVaccinationCenter.city}</td>
        		</tr>        		        		
    		</tbody>                                
		  </table>
		
		</div>
		<div class="col-md-2"></div>
	</div>
	   <h2 style="text-align:center"> All citizens of the center</h2>
		<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
		   <table class="table table-bordered table-striped table-hover">
		   		<thead>
		         	<th>ID</th>
		         	<th>Name</th>
		         	<th>Action</th>
		         	<th></th>
		        </thead>
		   		<tbody>
					<tr>
						<td> ${citizensCenter.id}</td>
						<td>${citizensCenter.name}</td>
						<td><a href="/viewCitizen?cid=${citizensCenter.id}">View</a></td>						
					</tr>
				</tbody>	                                 
		  </table>
		</div>
		<div class="col-md-2"></div>
	</div>
</body>
</html>