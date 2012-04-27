(define (domain domain_ww) (:requirements :strips)
	
	(:types direction square thing person)
	
	(:predicates 
		(facing			?d		- direction)
		(leftOf			?d ?d1	- direction)
		(rightOf		?d ?d1	- direction)
		(adjD			?s1 ?s2 - square ?dir - direction)
		(isPit			?square - square)
		(isNotPit		?square - square)
		(at				?what	- thing ?square - square)
		(atPerson		?what	- person ?square - square)
		(isWumpus		?square - square)
		(isNotWumpus	?square - square)
		(isGold			?square - square)
		(hasGold		?who	- person)
		(notHasGold		?who	- person)
	)

	(:action turn-left
		:parameters 	(?F1 ?F2 - direction)
		:precondition 	(and (facing ?F1)(leftOf ?F1 ?F2))
		:effect 		(and (facing ?F2)(not (facing ?F1)))
	)
	
	(:action turn-right
		:parameters 	(?F1 ?F2 - direction)
		:precondition 	(and (facing ?F1)(rightOf ?F1 ?F2))
		:effect 		(and (facing ?F2)(not (facing ?F1)))
	)
	
	(:action move
		:parameters (	?who - person 
						?from - square 
						?to - square 
						?dir - direction )
		:precondition (and	(adjD ?from ?to ?dir)
							(isNotPit ?to)
							(atPerson ?who ?from) 
							(facing ?dir) 
							(isNotWumpus ?to) )
		:effect (and (not (atPerson ?who ?from))(atPerson ?who ?to))
    )
    	
	(:action grab-gold
		:parameters (?who - person ?where - square)
		:precondition (and	(atPerson ?who ?where)
							(isGoldLocation ?where)
							(notHasGold ?who) )
		:effect (and	(not (isGold ?where))
						(not (notHasGold ?who))
						(has-Gold ?who) )
    )
    
    (:action shoot
		:parameters	(?who - person 
					 ?where - square 
					 ?victim - thing 
					 ?where-victim - square
					 ?dir - direction )
		:precondition	(and	(at ?victim ?where-victim)
								(atPerson ?who ?where)
								(facing ?dir)
								(adjD ?where ?where-victim ?dir)
								(isWumpus ?where-victim) )
		:effect	(and	(not (at ?victim ?where-victim))
						(not (isWumpus ?where-victim))
						(isNotWumpus ?where-victim) )
    )
)