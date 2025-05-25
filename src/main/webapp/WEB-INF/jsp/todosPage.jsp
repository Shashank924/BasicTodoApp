<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <title> Todos Page</title>
        <link href = "\webjars\bootstrap\5.3.0\css\bootstrap.min.css" rel = "stylesheet">
    </head>

    <body>

        <nav class = "navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
        <div class = "collapse navbar-collapse">
            <ul class = "navbar-nav">
                <li class = "nav-item"><a class = "nav-link" href = "/">Home</a></li>
                <li class = "nav-item"><a class = "nav-link" href = "/todos-page">Todos</a></li>
            </ul>
        </div>
        <ul class = "navbar-nav">
            <li class = "nav-item"><a class = "nav-link" href = "/logout"> Logout</a></li>
        </ul>
        </nav>

        <div class = "container">
            <h1> Todos </h1>
            <table class = "table">
                <thead>
                    <tr>
                        <th> Description </th>
                        <th> Target Date </th>
                        <th> Done </th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var = "todo" items = "${Todos}">
                        <tr>
                           <th> ${todo.getDescription()} </th>
                           <th> ${todo.getTargetDate()} </th>
                           <th> ${todo.isDone()} </th>
                           <th> <a href = "delete-todo?id=${todo.getId()}" class = "btn btn-warning"> Delete </a> </th>
                           <th> <a href = "update-todo?id=${todo.getId()}" class = "btn btn-success"> Update </a> </th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <a href = "add-todos" class = "btn btn-success"> Add Todos </a>

        </div>
        <script src = "\webjars\bootstrap\5.3.0\js\bootstrap.min.js"></script>
        <script src = "\webjars\jquery\3.6.0\jquery.min.js"></script>
    </body>
</html>