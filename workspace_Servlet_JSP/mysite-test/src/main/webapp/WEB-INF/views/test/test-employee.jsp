<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test-employee</title>

<style>
  table {
    width: 30%;
    border: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
</style>
</head>
<body>
<button type="button" onclick="loadTable()">employee 이름 출력</button>
<p id="hidden" style="display:none;">${name }</p>
<p id="demo"></p>

<script>
function loadTable(){
	var txt="";
	var myObj = JSON.parse('${name}');
    txt += "<table border='1'>"
    for (x in myObj["name"]) {
      txt += "<tr><td>" + myObj["name"][x].last_name + "</td><td>"+myObj["name"][x].first_name+"</td></tr>";
    }
    txt += "</table>"    
    document.getElementById("demo").innerHTML = txt;
};
</script>

</body>
</html>