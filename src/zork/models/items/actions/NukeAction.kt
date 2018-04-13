package zork.models.items.actions

import zork.interfaces.IItemAction
import zork.interfaces.IUserInterface

/**
 * Action for the nuke item. Yep it does what it sounds like it does.
 *
 * @author Daniel Peters
 */
 class NukeAction(private val ui: IUserInterface): IItemAction{
  /**
   * Only players with special names shall survive the ensuing fallout.
   */
  override fun execute (){
    /*when (player.name) {
       "Chuck Norris" -> ui.displayMessage("\nThat nuclear fallout was just your fart. Nothing to worry about.")
       "John Cena" ->ui.displayMessage("\nAnd his name is JOHN CENA, NUKER OF WORLDS!!!")
       "Fallout Guy" ->
      ui.displayMessage("\nAfter years of stasis, you finally wake up in Vault 81.")
      else -> {
        ui.displayMessage("\nYou moron! You obliterated everything!")
        player.die()
      }
    }*/
  }
}
