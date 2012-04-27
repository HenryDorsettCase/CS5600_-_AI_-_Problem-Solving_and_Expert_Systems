(define (problem problem_ww)(:domain domain_ww)
	
(:objects 
	N S E W - direction
	s1-1 s1-2 
	s2-1 s2-2 - square
)
	
(:init   
	(leftOf N W) (leftOf W S) (leftOf S E) (leftOf E N)
	(rightOf N E) (rightOf E S) (rightOf S W) (rightOf W N)
	
	(adjD s1-1 s1-2 E) (adjD s1-2 s1-1 W)
	(adjD s2-1 s2-2 E) (adjD s2-2 s2-1 W)
	(adjD s1-1 s2-1 N) (adjD s2-1 s1-1 S)
	(adjD s1-2 s2-2 N) (adjD s2-2 s1-2 S)
	
	(at s1-1)
	(facing E)

	(isNotPit	s1-1)
	(isNotPit	s2-1)
	(isNotPit	s2-2)
	(isNotWumpus	s1-1)
	(isNotWumpus	s1-2)
	(isWumpus		s2-1)
	(isNotWumpus	s2-2)
			
	(isGoldLocation s2-2)
)

(:goal (and(has-Gold)))

)
