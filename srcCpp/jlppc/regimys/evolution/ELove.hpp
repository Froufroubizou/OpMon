
#ifndef SRCCPP_JLPPC_REGIMYS_EVOLUTION_ELOVE_HPP_
#define SRCCPP_JLPPC_REGIMYS_EVOLUTION_ELOVE_HPP_

#include "Evolution.hpp"

class E_Love: public Evolution {
public:
	E_Love(int evo) : Evolution(evo){}
	bool checkEvolve(Pokemon toCheck){return (toCheck.getStatLove() > 100);}
private:

};

#endif /* SRCCPP_JLPPC_REGIMYS_EVOLUTION_ELOVE_HPP_ */
