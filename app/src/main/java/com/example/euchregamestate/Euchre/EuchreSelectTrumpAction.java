package com.example.euchregamestate.Euchre;

import com.example.euchregamestate.GameFramework.GamePlayer;
import com.example.euchregamestate.GameFramework.actionMessage.GameAction;

/**
 * @author Sierra, Mikey, Haley, and Alex
 */
public class EuchreSelectTrumpAction extends GameAction {
    private static final long serialVersionUID = -2242980258970485343L;
    private Card.SUIT suit;
    public EuchreSelectTrumpAction(GamePlayer player, Card.SUIT suitSelected){
        super(player);
        suit = suitSelected;
    }
    public Card.SUIT getSuitToPlay()
    {
        return suit;
    }
}
