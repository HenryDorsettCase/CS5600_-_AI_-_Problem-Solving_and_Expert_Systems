(define (domain dan)
 (:types direction square)
 (:predicates 
   (facing ?d - direction)
   (leftOf ?d ?d1 - direction)
   (dirOf ?d - direction ?s - square ?s1 - square)
   (at ?s - square)
   (no-wumpus ?s - square)
   (wumpus ?s - square)
   (no-pit ?s - square)
   (haveGold)
   (goldAt ?s - square)
 )

 (:action turn-left
  :parameters (?F1 ?F2 - direction)
  :precondition (and (facing ?F1) 
		 (leftOf ?F1 ?F2))
  :effect (and (facing ?F2) 
		(not (facing ?F1))))


(:action turn-right
  :parameters (?F1 ?F2 - direction)
  :precondition (and (facing ?F1) 
		 (leftOf ?F2 ?F1))
  :effect (and (facing ?F2) 
		(not (facing ?F1))))


(:action move-forward
 :parameters (?D - direction ?S1 ?S2 - square)
 :precondition (and (facing ?D)
                    (dirOf ?S1 ?S2 ?D)
		    (at ?S1)
		    (no-wumpus ?S2)
		    (no-pit ?S2)
		)
 :effect (and (at ?S2) (not (at ?S1))))

(:action grab 
 :parameters (?S1 - square)
 :precondition (and (goldAt ?S1)
		    (at ?S1))
 :effect (and (haveGold)
	      (not (goldAt ?S1))))

(:action shoot
 :parameters (?D - direction ?S1 ?S2 - square)
 :precondition (and (at ?S1)
		    (facing ?D)
		    (dirOf ?S1 ?S2 ?D)
		    (wumpus ?S2)
		)
 :effect (and (not (wumpus ?S2)) (no-wumpus ?S2)))

)