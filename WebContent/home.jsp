<%@ page import= "java.util.Date" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<br>
  <div class="row">
  <%! int i=9;String name=""; %>
  <%out.println("Hello Vivek !!! How are you?"+i);
  	name = (String)application.getAttribute("name");
  %>
  
  <%= i %>
  <%= name %>
  <%= (new Date()) %>
    <form action="/test" method="post">
    <input type="text" name="name">
    <button type="submit">Submit</button>
    </form>
  </div>
</div>

</body>
</html>
