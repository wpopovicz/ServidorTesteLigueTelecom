/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligueTelecom.service;

import br.com.ligueTelecom.Bean.Cliente;
import br.com.ligueTelecom.model.Dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author popovicz
 */
@Path("/cliente")
public class cliente {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    /**
     *
     * @return
     */
    @GET
    @Produces("application/json")
    public List<Cliente> getClientes() {
        ArrayList<Cliente> lista = new ArrayList<Cliente>(new Dao<Cliente>(Cliente.class).listaNova());
        return lista;
//        return new Cliente(1, "wil", "robinho", "carlos", "carloko");
    }

    /**
     *
     * @param id
     * @return
     */
    @Path("/id/{id}")
    @GET
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public Cliente getClienteId(@PathParam("id") int id) {
        System.out.println(id);
        return new Cliente(1, "Robson", "robinho@gmail.com", "313213", "2123123");
        //return new ArrayList<Cliente>(new Dao<Cliente>(Cliente.class).listaPorId(id));
    }

    /**
     *
     * @param name
     * @return
     */
    @Path("/nome")
    @GET
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Cliente> getClienteName(@PathParam("name") String name) {
        System.out.println(name);
        return new ArrayList<Cliente>(new Dao<Cliente>(Cliente.class).listaPorNome(name));
    }

    /**
     *
     * @param name
     * @param email
     * @param rg
     * @param cpf
     * @param servletResponse
     * @throws IOException
     */
    @POST
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public void adicionarCliente(@FormParam("name") String name,
            @FormParam("email") String email,
            @FormParam("rg") String rg,
            @FormParam("cpf") String cpf,
            @Context HttpServletResponse servletResponse) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setName(name);
        cliente.setEmail(email);
        cliente.setRg(rg);
        cliente.setCpf(cpf);

        new Dao<Cliente>(Cliente.class).adiciona(cliente);
    }

    @PUT
    @Consumes("application/json")
    public Response createUser(Cliente cliente) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        System.out.println(cliente.getId());
        System.out.println(cliente.getName());
        return Response.ok().build();
    }
    @DELETE
    public Response delete(@QueryParam("clienteId") int id) {
        //int id_cliente = Long.valueOf(id);
        // new Dao<Cliente>(Cliente.class).removePorId(id_cliente);
        if (id > clientes.size()) {
            throw new WebApplicationException(404);
        }

        clientes.remove(id - 1);
        return Response.ok().build();
    }

}
