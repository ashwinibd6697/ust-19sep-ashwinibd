<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope ="request"></jsp:useBean>
<body>
<a href="./home">Home</a><a style="float :right" href="./logout">logout</a>
<h4><%=msg %></h4>
<fieldset>
<legend>Change password</legend>
<form action="./change" method = "post">
   <table>
  <tr>
  <td>new     : </td>
  <td><input name ="new" type="password"> </td>
  </tr>
  <tr>
  <td>confirm : </td>
      <td><input name ="changepassword" type ="password" ></td>
      </tr>      
    <tr>
    <td></td>
  <td><input type ="submit" value ="change"> 
</tr>   
  
     </table>
    </form>
    </fieldset>
</body>
</html>