<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        <title> Todos Page</title>
        <link href = "\webjars\bootstrap\5.3.0\css\bootstrap.min.css" rel = "stylesheet">
    </head>

    <body>

        <div class = "container">
            <h1> Todos </h1>
            <table class = "table">
                <thead>
                    <tr>
                        <th> Id </th>
                        <th> Description </th>
                        <th> Target Date </th>
                        <th> Done </th>
                        <th></th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var = "todo" items = "${Todos}">
                        <tr>
                           <th> ${todo.getId()} </th>
                           <th> ${todo.getDescription()} </th>
                           <th> ${todo.getLocalDate()} </th>
                           <th> ${todo.isDone()} </th>
                           <th> <a href = "delete-todo?id=${todo.getId()}" class = "btn btn-warning"> Delete </a> </th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <a href = "add-todos" class = "btn btn-success"> Add Todos </a>

        </div>
    </body>
    <script src = "\webjars\bootstrap\5.3.0\js\bootstrap.min.js"></script>
    <script src = "\webjars\jquery\3.6.0\jquery.min.js"></script>
</html>