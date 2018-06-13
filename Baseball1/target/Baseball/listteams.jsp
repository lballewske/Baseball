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
<c:forEach items='${teams}' var="team">
<tr>
<td> ${team.teamId}
</td>
<td> ${team.teamName}
</td>
<td> ${team.abbreviation}
</td>
</tr>
</c:forEach>

</table>
</body>
</html>