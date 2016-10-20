package jlppc.regimys.objects.attacks;

import jlppc.regimys.enums.Type;
import jlppc.regimys.fight.EndOfTurn;
import jlppc.regimys.fight.SameAtkPartTwo;
import jlppc.regimys.objects.Attaque;
import jlppc.regimys.objects.Pokemon;

public class Grincement extends Attaque {
	public Grincement() {
		super("Grincement", 0, Type.NORMAL, 85, false, true, -1, false, 40);
	}

	@Override
	protected void effetAvant(Pokemon atk, Pokemon def) throws EndOfTurn, SameAtkPartTwo {
		// TODO Auto-generated method stub

	}

	@Override
	protected void effetApres(Pokemon atk, Pokemon def) throws SameAtkPartTwo {
		if(def.changeDEF(-2)){
			keyout(key("effects.status.def.lowtwo"), def.getSurnom());
		}else{
			keyout(key("effects.status.def.cantlow"), def.getSurnom());
		}

	}
}
