<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Conference Registration</title>
</head>
<body>

<div class="container mt-5">
    <h2>Conference Registration</h2>
    <form action="registerServlet" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
       
          <div class="form-group">
            <label for="phone">Mobile phone :</label>
            <input type="text" class="form-control" id="phone" name="phone" required>
        </div>
            <div class="form-group">
            <label for="age">age :</label>
            <input type="number" class="form-control" id="age" name="age" required>
        </div>
       

        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>

</body>
</html>
