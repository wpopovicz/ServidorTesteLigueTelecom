<%@page import="br.utfpr.edu.br.bean.Quarto"%>
<%@page import="br.utfpr.edu.br.conexao.Dao"%>
<%@page import="java.util.List"%>
<%@page import="br.utfpr.edu.br.bean.Cliente"%>
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
                    <h3>Cadastro de Reserva</h3>
                </div>

                <form class="form-horizontal" action="rest/reserva" method="POST">

                    <fieldset>

                        <h4>Cliente</h4>
                        <select class="form-control" name="id_cliente">  
                            <%
                                List<Cliente> list = new Dao<Cliente>(Cliente.class).listaTodos();
                                Cliente cid;
                                for (Object obj : list) {
                                    cid = (Cliente) obj;
                                    out.println("<option value=" + cid.getId() + ">" + cid.getNome() + "</option>");
                                }
                            %>   
                        </select> 

                        <h4>Quarto</h4>
                        <select class="form-control " name="id_quarto">  
                            <%
                                List<Quarto> list1 = new Dao<Quarto>(Quarto.class).listaTodos();
                                Quarto quarto;
                                for (Object obj : list1) {
                                    quarto = (Quarto) obj;
                                    out.println("<option value=" + quarto.getId() + ">" + quarto.getNome()+ " - " + quarto.getCusto()+ "</option>");
                                }
                            %>   
                        </select> 

                        <h4>Data</h4>
                        <input type="date" id="data" name="data" />


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
