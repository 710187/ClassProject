<%-- 
    Document   : index
    Created on : Apr 3, 2019, 5:12:29 PM
    Author     : 710187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <h1>Student Information</h1>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <form action="response.jsp">
        <!--<strong>Select a Subject:</strong>-->
    </form>
    <body>
<h2>Welcome to <strong>Student Database</strong>
</h2>
       
<tr>
<form action="response.jsp">
      <table>
            <tr>
                <td>Student ID</td>
                <td><input type="text" name="StudentId" value="${Student.StudentId}"/></td>
            </tr>
        </table>
            

<!--<strong>Select a subject:</strong>
<select name="subject_id">
<option></option>
</select>-->
<br>
<input type="submit" value="submit" name="submit" />

</form>
</td>
</tr>
</tbody>
</table>
</body>
</html>
