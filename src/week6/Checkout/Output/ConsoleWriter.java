/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.Checkout.Output;

import assignment1.*;

/**
 *
 * @author jerem
 */
public class ConsoleWriter implements Writer {

    @Override
    public void outputMessage(String message) {

        System.out.println(message);

    }

}
