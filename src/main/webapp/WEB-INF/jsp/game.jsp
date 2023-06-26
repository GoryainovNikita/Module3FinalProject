
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game</title>
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
    <form method="POST" action="http://localhost:8080/game">
        <label>
            <input class="w3-radio" type="radio" name="question" value="1">
            ${choice1}
        </label>
        <br>
        <label>
            <input class="w3-radio" type="radio" name="question" value="2">
            ${choice2}
        </label>
        <br>
        <label>
            <input class="w3-radio" type="radio" name="question" value="3">
            ${choice3}
        </label>
        <br>
        <br>
        <button class="w3-btn w3-border w3-border-light-blue w3-hover-light-blue w3-round-large w3-xlarge" type="submit" id="button">Выбрать</button>
    </form>

</body>
</html>
