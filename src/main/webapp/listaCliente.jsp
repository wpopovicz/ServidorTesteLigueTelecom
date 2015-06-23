<%-- 
    Document   : ListaCliente
    Created on : 14/06/2015, 22:08:59
    Author     : popovicz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="include/head.jsp" />
        <title>Lista de cliente</title>
    </head>
    <body>        
        <jsp:include page="include/menu.jsp" />
        <div id="wrap">
            <div class="container">
                <form class="form-horizontal" action="rest/cliente" method="GET">
                    <div class="col-sm-5">
                        <button type="submit" value="Submit" class="btn btn-success">Listar todos</button>                   
                    </div>
                </form>
            </div>
            <div class="container">
                <form class="form-horizontal" action="rest/cliente/nome" method="GET">
                    <div class="col-sm-5">
                        <p><label class="form-horizontal">Name:</label><input id="name" type="text" name="name" value=""></p>
                        <button type="submit" value="Submit" class="btn btn-info">Listar por nome</button>                   
                    </div>
                </form>
            </div>
            <div class="container">
                <form class="form-horizontal" action="rest/cliente/id/" method="GET">
                    <div class="col-sm-5">
                        <p><label class="form-horizontal">ID:</label><input id="id" type="text" name="id" value=""></p>
                        <button type="submit" value="Submit" class="btn btn-warning">Listar por id</button>                   
                    </div>
                </form>
            </div>            
        </div>
        <jsp:include page="include/rodape.jsp" />
        <jsp:include page="include/foot.jsp" />
    </body>
</html>
