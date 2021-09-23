<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
    </div>
    <div class="col">
      <form>
  <div class="mb-3">
    <label for="exampleInputNom1" class="form-label">Nom</label>
    <input type="text" class="form-control" name="nom" id="exampleInputNom1" aria-describedby="NomHelp">
  </div>
    <div class="mb-3">
    <label for="exampleInputNom1" class="form-label">Prenom</label>
    <input type="text" name="prenom" class="form-control" id="exampleInputNom1" >
  </div>
  <div class="mb-3">
    <label for="exampleadresse" class="form-label">Adresse</label>
    <textarea class="form-control" name="adresse" id="exampleadresse"></textarea>
  </div>
   <div class="mb-3">
    <label for="exam	pleInputNom1" class="form-label">Téléphone</label>
    <input type="text" class="form-control" name="telephone" id="exampleInputNom1" >
  </div>
   <div class="mb-3">
    <label for="exampleInputNom1" class="form-label">Id parent</label>
    <input type="number" class="form-control" id="parent" >
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </div>
    <div class="col">
      
    </div>
  </div>
</div>

</body>
</html>