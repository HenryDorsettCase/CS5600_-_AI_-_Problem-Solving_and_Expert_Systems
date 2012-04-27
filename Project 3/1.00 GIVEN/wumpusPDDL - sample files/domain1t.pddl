(define (domain wumpus-a)
  (:requirements :strips) ;; maybe not necessary
  (:types square thing person)
  (:predicates
   (adj ?square-1 ?square-2 - square)
   (pit ?square - square)
   (at ?what - thing ?square - square)
   (atP ?what - person ?square - square)
   (have ?who - person ?what - square)
   (dead ?who - thing))

  (:action move
    :parameters (?who - person ?from - square ?to - square)
    :precondition (and (adj ?from ?to)
		       (not (pit ?to))
		       (atP ?who ?from))
    :effect (and (not (atP ?who ?from))
		 (atP ?who ?to))
    )

  (:action take
    :parameters (?who - person ?what - thing ?where - square)
    :precondition (and (atP ?who ?where)
		       (at ?what ?where))
    :effect (and (have ?who ?what)
		 (not (at ?what ?where)))
    )

  (:action shoot
    :parameters (?who - person ?where - square ?arrow - thing ?victim - thing ?where-victim - square)
    :precondition (and (have ?who ?arrow)
		       (atP ?who ?where)
		       (at ?victim ?where-victim)
		       (adj ?where ?where-victim))
    :effect (and (dead ?victim)
		 (not (at ?victim ?where-victim))
		 (not (have ?who ?arrow)))
    )
)