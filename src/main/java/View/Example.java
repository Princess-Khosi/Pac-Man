package View;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
/*
 * Notes!!
 *
 * Privacy mode stores away the screen content to show the current private view.
 * After exiting the private window, the previous screen content comes back.
 * usage: terminal.enterPrivateMode() ... .exitPrivateMode()
 *
 * We can set cursor position using setCursor(colNum, rowNum) and to specify the appropriate values,
 * we can extract the screen size using getTerminalSize()
 * */
public class Example {
    public static void main(String[] args) throws IOException {

        Terminal terminal = new DefaultTerminalFactory().createTerminal();

        TerminalSize screenSize = terminal.getTerminalSize();

        terminal.setCursorPosition(screenSize.getColumns() - 2, screenSize.getRows());

//        terminal.;

    }
}
