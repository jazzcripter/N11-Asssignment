<%--
  Created by IntelliJ IDEA.
  User: rashakol
  Date: 21.10.2015
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Biography and Resume</title>

  <link rel="stylesheet" href="/resources/css/bio.css" />
</head>
<body>

<div class="bio-container">
  <img src="" />

  <img src="/resources/images/foto.jpg" width="180px" height="auto">

  <h3>Emre Bilir</h3>
  
</div>

<div class="resume-container">

  <div>
  <span>Skills: </span>
  <span>${resumeInfo.skills}</span>
  </div>
  <div>
  <span>Experiences: </span>
  <span>${resumeInfo.experiences}</span>
  </div>
  <div>
  <span>Education: </span>
  <span>${resumeInfo.education}</span>
  </div>
  <div>
  <span>Additional: </span>
  <span>${resumeInfo.additional}</span>
  </div>


</div>

<a href="/social" >Social</a>
<a href="/forms" >Forms</a>

</body>
</html>
