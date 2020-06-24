<%@ page import="com.gfi.Programa" %>

<jsp:scriptlet>
    int a=Integer.parseInt(request.getParameter("numero1"));
    int b=Integer.parseInt(request.getParameter("numero2"));
    int resultado=Programa.suma(a,b);
</jsp:scriptlet>
<jsp:expression>resultado</jsp:expression>