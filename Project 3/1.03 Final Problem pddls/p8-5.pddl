(define (problem problem_size_8_seed_524286495_variations_added)(:domain domain_ww)

 (:objects

    N S E W - direction

    s0-0 s0-1 s0-2 s0-3 s0-4 s0-5 s0-6 s0-7 
    s1-0 s1-1 s1-2 s1-3 s1-4 s1-5 s1-6 s1-7 
    s2-0 s2-1 s2-2 s2-3 s2-4 s2-5 s2-6 s2-7 
    s3-0 s3-1 s3-2 s3-3 s3-4 s3-5 s3-6 s3-7 
    s4-0 s4-1 s4-2 s4-3 s4-4 s4-5 s4-6 s4-7 
    s5-0 s5-1 s5-2 s5-3 s5-4 s5-5 s5-6 s5-7 
    s6-0 s6-1 s6-2 s6-3 s6-4 s6-5 s6-6 s6-7 
    s7-0 s7-1 s7-2 s7-3 s7-4 s7-5 s7-6 s7-7  - square

 );end objects

 (:init

    (leftOf N W) (leftOf W S) (leftOf S E) (leftOf E N)
    (rightOf N E) (rightOf E S) (rightOf S W) (rightOf W N)

    (adjD s0-0 s1-0 N) (adjD s0-0 s0-1 E) 
    (adjD s0-1 s1-1 N) (adjD s0-1 s0-2 E) (adjD s0-1 s0-0 W) 
    (adjD s0-2 s1-2 N) (adjD s0-2 s0-3 E) (adjD s0-2 s0-1 W) 
    (adjD s0-3 s1-3 N) (adjD s0-3 s0-4 E) (adjD s0-3 s0-2 W) 
    (adjD s0-4 s1-4 N) (adjD s0-4 s0-5 E) (adjD s0-4 s0-3 W) 
    (adjD s0-5 s1-5 N) (adjD s0-5 s0-6 E) (adjD s0-5 s0-4 W) 
    (adjD s0-6 s1-6 N) (adjD s0-6 s0-7 E) (adjD s0-6 s0-5 W) 
    (adjD s0-7 s1-7 N) (adjD s0-7 s0-6 W) 
    (adjD s1-0 s2-0 N) (adjD s1-0 s0-0 S) (adjD s1-0 s1-1 E) 
    (adjD s1-1 s2-1 N) (adjD s1-1 s0-1 S) (adjD s1-1 s1-2 E) (adjD s1-1 s1-0 W) 
    (adjD s1-2 s2-2 N) (adjD s1-2 s0-2 S) (adjD s1-2 s1-3 E) (adjD s1-2 s1-1 W) 
    (adjD s1-3 s2-3 N) (adjD s1-3 s0-3 S) (adjD s1-3 s1-4 E) (adjD s1-3 s1-2 W) 
    (adjD s1-4 s2-4 N) (adjD s1-4 s0-4 S) (adjD s1-4 s1-5 E) (adjD s1-4 s1-3 W) 
    (adjD s1-5 s2-5 N) (adjD s1-5 s0-5 S) (adjD s1-5 s1-6 E) (adjD s1-5 s1-4 W) 
    (adjD s1-6 s2-6 N) (adjD s1-6 s0-6 S) (adjD s1-6 s1-7 E) (adjD s1-6 s1-5 W) 
    (adjD s1-7 s2-7 N) (adjD s1-7 s0-7 S) (adjD s1-7 s1-6 W) 
    (adjD s2-0 s3-0 N) (adjD s2-0 s1-0 S) (adjD s2-0 s2-1 E) 
    (adjD s2-1 s3-1 N) (adjD s2-1 s1-1 S) (adjD s2-1 s2-2 E) (adjD s2-1 s2-0 W) 
    (adjD s2-2 s3-2 N) (adjD s2-2 s1-2 S) (adjD s2-2 s2-3 E) (adjD s2-2 s2-1 W) 
    (adjD s2-3 s3-3 N) (adjD s2-3 s1-3 S) (adjD s2-3 s2-4 E) (adjD s2-3 s2-2 W) 
    (adjD s2-4 s3-4 N) (adjD s2-4 s1-4 S) (adjD s2-4 s2-5 E) (adjD s2-4 s2-3 W) 
    (adjD s2-5 s3-5 N) (adjD s2-5 s1-5 S) (adjD s2-5 s2-6 E) (adjD s2-5 s2-4 W) 
    (adjD s2-6 s3-6 N) (adjD s2-6 s1-6 S) (adjD s2-6 s2-7 E) (adjD s2-6 s2-5 W) 
    (adjD s2-7 s3-7 N) (adjD s2-7 s1-7 S) (adjD s2-7 s2-6 W) 
    (adjD s3-0 s4-0 N) (adjD s3-0 s2-0 S) (adjD s3-0 s3-1 E) 
    (adjD s3-1 s4-1 N) (adjD s3-1 s2-1 S) (adjD s3-1 s3-2 E) (adjD s3-1 s3-0 W) 
    (adjD s3-2 s4-2 N) (adjD s3-2 s2-2 S) (adjD s3-2 s3-3 E) (adjD s3-2 s3-1 W) 
    (adjD s3-3 s4-3 N) (adjD s3-3 s2-3 S) (adjD s3-3 s3-4 E) (adjD s3-3 s3-2 W) 
    (adjD s3-4 s4-4 N) (adjD s3-4 s2-4 S) (adjD s3-4 s3-5 E) (adjD s3-4 s3-3 W) 
    (adjD s3-5 s4-5 N) (adjD s3-5 s2-5 S) (adjD s3-5 s3-6 E) (adjD s3-5 s3-4 W) 
    (adjD s3-6 s4-6 N) (adjD s3-6 s2-6 S) (adjD s3-6 s3-7 E) (adjD s3-6 s3-5 W) 
    (adjD s3-7 s4-7 N) (adjD s3-7 s2-7 S) (adjD s3-7 s3-6 W) 
    (adjD s4-0 s5-0 N) (adjD s4-0 s3-0 S) (adjD s4-0 s4-1 E) 
    (adjD s4-1 s5-1 N) (adjD s4-1 s3-1 S) (adjD s4-1 s4-2 E) (adjD s4-1 s4-0 W) 
    (adjD s4-2 s5-2 N) (adjD s4-2 s3-2 S) (adjD s4-2 s4-3 E) (adjD s4-2 s4-1 W) 
    (adjD s4-3 s5-3 N) (adjD s4-3 s3-3 S) (adjD s4-3 s4-4 E) (adjD s4-3 s4-2 W) 
    (adjD s4-4 s5-4 N) (adjD s4-4 s3-4 S) (adjD s4-4 s4-5 E) (adjD s4-4 s4-3 W) 
    (adjD s4-5 s5-5 N) (adjD s4-5 s3-5 S) (adjD s4-5 s4-6 E) (adjD s4-5 s4-4 W) 
    (adjD s4-6 s5-6 N) (adjD s4-6 s3-6 S) (adjD s4-6 s4-7 E) (adjD s4-6 s4-5 W) 
    (adjD s4-7 s5-7 N) (adjD s4-7 s3-7 S) (adjD s4-7 s4-6 W) 
    (adjD s5-0 s6-0 N) (adjD s5-0 s4-0 S) (adjD s5-0 s5-1 E) 
    (adjD s5-1 s6-1 N) (adjD s5-1 s4-1 S) (adjD s5-1 s5-2 E) (adjD s5-1 s5-0 W) 
    (adjD s5-2 s6-2 N) (adjD s5-2 s4-2 S) (adjD s5-2 s5-3 E) (adjD s5-2 s5-1 W) 
    (adjD s5-3 s6-3 N) (adjD s5-3 s4-3 S) (adjD s5-3 s5-4 E) (adjD s5-3 s5-2 W) 
    (adjD s5-4 s6-4 N) (adjD s5-4 s4-4 S) (adjD s5-4 s5-5 E) (adjD s5-4 s5-3 W) 
    (adjD s5-5 s6-5 N) (adjD s5-5 s4-5 S) (adjD s5-5 s5-6 E) (adjD s5-5 s5-4 W) 
    (adjD s5-6 s6-6 N) (adjD s5-6 s4-6 S) (adjD s5-6 s5-7 E) (adjD s5-6 s5-5 W) 
    (adjD s5-7 s6-7 N) (adjD s5-7 s4-7 S) (adjD s5-7 s5-6 W) 
    (adjD s6-0 s7-0 N) (adjD s6-0 s5-0 S) (adjD s6-0 s6-1 E) 
    (adjD s6-1 s7-1 N) (adjD s6-1 s5-1 S) (adjD s6-1 s6-2 E) (adjD s6-1 s6-0 W) 
    (adjD s6-2 s7-2 N) (adjD s6-2 s5-2 S) (adjD s6-2 s6-3 E) (adjD s6-2 s6-1 W) 
    (adjD s6-3 s7-3 N) (adjD s6-3 s5-3 S) (adjD s6-3 s6-4 E) (adjD s6-3 s6-2 W) 
    (adjD s6-4 s7-4 N) (adjD s6-4 s5-4 S) (adjD s6-4 s6-5 E) (adjD s6-4 s6-3 W) 
    (adjD s6-5 s7-5 N) (adjD s6-5 s5-5 S) (adjD s6-5 s6-6 E) (adjD s6-5 s6-4 W) 
    (adjD s6-6 s7-6 N) (adjD s6-6 s5-6 S) (adjD s6-6 s6-7 E) (adjD s6-6 s6-5 W) 
    (adjD s6-7 s7-7 N) (adjD s6-7 s5-7 S) (adjD s6-7 s6-6 W) 
    (adjD s7-0 s6-0 S) (adjD s7-0 s7-1 E) 
    (adjD s7-1 s6-1 S) (adjD s7-1 s7-2 E) (adjD s7-1 s7-0 W) 
    (adjD s7-2 s6-2 S) (adjD s7-2 s7-3 E) (adjD s7-2 s7-1 W) 
    (adjD s7-3 s6-3 S) (adjD s7-3 s7-4 E) (adjD s7-3 s7-2 W) 
    (adjD s7-4 s6-4 S) (adjD s7-4 s7-5 E) (adjD s7-4 s7-3 W) 
    (adjD s7-5 s6-5 S) (adjD s7-5 s7-6 E) (adjD s7-5 s7-4 W) 
    (adjD s7-6 s6-6 S) (adjD s7-6 s7-7 E) (adjD s7-6 s7-5 W) 
    (adjD s7-7 s6-7 S) (adjD s7-7 s7-6 W) 

    (at s0-0) (facing E)

    (isNotPit s0-0) (isNotPit s0-2) (isNotPit s0-3) (isNotPit s0-4) (isNotPit s0-5) (isNotPit s0-6) 
    (isNotPit s1-0) (isNotPit s1-1) (isNotPit s1-2) (isNotPit s1-3) (isNotPit s1-4) 
    (isNotPit s2-0) (isNotPit s2-1) (isNotPit s2-2) (isNotPit s2-3) (isNotPit s2-4) (isNotPit s2-5) (isNotPit s2-7) 
    (isNotPit s3-1) (isNotPit s3-2) (isNotPit s3-4) (isNotPit s3-5) (isNotPit s3-6) (isNotPit s3-7) 
    (isNotPit s4-1) (isNotPit s4-2) (isNotPit s4-3) (isNotPit s4-4) (isNotPit s4-5) (isNotPit s4-6) (isNotPit s4-7) 
    (isNotPit s5-1) (isNotPit s5-2) (isNotPit s5-5) (isNotPit s5-6) 
    (isNotPit s6-0) (isNotPit s6-3) (isNotPit s6-5) (isNotPit s6-6) (isNotPit s6-7) 
    (isNotPit s7-0) (isNotPit s7-1) (isNotPit s7-2) (isNotPit s7-4) (isNotPit s7-5) (isNotPit s7-6) (isNotPit s7-7) 

    (isNotWumpus s0-0) (isNotWumpus s0-1) (isNotWumpus s0-2) (isWumpus    s0-3) (isWumpus    s0-4) (isNotWumpus s0-5) (isNotWumpus s0-6) (isNotWumpus s0-7) 
    (isNotWumpus s1-0) (isNotWumpus s1-1) (isWumpus    s1-2) (isWumpus    s1-3) (isNotWumpus s1-4) (isNotWumpus s1-5) (isNotWumpus s1-6) (isNotWumpus s1-7) 
    (isNotWumpus s2-0) (isNotWumpus s2-1) (isNotWumpus s2-2) (isNotWumpus s2-3) (isNotWumpus s2-4) (isNotWumpus s2-5) (isNotWumpus s2-6) (isNotWumpus s2-7) 
    (isNotWumpus s3-0) (isNotWumpus s3-1) (isNotWumpus s3-2) (isNotWumpus s3-3) (isWumpus    s3-4) (isWumpus    s3-5) (isNotWumpus s3-6) (isNotWumpus s3-7) 
    (isNotWumpus s4-0) (isNotWumpus s4-1) (isNotWumpus s4-2) (isNotWumpus s4-3) (isNotWumpus s4-4) (isNotWumpus s4-5) (isNotWumpus s4-6) (isNotWumpus s4-7) 
    (isNotWumpus s5-0) (isNotWumpus s5-1) (isNotWumpus s5-2) (isNotWumpus s5-3) (isNotWumpus s5-4) (isWumpus    s5-5) (isNotWumpus s5-6) (isNotWumpus s5-7) 
    (isNotWumpus s6-0) (isNotWumpus s6-1) (isNotWumpus s6-2) (isNotWumpus s6-3) (isNotWumpus s6-4) (isNotWumpus s6-5) (isNotWumpus s6-6) (isNotWumpus s6-7) 
    (isNotWumpus s7-0) (isNotWumpus s7-1) (isWumpus    s7-2) (isNotWumpus s7-3) (isNotWumpus s7-4) (isNotWumpus s7-5) (isNotWumpus s7-6) (isNotWumpus s7-7) 

    (isGoldLocation s3-3) 

 );end init

 (:goal (and(has-Gold)) )

);end define


; -----------------------------------------------
;|     |     |   W | P   |     |     |     |     |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;|     | P   | P   |     | P   |     |     |     |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;| P   |     |     | P   | P   |   W |     | P   |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;| P   |     |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;| P   |     |     | P   |   W |   W |     |     |
;|     |     |     | G   |     |     |     |     |
; -----------------------------------------------
;|     |     |     |     |     |     | P   |     |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;|     |     |   W |   W |     | P   | P   | P   |
;|     |     |     |     |     |     |     |     |
; -----------------------------------------------
;|     | P   |     |   W |   W |     |     | P   |
;|   > |     |     |     |     |     |     |     |
; -----------------------------------------------


