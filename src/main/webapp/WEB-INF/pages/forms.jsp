<%@ page import="com.jazzcript.assign.models.ResumeInfo" %>
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


  <link  rel="stylesheet" type="text/css" href="/resources/css/forms.css" />

  <script src="/resources/js/formValidators.js"  >
  </script>

</head>
<body >
<h3>${allInfo["message"]}</h3>

<div>
<form id="socialForm" action="/forms/saveSocial" method="post" class="social-form" onsubmit="return checkSocialInput()" >
  <h2> Social Media Accounts</h2>
  <input type="text" name="fbProfile" placeholder="enter facebook profile" value="${allInfo["socialInfo"].fbProfile}">
  <input type="text" name="gplusProfile" placeholder="enter g+ profile" value="${allInfo["socialInfo"].gplusProfile}">
  <input type="text" name="linkedinProfile" placeholder="enter linkedin profile" value="${allInfo["socialInfo"].linkedinProfile}">
  <input type="text" name="instagramProfile" placeholder="enter instagram profile" value="${allInfo["socialInfo"].instagramProfile}">

  <input type="submit" value="Save" />
</form>
</div>
<div>
<form action="/forms/saveResume" method="post" class="resume-form">
<h2>Resume Information</h2>
   <div class="formItem">
     <span>Skills:</span>
  <textarea name="skills" placeholder="enter your skills"   >${allInfo["resumeInfo"].skills}</textarea>

   </div>
  <div class="formItem">
    <span>Skills:</span>
  <textarea  name="experiences" placeholder="enter your experiences" >${allInfo["resumeInfo"].experiences}</textarea>
    </div>
  <div class="formItem">
    <span>Skills:</span>
  <input type="text" name="education" placeholder="enter  education" value="${allInfo["resumeInfo"].education}">
    </div>

  <div class="formItem">
    <span>Skills:</span>
  <textarea type="text" name="additional" placeholder="enter additional info" >${allInfo["resumeInfo"].additional}</textarea>
</div>

  <input type="submit" value="Save" />
</form>

</div>
<br>
<a href="/" >Bio</a>
<a href="/social" >Social</a>

</body>
</html>
