/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 * The Invoker class.
 *
 * Clase que instancia las órdenes ( Command ). Puede instanciarlas directamente
 * o dejar que el CommandManager lo haga.
 *
 * @author edu
 */
public class Switch {

    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }

}
