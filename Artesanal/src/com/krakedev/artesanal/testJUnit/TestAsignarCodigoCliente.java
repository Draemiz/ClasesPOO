package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.krakedev.antesanal.Cliente;
import com.krakedev.antesanal.Negocio;

public class TestAsignarCodigoCliente {

    @Test
    public void asignarCodigo() {

        Negocio barDeMoe = new Negocio();

        Cliente mario = new Cliente("Mario", "123355663");
        Cliente luis = new Cliente("Luis", "123455663");

        barDeMoe.asignarCodigoCliente(mario);
        barDeMoe.asignarCodigoCliente(luis);

        assertEquals(100, mario.getCodigo());
        assertEquals(101, luis.getCodigo());
    }
}
