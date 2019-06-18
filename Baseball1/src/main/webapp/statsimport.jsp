<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: lauren.ballewske
  Date: 2019-06-17
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<stripes:url beanclass="com.lauren.web.stripes.StatsImportActionBean" event="doImport" var="doStatsImport"></stripes:url>

<head>
    <script src="static/JS/jquery-3.3.1.min.js"></script>
    <title>Stats Import</title>

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
<button type="button" onclick="sendImportRequest('${doStatsImport}');">Stats Import</button>
</body>
</html>
