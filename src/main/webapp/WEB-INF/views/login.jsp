<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <style>
      body {
        background-color: #f4f4f4;
        font-family: Arial, sans-serif;
      }
      .form-container {
        width: 300px;
        margin: 50px auto;
        text-align: center;
        background-color: #ffffff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
      }
      .form-container input[type="text"], .form-container input[type="email"], .form-container input[type="password"] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
        border: 2px solid #ccc;
        border-radius: 4px;
      }
      .form-container input[type="text"]:focus, .form-container input[type="email"]:focus, .form-container input[type="password"]:focus {
        border: 2px solid #4CAF50;
      }
      .form-container button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
        opacity: 0.9;
      }
      .form-container button:hover {
        opacity: 1;
      }
    </style>

  </head>

  <body>
  <div class="form-container">
    <form action="submit_form" method="post">
      <label for="fname">First Name:</label><br>
      <input type="text" id="fname" name="firstName"><br>
      <label for="lname">Last Name:</label><br>
      <input type="text" id="lname" name="lastName"><br>
      <label for="email">Email:</label><br>
      <input type="email" id="email" name="email"><br>
      <label for="pwd">Password:</label><br>
      <input type="password" id="pwd" name="password"><br>
      <button type="submit">Submit</button>
    </form>
  </div>

  </body>
</html>


