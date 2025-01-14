<%@page language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>Additionneur de nombres</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Additionneur de nombres</h1>
        <form id="additionForm" onsubmit="return addNumbers()">
            <input type="number" id="num1" placeholder="Entrez un nombre" required>
            <input type="number" id="num2" placeholder="Entrez un autre nombre" required>
            <button type="submit">Additionner</button>
        </form>
        <p id="result">Résultat : </p>
    </div>
    <script src="script.js"></script>
</body>
</html>

