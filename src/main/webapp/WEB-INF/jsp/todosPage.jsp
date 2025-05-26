<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>

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
<%@ include file = "common/footer.jspf" %>