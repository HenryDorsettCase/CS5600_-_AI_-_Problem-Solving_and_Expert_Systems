(define (domain dan)
 (:types direction)
 (:predicates 
   (facing ?d - direction)
   (leftOf ?d ?d1 - direction)
 )

 (:action turn-left
  :parameters (?F1 ?F2 - direction)
  :precondition (and (facing ?F1) 
		 (leftOf ?F1 ?F2))
  :effect (and (facing ?F2) 
		(not (facing ?F1))))
)