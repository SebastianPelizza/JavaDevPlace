package com.example;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.example.Clase3.Enchufe;

public class EnchufeTest {

    @Test
    void Testeando(){
        Enchufe e1= new Enchufe(3, "blanco");
        System.out.println(e1.getPatas());
        assertNotEquals(e1, null);
    }
}
