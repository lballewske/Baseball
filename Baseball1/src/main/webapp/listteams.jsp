<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<table>
<tr>
<td> teamId
</td>
<td> teamName
</td>
<td> abbreviation
</td>
</tr>
<c:forEach items='${team}' var="teams">
<tr>
<td> ${team.id}
</td>
<td> ${team.name}
</td>
<td> ${team.abbreviation}
</td>
</tr>
</c:forEach>

</table>
</body>
</html>