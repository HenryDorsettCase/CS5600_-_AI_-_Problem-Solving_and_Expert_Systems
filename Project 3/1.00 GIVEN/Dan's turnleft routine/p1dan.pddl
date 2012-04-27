(define (problem dan1)
 (:domain dan)
 (:objects N S E W - direction)
 (:init  
  (facing N)  
  (leftOf N W)
  (leftOf E N)
  (leftOf S E)
  (leftOf W S)

)
 (:goal (and (facing S)))
)