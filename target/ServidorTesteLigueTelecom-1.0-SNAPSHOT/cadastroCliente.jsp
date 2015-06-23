<%-- 
    Document   : cadastroCliente
    Created on : 27/07/2014, 16:49:20
    Author     : popovicz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="include/head.jsp" />
    </head>
    <body>

        <jsp:include page="include/menu.jsp" />

         <div id="wrap">
        <div class="container">
            
            <div class="page-header">
                    <h3>Cadastro de Cliente</h3>
                </div>
            
            <form class="form-horizontal" action="rest/cliente/clienteId" method="PUT">

                <fieldset>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-2 control-label" for="ds_origem">ID</label>
                        <div class="col-sm-5">
                            <input id="ds_nome" name="id" type="text" placeholder="id do cliente" class="form-control">
                        </div>
                    </div>
             
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-2 control-label" for="ds_id">Nome</label>
                        <div class="col-sm-5">
                            <input id="ds_nome" name="name" type="text" placeholder="nome do cliente" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                      <div class="form-group">
                        <label class="col-sm-2 control-label" for="ds_destino">email</label>
                        <div class="col-sm-5">
                            <input id="ds_email" name="email" type="text" placeholder="E-mail do cliente" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-2 control-label" for="ds_tempo">RG</label>
                        <div class="col-sm-5">
                            <input id="ds_tempo" name="rg" type="text" placeholder="RG do cliente" class="form-control">

                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-2 control-label" for="ds_custo">CPF</label>
                        <div class="col-sm-5">
                            <input id="ds_custo" name="cpf" type="text" placeholder="CPF do cliente" class="form-control">

                        </div>
                    </div>

                    <!-- Button (Double) -->
                    <div class="form-group">
                        <label class="col-sm-2 control-label" for="btnSAlvar"></label>
                        <div class="col-sm-5">
                            <button type="submit" value="Submit" class="btn btn-success">Salvar</button>
                            <button id="btnCancelar" name="btnCancelar" class="btn btn-danger">Cancelar</button>
                        </div>
                    </div>

                </fieldset>
            </form>

            </div>
        </div>
        <jsp:include page="include/rodape.jsp" />
        <jsp:include page="include/foot.jsp" />
    </body>
</html>
