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
<td> ${team.externalId}
</td>
<td> ${team.name} ${team.nickname}
</td>
<td> ${team.abbreviation}
</td>
</tr>
</c:forEach>

</table>
</body>
</html>