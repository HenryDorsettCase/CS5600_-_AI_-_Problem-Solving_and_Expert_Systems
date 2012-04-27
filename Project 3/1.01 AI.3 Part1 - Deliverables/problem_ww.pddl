(define (problem problem_ww)(:domain domain_ww)
	
	(:objects 
		N S E W - direction
		1-1 1-2 
		2-1 2-2 - square
		agent - person
		wumpus - thing
	)
	
	(:init   
		(leftOf N W)
		(leftOf W S)
		(leftOf S E)
		(leftOf E N)
		
		(rightOf N E)
		(rightOf E S)
		(rightOf S W)
		(rightOf W N)
		
		(adjD 1-1 1-2 E) (adjD 1-2 1-1 W)
		(adjD 2-1 2-2 E) (adjD 2-2 2-1 W)
		(adjD 1-1 2-1 N) (adjD 2-1 1-1 S)
		(adjD 1-2 2-2 N) (adjD 2-2 1-2 S)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;World 1 - solvable
;		(isNotPit	1-1)
;		(isNotPit	1-2)
;		(isNotPit	2-1)
;		(isNotPit	2-2)
;		(isNotWumpus	1-1)
;		(isNotWumpus	1-2)
;		(isNotWumpus	2-1)
;		(isNotWumpus	2-2)

;World 2 - solvable
		(isNotPit	1-1)
		(isPit		1-2)
		(isNotPit	2-1)
		(isNotPit	2-2)
		(isNotWumpus	1-1)
		(isNotWumpus	1-2)
		(isWumpus		2-1)
		(at wumpus		2-1)
		(isNotWumpus	2-2)
		
;World 3 - unsolvable
;		(isNotPit	1-1)
;		(isPit		1-2)
;		(isPit		2-1)
;		(isNotPit	2-2)
;		(isNotWumpus	1-1)
;		(isNotWumpus	1-2)
;		(isWumpus		2-1)
;		(at wumpus		2-1)
;		(isNotWumpus	2-2)
		
;World 4 - solvable
;		(isNotPit	1-1)
;		(isNotPit	1-2)
;		(isNotPit	2-1)
;		(isNotPit	2-2)
;		(isNotWumpus	1-1)
;		(isWumpus		1-2)
;		(at wumpus		1-2)
;		(isWumpus		2-1)
;		(at wumpus		2-1)
;		(isNotWumpus	2-2)
		
;World 5 - unsolvable
;		(isNotPit	1-1)
;		(isNotPit	1-2)
;		(isNotPit	2-1)
;		(isPit		2-2)
;		(isNotWumpus	1-1)
;		(isNotWumpus	1-2)
;		(isNotWumpus	2-1)
;		(isNotWumpus	2-2)
		
;World 6 - solvable
;		(isNotPit	1-1)
;		(isNotPit	1-2)
;		(isNotPit	2-1)
;		(isNotPit	2-2)
;		(isNotWumpus	1-1)
;		(isNotWumpus	1-2)
;		(isNotWumpus	2-1)
;		(isWumpus		2-2)
;		(at wumpus		2-2)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		
		(atPerson	agent 1-1)
		(notHasGold agent)
		(facing E)
		
		(isGoldLocation 2-2)
	)
	
	(:goal (and(has-Gold agent)))
)
