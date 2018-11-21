package com.company;

import java.io.UnsupportedEncodingException;
import java.security.KeyPair;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws UnsupportedEncodingException {

        KeyPair clave;

        Scanner scanner = new Scanner(System.in);
        String mensaje;
        byte[] encryptText;

        DecryptData decryptData = new DecryptData();
        RandomGenerate randomGenerate = new RandomGenerate();
        EncryptData encryptData = new EncryptData();
        String decryptText;

        System.out.println("Introduce el mensaje a encriptar: ");

        mensaje = scanner.nextLine();

        clave = randomGenerate.randomGenerate(1024);
        encryptText = encryptData.encryptData(mensaje.getBytes(),clave.getPublic());
        // decryptData.decryptData(encryptText,clave.getPrivate());

        decryptText = new String ( decryptData.decryptData(encryptText,clave.getPrivate()),"UTF8");

        System.out.println("El mensaje encriptado es: " + encryptText.toString());
        System.out.println("El mensajo desencriptado es: " + decryptText);





    }
}
