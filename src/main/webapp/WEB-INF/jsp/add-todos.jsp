<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

    <head>
        <title> Add Todos </title>
        <link href = "\webjars\bootstrap\5.3.0\css\bootstrap.min.css" rel = "stylesheet">
    </head>

    <body>

        <div class = "container">

            <form:form method = "post" modelAttribute = "todo">

                Description : <form:input type = "text" path = "description"/>
                                <form:input type = "hidden" path = "id"/>
                                <form:input type = "hidden" path = "done"/>
                <input type = "submit"/>

            </form:form>

        </div>
    </body>
    <script src = "\webjars\bootstrap\5.3.0\js\bootstrap.min.js"></script>
    <script src = "\webjars\jquery\3.6.0\jquery.min.js"></script>
</html>