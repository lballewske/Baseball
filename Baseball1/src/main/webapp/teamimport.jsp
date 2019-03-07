<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: lauren.ballewske
  Date: 2018-12-18
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<stripes:url beanclass="com.lauren.web.stripes.TeamImportActionBean" event="doImport" var="doTeamImport">
</stripes:url>
<stripes:url beanclass="com.lauren.web.stripes.PlayerImportActionBean" event="doImport" var="doPlayerImport"></stripes:url>


<head>
    <script src="static/JS/jquery-3.3.1.min.js"></script>
    <title>Team Import</title>
</head>
<body>
<script type="text/javascript">
    function sendImportRequest(url) {
        jQuery.ajax({
            url: url,
            type: "GET",
            success: function(data) {
                alert('Success');
            },
            failure: function(data) {
                alert('Failed');
            }
        });
    }
</script>
<button type="button" onclick="sendImportRequest('${doTeamImport}');">Team Import</button>
<br/>
<button type="button" onclick="sendImportRequest('${doPlayerImport}');">Player Import</button>


</body>
</html>
