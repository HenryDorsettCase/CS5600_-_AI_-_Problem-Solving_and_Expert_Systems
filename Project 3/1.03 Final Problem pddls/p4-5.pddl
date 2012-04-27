(define (problem problem_size_4_seed_-1050080987_variations_added)(:domain domain_ww)

 (:objects

    N S E W - direction

    s0-0 s0-1 s0-2 s0-3 
    s1-0 s1-1 s1-2 s1-3 
    s2-0 s2-1 s2-2 s2-3 
    s3-0 s3-1 s3-2 s3-3  - square

 );end objects

 (:init

    (leftOf N W) (leftOf W S) (leftOf S E) (leftOf E N)
    (rightOf N E) (rightOf E S) (rightOf S W) (rightOf W N)

    (adjD s0-0 s1-0 N) (adjD s0-0 s0-1 E) 
    (adjD s0-1 s1-1 N) (adjD s0-1 s0-2 E) (adjD s0-1 s0-0 W) 
    (adjD s0-2 s1-2 N) (adjD s0-2 s0-3 E) (adjD s0-2 s0-1 W) 
    (adjD s0-3 s1-3 N) (adjD s0-3 s0-2 W) 
    (adjD s1-0 s2-0 N) (adjD s1-0 s0-0 S) (adjD s1-0 s1-1 E) 
    (adjD s1-1 s2-1 N) (adjD s1-1 s0-1 S) (adjD s1-1 s1-2 E) (adjD s1-1 s1-0 W) 
    (adjD s1-2 s2-2 N) (adjD s1-2 s0-2 S) (adjD s1-2 s1-3 E) (adjD s1-2 s1-1 W) 
    (adjD s1-3 s2-3 N) (adjD s1-3 s0-3 S) (adjD s1-3 s1-2 W) 
    (adjD s2-0 s3-0 N) (adjD s2-0 s1-0 S) (adjD s2-0 s2-1 E) 
    (adjD s2-1 s3-1 N) (adjD s2-1 s1-1 S) (adjD s2-1 s2-2 E) (adjD s2-1 s2-0 W) 
    (adjD s2-2 s3-2 N) (adjD s2-2 s1-2 S) (adjD s2-2 s2-3 E) (adjD s2-2 s2-1 W) 
    (adjD s2-3 s3-3 N) (adjD s2-3 s1-3 S) (adjD s2-3 s2-2 W) 
    (adjD s3-0 s2-0 S) (adjD s3-0 s3-1 E) 
    (adjD s3-1 s2-1 S) (adjD s3-1 s3-2 E) (adjD s3-1 s3-0 W) 
    (adjD s3-2 s2-2 S) (adjD s3-2 s3-3 E) (adjD s3-2 s3-1 W) 
    (adjD s3-3 s2-3 S) (adjD s3-3 s3-2 W) 

    (at s0-0) (facing E)

    (isNotPit s0-0) (isNotPit s0-2) 
    (isNotPit s1-0) (isNotPit s1-1) (isNotPit s1-2)
    (isNotPit s2-3) 
    (isNotPit s3-0) (isNotPit s3-1) 

    (isNotWumpus s0-0) (isWumpus    s0-1) (isNotWumpus s0-2) (isNotWumpus s0-3) 
    (isWumpus    s1-0) (isNotWumpus s1-1) (isNotWumpus s1-2) (isNotWumpus s1-3) 
    (isNotWumpus s2-0) (isNotWumpus s2-1) (isNotWumpus s2-2) (isWumpus    s2-3) 
    (isNotWumpus s3-0) (isNotWumpus s3-1) (isNotWumpus s3-2) (isNotWumpus s3-3) 

    (isGoldLocation s2-2) 

 );end init

 (:goal (and(has-Gold)) )

);end define


; -----------------------
;|     |     | P   | P   |
;|     |     |     |     |
; -----------------------
;| P   | P   | P   |   W |
;|     |     | G   |     |
; -----------------------
;|   W |     |     | P   |
;|     |     |     |     |
; -----------------------
;|     | P W |     | P   |
;|   > |     |     |     |
; -----------------------


