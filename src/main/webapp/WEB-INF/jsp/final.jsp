
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        .text{
            text-indent : 0px;
        }
    </style>
</head>
<body>
<p class="text">${text}</p>
<br>
<p class="text">Кол-во попыток: ${attempts}</p>
<br>
<button class="w3-btn w3-border w3-border-light-blue w3-hover-light-blue w3-round-large w3-xlarge" onclick="location.href='/game'">Играть снова</button>
</body>
</html>
