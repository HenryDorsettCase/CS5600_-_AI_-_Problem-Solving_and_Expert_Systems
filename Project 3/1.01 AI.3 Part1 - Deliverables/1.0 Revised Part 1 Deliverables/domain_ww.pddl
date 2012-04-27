(define (domain domain_ww) (:requirements :strips)
	
	(:types direction square)
	
	(:predicates 
		(facing			?d		- direction)
		(leftOf			?d ?d1	- direction)
		(rightOf		?d ?d1	- direction)
		(adjD			?s1 ?s2 - square ?dir - direction)
		(at				?s - square)
		(isNotPit		?s - square)
		(isWumpus		?s - square)
		(isNotWumpus	?s - square)
		(isGoldLocation	?s - square)
		(has-Gold)
	)

	(:action turn-left
		:parameters 	(?F1 ?F2 - direction)
		:precondition 	(and (facing ?F1)(leftOf ?F1 ?F2) )
		:effect 		(and (facing ?F2)(not (facing ?F1)) )
	)
	
	(:action turn-right
		:parameters 	(?F1 ?F2 - direction)
		:precondition 	(and (facing ?F1)(rightOf ?F1 ?F2) )
		:effect 		(and (facing ?F2)(not (facing ?F1)) )
	)
	
	(:action move
		:parameters 	(?from ?to - square ?dir - direction)
		:precondition (and	(adjD ?from ?to ?dir)
							(isNotPit ?to)
							(at ?from) 
							(facing ?dir) 
							(isNotWumpus ?to) )
		:effect (and (not (at ?from))(at ?to) )
    )
    	
	(:action grab-gold
		:parameters (?where - square)
		:precondition (and	(at ?where) (isGoldLocation ?where) )
		:effect (and (has-Gold) (not (isGoldLocation ?where)) )
    )
    
    (:action shoot
		:parameters	(?where ?where-victim - square ?dir - direction)
		:precondition	(and	(at ?where) (facing ?dir)
								(adjD ?where ?where-victim ?dir)
								(isWumpus ?where-victim) )
		:effect	(and	(not (isWumpus ?where-victim))
						(isNotWumpus ?where-victim) )
    )
)