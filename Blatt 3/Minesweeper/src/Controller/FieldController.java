package Controller;

import Model.GameBoard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Controller for one {@link GameBoard.Field} instance of a {@link GameBoard}.
 * Will propagate events to the corresponding {@link GameBoard.Field}.
 *
 * @author Mathias Menninghaus (mathias.menninghaus@uos.de)
 */
public class FieldController extends MouseAdapter {

   private GameBoard.Field model;

   public FieldController(GameBoard.Field model) {
      this.model = model;
   }

   /**
    * Will compute events on the corresponding {@code GameView.FieldButton}. A
    * left click will reveal the field ({@link GameBoard.Field#reveal()}), a
    * right click will toggle the flag of the field (
    * {@link GameBoard.Field#toggleFlagSet()}).
    */
   @Override
   public void mouseClicked(MouseEvent e) {

      switch (e.getButton()) {
         case MouseEvent.BUTTON1:
            model.reveal();
            break;
         case MouseEvent.BUTTON3:
            model.toggleFlagSet();
            break;
         default:
            break;
      }
   }
}
