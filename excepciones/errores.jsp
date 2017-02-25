
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="java.io.*" %>
<%@ page import="procesarformulario.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de errores.</title>
</head>
<body>

<% String origenError= (String) request.getParameter("pagOrigen"); %>
<p> Ha ocurrido un error en la pagina: <%=origenError %></p>
<p> Descripcion de la excepcion : <%=exception.toString() %> </p>
<p> Descripcion de la excepcion : <%=exception.getClass().getName() %> </p>
<p> mensaje del error: <%=exception.getMessage() %>
<%

interfaceCodigo codigoExcepcion;
String codigoError = "error en el codigo" ;

 try {

 codigoExcepcion = (interfaceCodigo) exception ;
// if (aplicacionExcepcion.getCodigo() != null) {
 codigoError = codigoExcepcion.getCodigo() ;
 out.println(codigoExcepcion.getCodigo());
// aplicacionExcepcion.getCodigo();

if (exception.getCause() == null ) {

out.println("codigo nulo.");

// codigoError =(exception.getCause()).getMessage() ;

 }
// else
// {
// codigoError = "hay causa.";
// }

%>


<p> codigo de error : <%=codigoError %> </p>

<%

}catch (Exception e){
	out.println("Error Indeterminado");
} finally {

}

File file = new File("../standalone/deployments/ApProcesoFormulario.war/WEB-INF/codigo-excep.txt");
RecuperadorPropiedades codigoMensaje = new RecuperadorPropiedades(file);

 %>
 
<p> Al codigo de error le corresponde el mensaje: <%=codigoMensaje.getPropiedad(codigoError) %>  </p> 
 

</body>
</html>
