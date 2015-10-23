<%--
  Created by IntelliJ IDEA.
  User: rashakol
  Date: 21.10.2015
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>

  <link rel="stylesheet" href="/resources/css/social.css"  />
</head>
<body>

<div class="social-container">

  <div>
    <span>Facebook: </span>
    <span>${socialInfo.fbProfile}</span>
  </div>
  <div>
    <span>G-Plus: </span>
    <span>${socialInfo.gplusProfile}</span>
  </div>
  <div>
    <span>Linkedin: </span>
    <span>${socialInfo.linkedinProfile}</span>
  </div>
  <div>
    <span>Instagram: </span>
    <span>${socialInfo.instagramProfile}</span>
  </div>


</div>
<br>
<a href="/" >Bio</a>
<a href="/forms" >Forms</a>

</body>
</html>
