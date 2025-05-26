<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<div class = "container">
    <h3> Update Todos </h3>

    <form:form method = "post" modelAttribute = "todo">

        <fieldset class = "mb-1">
            <form:label path = "description"> Description </form:label>
            <form:input type = "text" path = "description"/>
        </fieldset>


        <fieldset class = "mb-3">
            <form:label path = "targetDate"> Target Date </form:label>
            <form:input type = "text" path = "targetDate"/>
        </fieldset>

        <form:input type = "hidden" path = "id"/>

        <form:input type = "hidden" path = "done"/>

        <input type = "submit"/ class = "btn btn-success">

    </form:form>

</div>

<%@ include file = "common/footer.jspf" %>

<script type = "text/javascript">
$('#targetDate').datepicker({
    format : 'yyyy-mm-dd'
    });
</script>