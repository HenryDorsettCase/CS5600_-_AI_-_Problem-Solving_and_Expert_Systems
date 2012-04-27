(define (problem problem_size_16_seed_1945730752_variations_added)(:domain domain_ww)

 (:objects

    N S E W - direction

    s0-0 s0-1 s0-2 s0-3 s0-4 s0-5 s0-6 s0-7 s0-8 s0-9 s0-10 s0-11 s0-12 s0-13 s0-14 s0-15 
    s1-0 s1-1 s1-2 s1-3 s1-4 s1-5 s1-6 s1-7 s1-8 s1-9 s1-10 s1-11 s1-12 s1-13 s1-14 s1-15 
    s2-0 s2-1 s2-2 s2-3 s2-4 s2-5 s2-6 s2-7 s2-8 s2-9 s2-10 s2-11 s2-12 s2-13 s2-14 s2-15 
    s3-0 s3-1 s3-2 s3-3 s3-4 s3-5 s3-6 s3-7 s3-8 s3-9 s3-10 s3-11 s3-12 s3-13 s3-14 s3-15 
    s4-0 s4-1 s4-2 s4-3 s4-4 s4-5 s4-6 s4-7 s4-8 s4-9 s4-10 s4-11 s4-12 s4-13 s4-14 s4-15 
    s5-0 s5-1 s5-2 s5-3 s5-4 s5-5 s5-6 s5-7 s5-8 s5-9 s5-10 s5-11 s5-12 s5-13 s5-14 s5-15 
    s6-0 s6-1 s6-2 s6-3 s6-4 s6-5 s6-6 s6-7 s6-8 s6-9 s6-10 s6-11 s6-12 s6-13 s6-14 s6-15 
    s7-0 s7-1 s7-2 s7-3 s7-4 s7-5 s7-6 s7-7 s7-8 s7-9 s7-10 s7-11 s7-12 s7-13 s7-14 s7-15 
    s8-0 s8-1 s8-2 s8-3 s8-4 s8-5 s8-6 s8-7 s8-8 s8-9 s8-10 s8-11 s8-12 s8-13 s8-14 s8-15 
    s9-0 s9-1 s9-2 s9-3 s9-4 s9-5 s9-6 s9-7 s9-8 s9-9 s9-10 s9-11 s9-12 s9-13 s9-14 s9-15 
    s10-0 s10-1 s10-2 s10-3 s10-4 s10-5 s10-6 s10-7 s10-8 s10-9 s10-10 s10-11 s10-12 s10-13 s10-14 s10-15 
    s11-0 s11-1 s11-2 s11-3 s11-4 s11-5 s11-6 s11-7 s11-8 s11-9 s11-10 s11-11 s11-12 s11-13 s11-14 s11-15 
    s12-0 s12-1 s12-2 s12-3 s12-4 s12-5 s12-6 s12-7 s12-8 s12-9 s12-10 s12-11 s12-12 s12-13 s12-14 s12-15 
    s13-0 s13-1 s13-2 s13-3 s13-4 s13-5 s13-6 s13-7 s13-8 s13-9 s13-10 s13-11 s13-12 s13-13 s13-14 s13-15 
    s14-0 s14-1 s14-2 s14-3 s14-4 s14-5 s14-6 s14-7 s14-8 s14-9 s14-10 s14-11 s14-12 s14-13 s14-14 s14-15 
    s15-0 s15-1 s15-2 s15-3 s15-4 s15-5 s15-6 s15-7 s15-8 s15-9 s15-10 s15-11 s15-12 s15-13 s15-14 s15-15  - square

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
    (adjD s0-7 s1-7 N) (adjD s0-7 s0-8 E) (adjD s0-7 s0-6 W) 
    (adjD s0-8 s1-8 N) (adjD s0-8 s0-9 E) (adjD s0-8 s0-7 W) 
    (adjD s0-9 s1-9 N) (adjD s0-9 s0-10 E) (adjD s0-9 s0-8 W) 
    (adjD s0-10 s1-10 N) (adjD s0-10 s0-11 E) (adjD s0-10 s0-9 W) 
    (adjD s0-11 s1-11 N) (adjD s0-11 s0-12 E) (adjD s0-11 s0-10 W) 
    (adjD s0-12 s1-12 N) (adjD s0-12 s0-13 E) (adjD s0-12 s0-11 W) 
    (adjD s0-13 s1-13 N) (adjD s0-13 s0-14 E) (adjD s0-13 s0-12 W) 
    (adjD s0-14 s1-14 N) (adjD s0-14 s0-15 E) (adjD s0-14 s0-13 W) 
    (adjD s0-15 s1-15 N) (adjD s0-15 s0-14 W) 
    (adjD s1-0 s2-0 N) (adjD s1-0 s0-0 S) (adjD s1-0 s1-1 E) 
    (adjD s1-1 s2-1 N) (adjD s1-1 s0-1 S) (adjD s1-1 s1-2 E) (adjD s1-1 s1-0 W) 
    (adjD s1-2 s2-2 N) (adjD s1-2 s0-2 S) (adjD s1-2 s1-3 E) (adjD s1-2 s1-1 W) 
    (adjD s1-3 s2-3 N) (adjD s1-3 s0-3 S) (adjD s1-3 s1-4 E) (adjD s1-3 s1-2 W) 
    (adjD s1-4 s2-4 N) (adjD s1-4 s0-4 S) (adjD s1-4 s1-5 E) (adjD s1-4 s1-3 W) 
    (adjD s1-5 s2-5 N) (adjD s1-5 s0-5 S) (adjD s1-5 s1-6 E) (adjD s1-5 s1-4 W) 
    (adjD s1-6 s2-6 N) (adjD s1-6 s0-6 S) (adjD s1-6 s1-7 E) (adjD s1-6 s1-5 W) 
    (adjD s1-7 s2-7 N) (adjD s1-7 s0-7 S) (adjD s1-7 s1-8 E) (adjD s1-7 s1-6 W) 
    (adjD s1-8 s2-8 N) (adjD s1-8 s0-8 S) (adjD s1-8 s1-9 E) (adjD s1-8 s1-7 W) 
    (adjD s1-9 s2-9 N) (adjD s1-9 s0-9 S) (adjD s1-9 s1-10 E) (adjD s1-9 s1-8 W) 
    (adjD s1-10 s2-10 N) (adjD s1-10 s0-10 S) (adjD s1-10 s1-11 E) (adjD s1-10 s1-9 W) 
    (adjD s1-11 s2-11 N) (adjD s1-11 s0-11 S) (adjD s1-11 s1-12 E) (adjD s1-11 s1-10 W) 
    (adjD s1-12 s2-12 N) (adjD s1-12 s0-12 S) (adjD s1-12 s1-13 E) (adjD s1-12 s1-11 W) 
    (adjD s1-13 s2-13 N) (adjD s1-13 s0-13 S) (adjD s1-13 s1-14 E) (adjD s1-13 s1-12 W) 
    (adjD s1-14 s2-14 N) (adjD s1-14 s0-14 S) (adjD s1-14 s1-15 E) (adjD s1-14 s1-13 W) 
    (adjD s1-15 s2-15 N) (adjD s1-15 s0-15 S) (adjD s1-15 s1-14 W) 
    (adjD s2-0 s3-0 N) (adjD s2-0 s1-0 S) (adjD s2-0 s2-1 E) 
    (adjD s2-1 s3-1 N) (adjD s2-1 s1-1 S) (adjD s2-1 s2-2 E) (adjD s2-1 s2-0 W) 
    (adjD s2-2 s3-2 N) (adjD s2-2 s1-2 S) (adjD s2-2 s2-3 E) (adjD s2-2 s2-1 W) 
    (adjD s2-3 s3-3 N) (adjD s2-3 s1-3 S) (adjD s2-3 s2-4 E) (adjD s2-3 s2-2 W) 
    (adjD s2-4 s3-4 N) (adjD s2-4 s1-4 S) (adjD s2-4 s2-5 E) (adjD s2-4 s2-3 W) 
    (adjD s2-5 s3-5 N) (adjD s2-5 s1-5 S) (adjD s2-5 s2-6 E) (adjD s2-5 s2-4 W) 
    (adjD s2-6 s3-6 N) (adjD s2-6 s1-6 S) (adjD s2-6 s2-7 E) (adjD s2-6 s2-5 W) 
    (adjD s2-7 s3-7 N) (adjD s2-7 s1-7 S) (adjD s2-7 s2-8 E) (adjD s2-7 s2-6 W) 
    (adjD s2-8 s3-8 N) (adjD s2-8 s1-8 S) (adjD s2-8 s2-9 E) (adjD s2-8 s2-7 W) 
    (adjD s2-9 s3-9 N) (adjD s2-9 s1-9 S) (adjD s2-9 s2-10 E) (adjD s2-9 s2-8 W) 
    (adjD s2-10 s3-10 N) (adjD s2-10 s1-10 S) (adjD s2-10 s2-11 E) (adjD s2-10 s2-9 W) 
    (adjD s2-11 s3-11 N) (adjD s2-11 s1-11 S) (adjD s2-11 s2-12 E) (adjD s2-11 s2-10 W) 
    (adjD s2-12 s3-12 N) (adjD s2-12 s1-12 S) (adjD s2-12 s2-13 E) (adjD s2-12 s2-11 W) 
    (adjD s2-13 s3-13 N) (adjD s2-13 s1-13 S) (adjD s2-13 s2-14 E) (adjD s2-13 s2-12 W) 
    (adjD s2-14 s3-14 N) (adjD s2-14 s1-14 S) (adjD s2-14 s2-15 E) (adjD s2-14 s2-13 W) 
    (adjD s2-15 s3-15 N) (adjD s2-15 s1-15 S) (adjD s2-15 s2-14 W) 
    (adjD s3-0 s4-0 N) (adjD s3-0 s2-0 S) (adjD s3-0 s3-1 E) 
    (adjD s3-1 s4-1 N) (adjD s3-1 s2-1 S) (adjD s3-1 s3-2 E) (adjD s3-1 s3-0 W) 
    (adjD s3-2 s4-2 N) (adjD s3-2 s2-2 S) (adjD s3-2 s3-3 E) (adjD s3-2 s3-1 W) 
    (adjD s3-3 s4-3 N) (adjD s3-3 s2-3 S) (adjD s3-3 s3-4 E) (adjD s3-3 s3-2 W) 
    (adjD s3-4 s4-4 N) (adjD s3-4 s2-4 S) (adjD s3-4 s3-5 E) (adjD s3-4 s3-3 W) 
    (adjD s3-5 s4-5 N) (adjD s3-5 s2-5 S) (adjD s3-5 s3-6 E) (adjD s3-5 s3-4 W) 
    (adjD s3-6 s4-6 N) (adjD s3-6 s2-6 S) (adjD s3-6 s3-7 E) (adjD s3-6 s3-5 W) 
    (adjD s3-7 s4-7 N) (adjD s3-7 s2-7 S) (adjD s3-7 s3-8 E) (adjD s3-7 s3-6 W) 
    (adjD s3-8 s4-8 N) (adjD s3-8 s2-8 S) (adjD s3-8 s3-9 E) (adjD s3-8 s3-7 W) 
    (adjD s3-9 s4-9 N) (adjD s3-9 s2-9 S) (adjD s3-9 s3-10 E) (adjD s3-9 s3-8 W) 
    (adjD s3-10 s4-10 N) (adjD s3-10 s2-10 S) (adjD s3-10 s3-11 E) (adjD s3-10 s3-9 W) 
    (adjD s3-11 s4-11 N) (adjD s3-11 s2-11 S) (adjD s3-11 s3-12 E) (adjD s3-11 s3-10 W) 
    (adjD s3-12 s4-12 N) (adjD s3-12 s2-12 S) (adjD s3-12 s3-13 E) (adjD s3-12 s3-11 W) 
    (adjD s3-13 s4-13 N) (adjD s3-13 s2-13 S) (adjD s3-13 s3-14 E) (adjD s3-13 s3-12 W) 
    (adjD s3-14 s4-14 N) (adjD s3-14 s2-14 S) (adjD s3-14 s3-15 E) (adjD s3-14 s3-13 W) 
    (adjD s3-15 s4-15 N) (adjD s3-15 s2-15 S) (adjD s3-15 s3-14 W) 
    (adjD s4-0 s5-0 N) (adjD s4-0 s3-0 S) (adjD s4-0 s4-1 E) 
    (adjD s4-1 s5-1 N) (adjD s4-1 s3-1 S) (adjD s4-1 s4-2 E) (adjD s4-1 s4-0 W) 
    (adjD s4-2 s5-2 N) (adjD s4-2 s3-2 S) (adjD s4-2 s4-3 E) (adjD s4-2 s4-1 W) 
    (adjD s4-3 s5-3 N) (adjD s4-3 s3-3 S) (adjD s4-3 s4-4 E) (adjD s4-3 s4-2 W) 
    (adjD s4-4 s5-4 N) (adjD s4-4 s3-4 S) (adjD s4-4 s4-5 E) (adjD s4-4 s4-3 W) 
    (adjD s4-5 s5-5 N) (adjD s4-5 s3-5 S) (adjD s4-5 s4-6 E) (adjD s4-5 s4-4 W) 
    (adjD s4-6 s5-6 N) (adjD s4-6 s3-6 S) (adjD s4-6 s4-7 E) (adjD s4-6 s4-5 W) 
    (adjD s4-7 s5-7 N) (adjD s4-7 s3-7 S) (adjD s4-7 s4-8 E) (adjD s4-7 s4-6 W) 
    (adjD s4-8 s5-8 N) (adjD s4-8 s3-8 S) (adjD s4-8 s4-9 E) (adjD s4-8 s4-7 W) 
    (adjD s4-9 s5-9 N) (adjD s4-9 s3-9 S) (adjD s4-9 s4-10 E) (adjD s4-9 s4-8 W) 
    (adjD s4-10 s5-10 N) (adjD s4-10 s3-10 S) (adjD s4-10 s4-11 E) (adjD s4-10 s4-9 W) 
    (adjD s4-11 s5-11 N) (adjD s4-11 s3-11 S) (adjD s4-11 s4-12 E) (adjD s4-11 s4-10 W) 
    (adjD s4-12 s5-12 N) (adjD s4-12 s3-12 S) (adjD s4-12 s4-13 E) (adjD s4-12 s4-11 W) 
    (adjD s4-13 s5-13 N) (adjD s4-13 s3-13 S) (adjD s4-13 s4-14 E) (adjD s4-13 s4-12 W) 
    (adjD s4-14 s5-14 N) (adjD s4-14 s3-14 S) (adjD s4-14 s4-15 E) (adjD s4-14 s4-13 W) 
    (adjD s4-15 s5-15 N) (adjD s4-15 s3-15 S) (adjD s4-15 s4-14 W) 
    (adjD s5-0 s6-0 N) (adjD s5-0 s4-0 S) (adjD s5-0 s5-1 E) 
    (adjD s5-1 s6-1 N) (adjD s5-1 s4-1 S) (adjD s5-1 s5-2 E) (adjD s5-1 s5-0 W) 
    (adjD s5-2 s6-2 N) (adjD s5-2 s4-2 S) (adjD s5-2 s5-3 E) (adjD s5-2 s5-1 W) 
    (adjD s5-3 s6-3 N) (adjD s5-3 s4-3 S) (adjD s5-3 s5-4 E) (adjD s5-3 s5-2 W) 
    (adjD s5-4 s6-4 N) (adjD s5-4 s4-4 S) (adjD s5-4 s5-5 E) (adjD s5-4 s5-3 W) 
    (adjD s5-5 s6-5 N) (adjD s5-5 s4-5 S) (adjD s5-5 s5-6 E) (adjD s5-5 s5-4 W) 
    (adjD s5-6 s6-6 N) (adjD s5-6 s4-6 S) (adjD s5-6 s5-7 E) (adjD s5-6 s5-5 W) 
    (adjD s5-7 s6-7 N) (adjD s5-7 s4-7 S) (adjD s5-7 s5-8 E) (adjD s5-7 s5-6 W) 
    (adjD s5-8 s6-8 N) (adjD s5-8 s4-8 S) (adjD s5-8 s5-9 E) (adjD s5-8 s5-7 W) 
    (adjD s5-9 s6-9 N) (adjD s5-9 s4-9 S) (adjD s5-9 s5-10 E) (adjD s5-9 s5-8 W) 
    (adjD s5-10 s6-10 N) (adjD s5-10 s4-10 S) (adjD s5-10 s5-11 E) (adjD s5-10 s5-9 W) 
    (adjD s5-11 s6-11 N) (adjD s5-11 s4-11 S) (adjD s5-11 s5-12 E) (adjD s5-11 s5-10 W) 
    (adjD s5-12 s6-12 N) (adjD s5-12 s4-12 S) (adjD s5-12 s5-13 E) (adjD s5-12 s5-11 W) 
    (adjD s5-13 s6-13 N) (adjD s5-13 s4-13 S) (adjD s5-13 s5-14 E) (adjD s5-13 s5-12 W) 
    (adjD s5-14 s6-14 N) (adjD s5-14 s4-14 S) (adjD s5-14 s5-15 E) (adjD s5-14 s5-13 W) 
    (adjD s5-15 s6-15 N) (adjD s5-15 s4-15 S) (adjD s5-15 s5-14 W) 
    (adjD s6-0 s7-0 N) (adjD s6-0 s5-0 S) (adjD s6-0 s6-1 E) 
    (adjD s6-1 s7-1 N) (adjD s6-1 s5-1 S) (adjD s6-1 s6-2 E) (adjD s6-1 s6-0 W) 
    (adjD s6-2 s7-2 N) (adjD s6-2 s5-2 S) (adjD s6-2 s6-3 E) (adjD s6-2 s6-1 W) 
    (adjD s6-3 s7-3 N) (adjD s6-3 s5-3 S) (adjD s6-3 s6-4 E) (adjD s6-3 s6-2 W) 
    (adjD s6-4 s7-4 N) (adjD s6-4 s5-4 S) (adjD s6-4 s6-5 E) (adjD s6-4 s6-3 W) 
    (adjD s6-5 s7-5 N) (adjD s6-5 s5-5 S) (adjD s6-5 s6-6 E) (adjD s6-5 s6-4 W) 
    (adjD s6-6 s7-6 N) (adjD s6-6 s5-6 S) (adjD s6-6 s6-7 E) (adjD s6-6 s6-5 W) 
    (adjD s6-7 s7-7 N) (adjD s6-7 s5-7 S) (adjD s6-7 s6-8 E) (adjD s6-7 s6-6 W) 
    (adjD s6-8 s7-8 N) (adjD s6-8 s5-8 S) (adjD s6-8 s6-9 E) (adjD s6-8 s6-7 W) 
    (adjD s6-9 s7-9 N) (adjD s6-9 s5-9 S) (adjD s6-9 s6-10 E) (adjD s6-9 s6-8 W) 
    (adjD s6-10 s7-10 N) (adjD s6-10 s5-10 S) (adjD s6-10 s6-11 E) (adjD s6-10 s6-9 W) 
    (adjD s6-11 s7-11 N) (adjD s6-11 s5-11 S) (adjD s6-11 s6-12 E) (adjD s6-11 s6-10 W) 
    (adjD s6-12 s7-12 N) (adjD s6-12 s5-12 S) (adjD s6-12 s6-13 E) (adjD s6-12 s6-11 W) 
    (adjD s6-13 s7-13 N) (adjD s6-13 s5-13 S) (adjD s6-13 s6-14 E) (adjD s6-13 s6-12 W) 
    (adjD s6-14 s7-14 N) (adjD s6-14 s5-14 S) (adjD s6-14 s6-15 E) (adjD s6-14 s6-13 W) 
    (adjD s6-15 s7-15 N) (adjD s6-15 s5-15 S) (adjD s6-15 s6-14 W) 
    (adjD s7-0 s8-0 N) (adjD s7-0 s6-0 S) (adjD s7-0 s7-1 E) 
    (adjD s7-1 s8-1 N) (adjD s7-1 s6-1 S) (adjD s7-1 s7-2 E) (adjD s7-1 s7-0 W) 
    (adjD s7-2 s8-2 N) (adjD s7-2 s6-2 S) (adjD s7-2 s7-3 E) (adjD s7-2 s7-1 W) 
    (adjD s7-3 s8-3 N) (adjD s7-3 s6-3 S) (adjD s7-3 s7-4 E) (adjD s7-3 s7-2 W) 
    (adjD s7-4 s8-4 N) (adjD s7-4 s6-4 S) (adjD s7-4 s7-5 E) (adjD s7-4 s7-3 W) 
    (adjD s7-5 s8-5 N) (adjD s7-5 s6-5 S) (adjD s7-5 s7-6 E) (adjD s7-5 s7-4 W) 
    (adjD s7-6 s8-6 N) (adjD s7-6 s6-6 S) (adjD s7-6 s7-7 E) (adjD s7-6 s7-5 W) 
    (adjD s7-7 s8-7 N) (adjD s7-7 s6-7 S) (adjD s7-7 s7-8 E) (adjD s7-7 s7-6 W) 
    (adjD s7-8 s8-8 N) (adjD s7-8 s6-8 S) (adjD s7-8 s7-9 E) (adjD s7-8 s7-7 W) 
    (adjD s7-9 s8-9 N) (adjD s7-9 s6-9 S) (adjD s7-9 s7-10 E) (adjD s7-9 s7-8 W) 
    (adjD s7-10 s8-10 N) (adjD s7-10 s6-10 S) (adjD s7-10 s7-11 E) (adjD s7-10 s7-9 W) 
    (adjD s7-11 s8-11 N) (adjD s7-11 s6-11 S) (adjD s7-11 s7-12 E) (adjD s7-11 s7-10 W) 
    (adjD s7-12 s8-12 N) (adjD s7-12 s6-12 S) (adjD s7-12 s7-13 E) (adjD s7-12 s7-11 W) 
    (adjD s7-13 s8-13 N) (adjD s7-13 s6-13 S) (adjD s7-13 s7-14 E) (adjD s7-13 s7-12 W) 
    (adjD s7-14 s8-14 N) (adjD s7-14 s6-14 S) (adjD s7-14 s7-15 E) (adjD s7-14 s7-13 W) 
    (adjD s7-15 s8-15 N) (adjD s7-15 s6-15 S) (adjD s7-15 s7-14 W) 
    (adjD s8-0 s9-0 N) (adjD s8-0 s7-0 S) (adjD s8-0 s8-1 E) 
    (adjD s8-1 s9-1 N) (adjD s8-1 s7-1 S) (adjD s8-1 s8-2 E) (adjD s8-1 s8-0 W) 
    (adjD s8-2 s9-2 N) (adjD s8-2 s7-2 S) (adjD s8-2 s8-3 E) (adjD s8-2 s8-1 W) 
    (adjD s8-3 s9-3 N) (adjD s8-3 s7-3 S) (adjD s8-3 s8-4 E) (adjD s8-3 s8-2 W) 
    (adjD s8-4 s9-4 N) (adjD s8-4 s7-4 S) (adjD s8-4 s8-5 E) (adjD s8-4 s8-3 W) 
    (adjD s8-5 s9-5 N) (adjD s8-5 s7-5 S) (adjD s8-5 s8-6 E) (adjD s8-5 s8-4 W) 
    (adjD s8-6 s9-6 N) (adjD s8-6 s7-6 S) (adjD s8-6 s8-7 E) (adjD s8-6 s8-5 W) 
    (adjD s8-7 s9-7 N) (adjD s8-7 s7-7 S) (adjD s8-7 s8-8 E) (adjD s8-7 s8-6 W) 
    (adjD s8-8 s9-8 N) (adjD s8-8 s7-8 S) (adjD s8-8 s8-9 E) (adjD s8-8 s8-7 W) 
    (adjD s8-9 s9-9 N) (adjD s8-9 s7-9 S) (adjD s8-9 s8-10 E) (adjD s8-9 s8-8 W) 
    (adjD s8-10 s9-10 N) (adjD s8-10 s7-10 S) (adjD s8-10 s8-11 E) (adjD s8-10 s8-9 W) 
    (adjD s8-11 s9-11 N) (adjD s8-11 s7-11 S) (adjD s8-11 s8-12 E) (adjD s8-11 s8-10 W) 
    (adjD s8-12 s9-12 N) (adjD s8-12 s7-12 S) (adjD s8-12 s8-13 E) (adjD s8-12 s8-11 W) 
    (adjD s8-13 s9-13 N) (adjD s8-13 s7-13 S) (adjD s8-13 s8-14 E) (adjD s8-13 s8-12 W) 
    (adjD s8-14 s9-14 N) (adjD s8-14 s7-14 S) (adjD s8-14 s8-15 E) (adjD s8-14 s8-13 W) 
    (adjD s8-15 s9-15 N) (adjD s8-15 s7-15 S) (adjD s8-15 s8-14 W) 
    (adjD s9-0 s10-0 N) (adjD s9-0 s8-0 S) (adjD s9-0 s9-1 E) 
    (adjD s9-1 s10-1 N) (adjD s9-1 s8-1 S) (adjD s9-1 s9-2 E) (adjD s9-1 s9-0 W) 
    (adjD s9-2 s10-2 N) (adjD s9-2 s8-2 S) (adjD s9-2 s9-3 E) (adjD s9-2 s9-1 W) 
    (adjD s9-3 s10-3 N) (adjD s9-3 s8-3 S) (adjD s9-3 s9-4 E) (adjD s9-3 s9-2 W) 
    (adjD s9-4 s10-4 N) (adjD s9-4 s8-4 S) (adjD s9-4 s9-5 E) (adjD s9-4 s9-3 W) 
    (adjD s9-5 s10-5 N) (adjD s9-5 s8-5 S) (adjD s9-5 s9-6 E) (adjD s9-5 s9-4 W) 
    (adjD s9-6 s10-6 N) (adjD s9-6 s8-6 S) (adjD s9-6 s9-7 E) (adjD s9-6 s9-5 W) 
    (adjD s9-7 s10-7 N) (adjD s9-7 s8-7 S) (adjD s9-7 s9-8 E) (adjD s9-7 s9-6 W) 
    (adjD s9-8 s10-8 N) (adjD s9-8 s8-8 S) (adjD s9-8 s9-9 E) (adjD s9-8 s9-7 W) 
    (adjD s9-9 s10-9 N) (adjD s9-9 s8-9 S) (adjD s9-9 s9-10 E) (adjD s9-9 s9-8 W) 
    (adjD s9-10 s10-10 N) (adjD s9-10 s8-10 S) (adjD s9-10 s9-11 E) (adjD s9-10 s9-9 W) 
    (adjD s9-11 s10-11 N) (adjD s9-11 s8-11 S) (adjD s9-11 s9-12 E) (adjD s9-11 s9-10 W) 
    (adjD s9-12 s10-12 N) (adjD s9-12 s8-12 S) (adjD s9-12 s9-13 E) (adjD s9-12 s9-11 W) 
    (adjD s9-13 s10-13 N) (adjD s9-13 s8-13 S) (adjD s9-13 s9-14 E) (adjD s9-13 s9-12 W) 
    (adjD s9-14 s10-14 N) (adjD s9-14 s8-14 S) (adjD s9-14 s9-15 E) (adjD s9-14 s9-13 W) 
    (adjD s9-15 s10-15 N) (adjD s9-15 s8-15 S) (adjD s9-15 s9-14 W) 
    (adjD s10-0 s11-0 N) (adjD s10-0 s9-0 S) (adjD s10-0 s10-1 E) 
    (adjD s10-1 s11-1 N) (adjD s10-1 s9-1 S) (adjD s10-1 s10-2 E) (adjD s10-1 s10-0 W) 
    (adjD s10-2 s11-2 N) (adjD s10-2 s9-2 S) (adjD s10-2 s10-3 E) (adjD s10-2 s10-1 W) 
    (adjD s10-3 s11-3 N) (adjD s10-3 s9-3 S) (adjD s10-3 s10-4 E) (adjD s10-3 s10-2 W) 
    (adjD s10-4 s11-4 N) (adjD s10-4 s9-4 S) (adjD s10-4 s10-5 E) (adjD s10-4 s10-3 W) 
    (adjD s10-5 s11-5 N) (adjD s10-5 s9-5 S) (adjD s10-5 s10-6 E) (adjD s10-5 s10-4 W) 
    (adjD s10-6 s11-6 N) (adjD s10-6 s9-6 S) (adjD s10-6 s10-7 E) (adjD s10-6 s10-5 W) 
    (adjD s10-7 s11-7 N) (adjD s10-7 s9-7 S) (adjD s10-7 s10-8 E) (adjD s10-7 s10-6 W) 
    (adjD s10-8 s11-8 N) (adjD s10-8 s9-8 S) (adjD s10-8 s10-9 E) (adjD s10-8 s10-7 W) 
    (adjD s10-9 s11-9 N) (adjD s10-9 s9-9 S) (adjD s10-9 s10-10 E) (adjD s10-9 s10-8 W) 
    (adjD s10-10 s11-10 N) (adjD s10-10 s9-10 S) (adjD s10-10 s10-11 E) (adjD s10-10 s10-9 W) 
    (adjD s10-11 s11-11 N) (adjD s10-11 s9-11 S) (adjD s10-11 s10-12 E) (adjD s10-11 s10-10 W) 
    (adjD s10-12 s11-12 N) (adjD s10-12 s9-12 S) (adjD s10-12 s10-13 E) (adjD s10-12 s10-11 W) 
    (adjD s10-13 s11-13 N) (adjD s10-13 s9-13 S) (adjD s10-13 s10-14 E) (adjD s10-13 s10-12 W) 
    (adjD s10-14 s11-14 N) (adjD s10-14 s9-14 S) (adjD s10-14 s10-15 E) (adjD s10-14 s10-13 W) 
    (adjD s10-15 s11-15 N) (adjD s10-15 s9-15 S) (adjD s10-15 s10-14 W) 
    (adjD s11-0 s12-0 N) (adjD s11-0 s10-0 S) (adjD s11-0 s11-1 E) 
    (adjD s11-1 s12-1 N) (adjD s11-1 s10-1 S) (adjD s11-1 s11-2 E) (adjD s11-1 s11-0 W) 
    (adjD s11-2 s12-2 N) (adjD s11-2 s10-2 S) (adjD s11-2 s11-3 E) (adjD s11-2 s11-1 W) 
    (adjD s11-3 s12-3 N) (adjD s11-3 s10-3 S) (adjD s11-3 s11-4 E) (adjD s11-3 s11-2 W) 
    (adjD s11-4 s12-4 N) (adjD s11-4 s10-4 S) (adjD s11-4 s11-5 E) (adjD s11-4 s11-3 W) 
    (adjD s11-5 s12-5 N) (adjD s11-5 s10-5 S) (adjD s11-5 s11-6 E) (adjD s11-5 s11-4 W) 
    (adjD s11-6 s12-6 N) (adjD s11-6 s10-6 S) (adjD s11-6 s11-7 E) (adjD s11-6 s11-5 W) 
    (adjD s11-7 s12-7 N) (adjD s11-7 s10-7 S) (adjD s11-7 s11-8 E) (adjD s11-7 s11-6 W) 
    (adjD s11-8 s12-8 N) (adjD s11-8 s10-8 S) (adjD s11-8 s11-9 E) (adjD s11-8 s11-7 W) 
    (adjD s11-9 s12-9 N) (adjD s11-9 s10-9 S) (adjD s11-9 s11-10 E) (adjD s11-9 s11-8 W) 
    (adjD s11-10 s12-10 N) (adjD s11-10 s10-10 S) (adjD s11-10 s11-11 E) (adjD s11-10 s11-9 W) 
    (adjD s11-11 s12-11 N) (adjD s11-11 s10-11 S) (adjD s11-11 s11-12 E) (adjD s11-11 s11-10 W) 
    (adjD s11-12 s12-12 N) (adjD s11-12 s10-12 S) (adjD s11-12 s11-13 E) (adjD s11-12 s11-11 W) 
    (adjD s11-13 s12-13 N) (adjD s11-13 s10-13 S) (adjD s11-13 s11-14 E) (adjD s11-13 s11-12 W) 
    (adjD s11-14 s12-14 N) (adjD s11-14 s10-14 S) (adjD s11-14 s11-15 E) (adjD s11-14 s11-13 W) 
    (adjD s11-15 s12-15 N) (adjD s11-15 s10-15 S) (adjD s11-15 s11-14 W) 
    (adjD s12-0 s13-0 N) (adjD s12-0 s11-0 S) (adjD s12-0 s12-1 E) 
    (adjD s12-1 s13-1 N) (adjD s12-1 s11-1 S) (adjD s12-1 s12-2 E) (adjD s12-1 s12-0 W) 
    (adjD s12-2 s13-2 N) (adjD s12-2 s11-2 S) (adjD s12-2 s12-3 E) (adjD s12-2 s12-1 W) 
    (adjD s12-3 s13-3 N) (adjD s12-3 s11-3 S) (adjD s12-3 s12-4 E) (adjD s12-3 s12-2 W) 
    (adjD s12-4 s13-4 N) (adjD s12-4 s11-4 S) (adjD s12-4 s12-5 E) (adjD s12-4 s12-3 W) 
    (adjD s12-5 s13-5 N) (adjD s12-5 s11-5 S) (adjD s12-5 s12-6 E) (adjD s12-5 s12-4 W) 
    (adjD s12-6 s13-6 N) (adjD s12-6 s11-6 S) (adjD s12-6 s12-7 E) (adjD s12-6 s12-5 W) 
    (adjD s12-7 s13-7 N) (adjD s12-7 s11-7 S) (adjD s12-7 s12-8 E) (adjD s12-7 s12-6 W) 
    (adjD s12-8 s13-8 N) (adjD s12-8 s11-8 S) (adjD s12-8 s12-9 E) (adjD s12-8 s12-7 W) 
    (adjD s12-9 s13-9 N) (adjD s12-9 s11-9 S) (adjD s12-9 s12-10 E) (adjD s12-9 s12-8 W) 
    (adjD s12-10 s13-10 N) (adjD s12-10 s11-10 S) (adjD s12-10 s12-11 E) (adjD s12-10 s12-9 W) 
    (adjD s12-11 s13-11 N) (adjD s12-11 s11-11 S) (adjD s12-11 s12-12 E) (adjD s12-11 s12-10 W) 
    (adjD s12-12 s13-12 N) (adjD s12-12 s11-12 S) (adjD s12-12 s12-13 E) (adjD s12-12 s12-11 W) 
    (adjD s12-13 s13-13 N) (adjD s12-13 s11-13 S) (adjD s12-13 s12-14 E) (adjD s12-13 s12-12 W) 
    (adjD s12-14 s13-14 N) (adjD s12-14 s11-14 S) (adjD s12-14 s12-15 E) (adjD s12-14 s12-13 W) 
    (adjD s12-15 s13-15 N) (adjD s12-15 s11-15 S) (adjD s12-15 s12-14 W) 
    (adjD s13-0 s14-0 N) (adjD s13-0 s12-0 S) (adjD s13-0 s13-1 E) 
    (adjD s13-1 s14-1 N) (adjD s13-1 s12-1 S) (adjD s13-1 s13-2 E) (adjD s13-1 s13-0 W) 
    (adjD s13-2 s14-2 N) (adjD s13-2 s12-2 S) (adjD s13-2 s13-3 E) (adjD s13-2 s13-1 W) 
    (adjD s13-3 s14-3 N) (adjD s13-3 s12-3 S) (adjD s13-3 s13-4 E) (adjD s13-3 s13-2 W) 
    (adjD s13-4 s14-4 N) (adjD s13-4 s12-4 S) (adjD s13-4 s13-5 E) (adjD s13-4 s13-3 W) 
    (adjD s13-5 s14-5 N) (adjD s13-5 s12-5 S) (adjD s13-5 s13-6 E) (adjD s13-5 s13-4 W) 
    (adjD s13-6 s14-6 N) (adjD s13-6 s12-6 S) (adjD s13-6 s13-7 E) (adjD s13-6 s13-5 W) 
    (adjD s13-7 s14-7 N) (adjD s13-7 s12-7 S) (adjD s13-7 s13-8 E) (adjD s13-7 s13-6 W) 
    (adjD s13-8 s14-8 N) (adjD s13-8 s12-8 S) (adjD s13-8 s13-9 E) (adjD s13-8 s13-7 W) 
    (adjD s13-9 s14-9 N) (adjD s13-9 s12-9 S) (adjD s13-9 s13-10 E) (adjD s13-9 s13-8 W) 
    (adjD s13-10 s14-10 N) (adjD s13-10 s12-10 S) (adjD s13-10 s13-11 E) (adjD s13-10 s13-9 W) 
    (adjD s13-11 s14-11 N) (adjD s13-11 s12-11 S) (adjD s13-11 s13-12 E) (adjD s13-11 s13-10 W) 
    (adjD s13-12 s14-12 N) (adjD s13-12 s12-12 S) (adjD s13-12 s13-13 E) (adjD s13-12 s13-11 W) 
    (adjD s13-13 s14-13 N) (adjD s13-13 s12-13 S) (adjD s13-13 s13-14 E) (adjD s13-13 s13-12 W) 
    (adjD s13-14 s14-14 N) (adjD s13-14 s12-14 S) (adjD s13-14 s13-15 E) (adjD s13-14 s13-13 W) 
    (adjD s13-15 s14-15 N) (adjD s13-15 s12-15 S) (adjD s13-15 s13-14 W) 
    (adjD s14-0 s15-0 N) (adjD s14-0 s13-0 S) (adjD s14-0 s14-1 E) 
    (adjD s14-1 s15-1 N) (adjD s14-1 s13-1 S) (adjD s14-1 s14-2 E) (adjD s14-1 s14-0 W) 
    (adjD s14-2 s15-2 N) (adjD s14-2 s13-2 S) (adjD s14-2 s14-3 E) (adjD s14-2 s14-1 W) 
    (adjD s14-3 s15-3 N) (adjD s14-3 s13-3 S) (adjD s14-3 s14-4 E) (adjD s14-3 s14-2 W) 
    (adjD s14-4 s15-4 N) (adjD s14-4 s13-4 S) (adjD s14-4 s14-5 E) (adjD s14-4 s14-3 W) 
    (adjD s14-5 s15-5 N) (adjD s14-5 s13-5 S) (adjD s14-5 s14-6 E) (adjD s14-5 s14-4 W) 
    (adjD s14-6 s15-6 N) (adjD s14-6 s13-6 S) (adjD s14-6 s14-7 E) (adjD s14-6 s14-5 W) 
    (adjD s14-7 s15-7 N) (adjD s14-7 s13-7 S) (adjD s14-7 s14-8 E) (adjD s14-7 s14-6 W) 
    (adjD s14-8 s15-8 N) (adjD s14-8 s13-8 S) (adjD s14-8 s14-9 E) (adjD s14-8 s14-7 W) 
    (adjD s14-9 s15-9 N) (adjD s14-9 s13-9 S) (adjD s14-9 s14-10 E) (adjD s14-9 s14-8 W) 
    (adjD s14-10 s15-10 N) (adjD s14-10 s13-10 S) (adjD s14-10 s14-11 E) (adjD s14-10 s14-9 W) 
    (adjD s14-11 s15-11 N) (adjD s14-11 s13-11 S) (adjD s14-11 s14-12 E) (adjD s14-11 s14-10 W) 
    (adjD s14-12 s15-12 N) (adjD s14-12 s13-12 S) (adjD s14-12 s14-13 E) (adjD s14-12 s14-11 W) 
    (adjD s14-13 s15-13 N) (adjD s14-13 s13-13 S) (adjD s14-13 s14-14 E) (adjD s14-13 s14-12 W) 
    (adjD s14-14 s15-14 N) (adjD s14-14 s13-14 S) (adjD s14-14 s14-15 E) (adjD s14-14 s14-13 W) 
    (adjD s14-15 s15-15 N) (adjD s14-15 s13-15 S) (adjD s14-15 s14-14 W) 
    (adjD s15-0 s14-0 S) (adjD s15-0 s15-1 E) 
    (adjD s15-1 s14-1 S) (adjD s15-1 s15-2 E) (adjD s15-1 s15-0 W) 
    (adjD s15-2 s14-2 S) (adjD s15-2 s15-3 E) (adjD s15-2 s15-1 W) 
    (adjD s15-3 s14-3 S) (adjD s15-3 s15-4 E) (adjD s15-3 s15-2 W) 
    (adjD s15-4 s14-4 S) (adjD s15-4 s15-5 E) (adjD s15-4 s15-3 W) 
    (adjD s15-5 s14-5 S) (adjD s15-5 s15-6 E) (adjD s15-5 s15-4 W) 
    (adjD s15-6 s14-6 S) (adjD s15-6 s15-7 E) (adjD s15-6 s15-5 W) 
    (adjD s15-7 s14-7 S) (adjD s15-7 s15-8 E) (adjD s15-7 s15-6 W) 
    (adjD s15-8 s14-8 S) (adjD s15-8 s15-9 E) (adjD s15-8 s15-7 W) 
    (adjD s15-9 s14-9 S) (adjD s15-9 s15-10 E) (adjD s15-9 s15-8 W) 
    (adjD s15-10 s14-10 S) (adjD s15-10 s15-11 E) (adjD s15-10 s15-9 W) 
    (adjD s15-11 s14-11 S) (adjD s15-11 s15-12 E) (adjD s15-11 s15-10 W) 
    (adjD s15-12 s14-12 S) (adjD s15-12 s15-13 E) (adjD s15-12 s15-11 W) 
    (adjD s15-13 s14-13 S) (adjD s15-13 s15-14 E) (adjD s15-13 s15-12 W) 
    (adjD s15-14 s14-14 S) (adjD s15-14 s15-15 E) (adjD s15-14 s15-13 W) 
    (adjD s15-15 s14-15 S) (adjD s15-15 s15-14 W) 

    (at s0-0) (facing E)

    (isNotPit s0-0) (isNotPit s0-2) (isNotPit s0-3) (isNotPit s0-4) (isNotPit s0-5) (isNotPit s0-6) (isNotPit s0-7) (isNotPit s0-8) (isNotPit s0-9) (isNotPit s0-10) (isNotPit s0-11) (isNotPit s0-12) (isNotPit s0-13) (isNotPit s0-14) 
    (isNotPit s1-0) (isNotPit s1-1) (isNotPit s1-2) (isNotPit s1-3) (isNotPit s1-4) (isNotPit s1-5) (isNotPit s1-6) (isNotPit s1-7) (isNotPit s1-10) (isNotPit s1-11) (isNotPit s1-12) (isNotPit s1-13) (isNotPit s1-14) (isNotPit s1-15) 
    (isNotPit s2-0) (isNotPit s2-1) (isNotPit s2-2) (isNotPit s2-3) (isNotPit s2-4) (isNotPit s2-5) (isNotPit s2-6) (isNotPit s2-7) (isNotPit s2-8) (isNotPit s2-10) (isNotPit s2-11) (isNotPit s2-12) (isNotPit s2-13) (isNotPit s2-14) (isNotPit s2-15) 
    (isNotPit s3-0) (isNotPit s3-1) (isNotPit s3-2) (isNotPit s3-3) (isNotPit s3-4) (isNotPit s3-5) (isNotPit s3-6) (isNotPit s3-8) (isNotPit s3-9) (isNotPit s3-11) (isNotPit s3-12) (isNotPit s3-13) (isNotPit s3-14) (isNotPit s3-15) 
    (isNotPit s4-0) (isNotPit s4-1) (isNotPit s4-2) (isNotPit s4-3) (isNotPit s4-4) (isNotPit s4-5) (isNotPit s4-6) (isNotPit s4-7) (isNotPit s4-8) (isNotPit s4-9) (isNotPit s4-10) (isNotPit s4-11) (isNotPit s4-12) (isNotPit s4-14) (isNotPit s4-15) 
    (isNotPit s5-0) (isNotPit s5-1) (isNotPit s5-2) (isNotPit s5-3) (isNotPit s5-4) (isNotPit s5-5) (isNotPit s5-6) (isNotPit s5-7) (isNotPit s5-8) (isNotPit s5-9) (isNotPit s5-10) (isNotPit s5-11) (isNotPit s5-12) (isNotPit s5-14) (isNotPit s5-15) 
    (isNotPit s6-0) (isNotPit s6-1) (isNotPit s6-2) (isNotPit s6-3) (isNotPit s6-4) (isNotPit s6-5) (isNotPit s6-6) (isNotPit s6-7) (isNotPit s6-9) (isNotPit s6-10) (isNotPit s6-11) (isNotPit s6-12) (isNotPit s6-13) (isNotPit s6-14) (isNotPit s6-15) 
    (isNotPit s7-0) (isNotPit s7-1) (isNotPit s7-2) (isNotPit s7-4) (isNotPit s7-5) (isNotPit s7-6) (isNotPit s7-7) (isNotPit s7-8) (isNotPit s7-9) (isNotPit s7-11) (isNotPit s7-12) (isNotPit s7-13) (isNotPit s7-15) 
    (isNotPit s8-0) (isNotPit s8-1) (isNotPit s8-3) (isNotPit s8-4) (isNotPit s8-5) (isNotPit s8-7) (isNotPit s8-9) (isNotPit s8-10) (isNotPit s8-11) (isNotPit s8-12) (isNotPit s8-13) (isNotPit s8-14) (isNotPit s8-15) 
    (isNotPit s9-0) (isNotPit s9-1) (isNotPit s9-3) (isNotPit s9-4) (isNotPit s9-5) (isNotPit s9-6) (isNotPit s9-7) (isNotPit s9-8) (isNotPit s9-9) (isNotPit s9-10) (isNotPit s9-11) (isNotPit s9-12) (isNotPit s9-13) (isNotPit s9-14) (isNotPit s9-15) 
    (isNotPit s10-2) (isNotPit s10-3) (isNotPit s10-5) (isNotPit s10-7) (isNotPit s10-10) (isNotPit s10-11) (isNotPit s10-12) (isNotPit s10-13) (isNotPit s10-14) (isNotPit s10-15) 
    (isNotPit s11-0) (isNotPit s11-1) (isNotPit s11-2) (isNotPit s11-4) (isNotPit s11-5) (isNotPit s11-6) (isNotPit s11-7) (isNotPit s11-8) (isNotPit s11-9) (isNotPit s11-10) (isNotPit s11-11) (isNotPit s11-12) (isNotPit s11-13) (isNotPit s11-14) (isNotPit s11-15) 
    (isNotPit s12-0) (isNotPit s12-1) (isNotPit s12-2) (isNotPit s12-3) (isNotPit s12-4) (isNotPit s12-5) (isNotPit s12-6) (isNotPit s12-7) (isNotPit s12-8) (isNotPit s12-10) (isNotPit s12-11) (isNotPit s12-12) (isNotPit s12-13) (isNotPit s12-14) (isNotPit s12-15) 
    (isNotPit s13-0) (isNotPit s13-1) (isNotPit s13-2) (isNotPit s13-3) (isNotPit s13-4) (isNotPit s13-5) (isNotPit s13-6) (isNotPit s13-7) (isNotPit s13-9) (isNotPit s13-10) (isNotPit s13-11) (isNotPit s13-12) (isNotPit s13-14) (isNotPit s13-15) 
    (isNotPit s14-0) (isNotPit s14-1) (isNotPit s14-2) (isNotPit s14-3) (isNotPit s14-5) (isNotPit s14-6) (isNotPit s14-7) (isNotPit s14-10) (isNotPit s14-11) (isNotPit s14-12) (isNotPit s14-13) (isNotPit s14-15) 
    (isNotPit s15-0) (isNotPit s15-1) (isNotPit s15-2) (isNotPit s15-3) (isNotPit s15-4) (isNotPit s15-5) (isNotPit s15-6) (isNotPit s15-7) (isNotPit s15-8) (isNotPit s15-9) (isNotPit s15-10) (isNotPit s15-11) (isNotPit s15-12) (isNotPit s15-13) (isNotPit s15-15) 

    (isNotWumpus s0-0) (isNotWumpus s0-1) (isNotWumpus s0-2) (isNotWumpus s0-3) (isNotWumpus s0-4) (isNotWumpus s0-5) (isNotWumpus s0-6) (isNotWumpus s0-7) (isNotWumpus s0-8) (isNotWumpus s0-9) (isNotWumpus s0-10) (isNotWumpus s0-11) (isNotWumpus s0-12) (isNotWumpus s0-13) (isNotWumpus s0-14) (isWumpus    s0-15) 
    (isNotWumpus s1-0) (isNotWumpus s1-1) (isNotWumpus s1-2) (isNotWumpus s1-3) (isNotWumpus s1-4) (isWumpus    s1-5) (isNotWumpus s1-6) (isNotWumpus s1-7) (isNotWumpus s1-8) (isNotWumpus s1-9) (isNotWumpus s1-10) (isNotWumpus s1-11) (isNotWumpus s1-12) (isNotWumpus s1-13) (isNotWumpus s1-14) (isNotWumpus s1-15) 
    (isNotWumpus s2-0) (isNotWumpus s2-1) (isNotWumpus s2-2) (isNotWumpus s2-3) (isNotWumpus s2-4) (isNotWumpus s2-5) (isNotWumpus s2-6) (isNotWumpus s2-7) (isNotWumpus s2-8) (isNotWumpus s2-9) (isNotWumpus s2-10) (isNotWumpus s2-11) (isNotWumpus s2-12) (isWumpus    s2-13) (isNotWumpus s2-14) (isNotWumpus s2-15) 
    (isNotWumpus s3-0) (isNotWumpus s3-1) (isNotWumpus s3-2) (isNotWumpus s3-3) (isNotWumpus s3-4) (isNotWumpus s3-5) (isNotWumpus s3-6) (isNotWumpus s3-7) (isNotWumpus s3-8) (isNotWumpus s3-9) (isNotWumpus s3-10) (isNotWumpus s3-11) (isNotWumpus s3-12) (isNotWumpus s3-13) (isNotWumpus s3-14) (isNotWumpus s3-15) 
    (isNotWumpus s4-0) (isNotWumpus s4-1) (isNotWumpus s4-2) (isNotWumpus s4-3) (isNotWumpus s4-4) (isNotWumpus s4-5) (isNotWumpus s4-6) (isNotWumpus s4-7) (isNotWumpus s4-8) (isNotWumpus s4-9) (isNotWumpus s4-10) (isNotWumpus s4-11) (isNotWumpus s4-12) (isNotWumpus s4-13) (isWumpus    s4-14) (isNotWumpus s4-15) 
    (isNotWumpus s5-0) (isNotWumpus s5-1) (isNotWumpus s5-2) (isNotWumpus s5-3) (isNotWumpus s5-4) (isNotWumpus s5-5) (isNotWumpus s5-6) (isNotWumpus s5-7) (isNotWumpus s5-8) (isNotWumpus s5-9) (isNotWumpus s5-10) (isNotWumpus s5-11) (isNotWumpus s5-12) (isNotWumpus s5-13) (isNotWumpus s5-14) (isNotWumpus s5-15) 
    (isNotWumpus s6-0) (isWumpus    s6-1) (isNotWumpus s6-2) (isNotWumpus s6-3) (isWumpus    s6-4) (isNotWumpus s6-5) (isWumpus    s6-6) (isNotWumpus s6-7) (isNotWumpus s6-8) (isNotWumpus s6-9) (isNotWumpus s6-10) (isNotWumpus s6-11) (isNotWumpus s6-12) (isNotWumpus s6-13) (isNotWumpus s6-14) (isNotWumpus s6-15) 
    (isNotWumpus s7-0) (isNotWumpus s7-1) (isNotWumpus s7-2) (isWumpus    s7-3) (isNotWumpus s7-4) (isNotWumpus s7-5) (isNotWumpus s7-6) (isWumpus    s7-7) (isNotWumpus s7-8) (isNotWumpus s7-9) (isNotWumpus s7-10) (isNotWumpus s7-11) (isNotWumpus s7-12) (isNotWumpus s7-13) (isNotWumpus s7-14) (isNotWumpus s7-15) 
    (isNotWumpus s8-0) (isNotWumpus s8-1) (isNotWumpus s8-2) (isNotWumpus s8-3) (isNotWumpus s8-4) (isWumpus    s8-5) (isNotWumpus s8-6) (isNotWumpus s8-7) (isNotWumpus s8-8) (isNotWumpus s8-9) (isNotWumpus s8-10) (isNotWumpus s8-11) (isNotWumpus s8-12) (isNotWumpus s8-13) (isNotWumpus s8-14) (isNotWumpus s8-15) 
    (isNotWumpus s9-0) (isNotWumpus s9-1) (isNotWumpus s9-2) (isNotWumpus s9-3) (isNotWumpus s9-4) (isNotWumpus s9-5) (isNotWumpus s9-6) (isNotWumpus s9-7) (isNotWumpus s9-8) (isNotWumpus s9-9) (isNotWumpus s9-10) (isNotWumpus s9-11) (isNotWumpus s9-12) (isNotWumpus s9-13) (isNotWumpus s9-14) (isNotWumpus s9-15) 
    (isNotWumpus s10-0) (isNotWumpus s10-1) (isNotWumpus s10-2) (isNotWumpus s10-3) (isNotWumpus s10-4) (isNotWumpus s10-5) (isNotWumpus s10-6) (isNotWumpus s10-7) (isNotWumpus s10-8) (isNotWumpus s10-9) (isNotWumpus s10-10) (isNotWumpus s10-11) (isNotWumpus s10-12) (isNotWumpus s10-13) (isNotWumpus s10-14) (isNotWumpus s10-15) 
    (isNotWumpus s11-0) (isNotWumpus s11-1) (isNotWumpus s11-2) (isNotWumpus s11-3) (isNotWumpus s11-4) (isNotWumpus s11-5) (isNotWumpus s11-6) (isNotWumpus s11-7) (isNotWumpus s11-8) (isNotWumpus s11-9) (isNotWumpus s11-10) (isNotWumpus s11-11) (isNotWumpus s11-12) (isNotWumpus s11-13) (isNotWumpus s11-14) (isNotWumpus s11-15) 
    (isNotWumpus s12-0) (isNotWumpus s12-1) (isNotWumpus s12-2) (isNotWumpus s12-3) (isNotWumpus s12-4) (isNotWumpus s12-5) (isNotWumpus s12-6) (isNotWumpus s12-7) (isWumpus    s12-8) (isNotWumpus s12-9) (isWumpus    s12-10) (isNotWumpus s12-11) (isWumpus    s12-12) (isNotWumpus s12-13) (isNotWumpus s12-14) (isWumpus    s12-15) 
    (isNotWumpus s13-0) (isNotWumpus s13-1) (isNotWumpus s13-2) (isNotWumpus s13-3) (isNotWumpus s13-4) (isNotWumpus s13-5) (isNotWumpus s13-6) (isNotWumpus s13-7) (isNotWumpus s13-8) (isNotWumpus s13-9) (isNotWumpus s13-10) (isNotWumpus s13-11) (isWumpus    s13-12) (isNotWumpus s13-13) (isNotWumpus s13-14) (isWumpus    s13-15) 
    (isNotWumpus s14-0) (isNotWumpus s14-1) (isNotWumpus s14-2) (isNotWumpus s14-3) (isNotWumpus s14-4) (isNotWumpus s14-5) (isNotWumpus s14-6) (isNotWumpus s14-7) (isNotWumpus s14-8) (isNotWumpus s14-9) (isNotWumpus s14-10) (isNotWumpus s14-11) (isNotWumpus s14-12) (isNotWumpus s14-13) (isNotWumpus s14-14) (isNotWumpus s14-15) 
    (isNotWumpus s15-0) (isNotWumpus s15-1) (isNotWumpus s15-2) (isNotWumpus s15-3) (isNotWumpus s15-4) (isNotWumpus s15-5) (isNotWumpus s15-6) (isNotWumpus s15-7) (isNotWumpus s15-8) (isNotWumpus s15-9) (isNotWumpus s15-10) (isNotWumpus s15-11) (isNotWumpus s15-12) (isNotWumpus s15-13) (isNotWumpus s15-14) (isNotWumpus s15-15) 

    (isGoldLocation s15-15) 

 );end init

 (:goal (and(has-Gold)) )

);end define


; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     | P   |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     | G   |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     | P   |     |     |     | P   | P   |     |     |     |     | P   |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     | P   |     |     |     |   W | P   |     |   W |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     |   W | P   |   W |     |   W |     |     |   W |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     | P   |     |     |     |     |     |     |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;| P   | P   |     |     | P   |     | P   |     | P   | P   |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     | P   |     |     |     |     |     |     |     |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     | P   |     |     |   W | P   |     | P   |     |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     | P W |     |     |     |   W |     |     | P   |     |     |     | P   |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |   W |     |     |   W |     |   W |     | P   |     |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     |     |     |     |     |     | P   |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     |     |     |     |     |     | P   |   W |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     | P   |     |     | P   |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |     |     |     |     | P   |     |     |     |   W |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     |     |     |     |     |   W |     |     | P   | P   |     |     |     |     |     |     |
;|     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------
;|     | P   |     |     |     |     |     |     |     |     |     |     |     |     |     | P W |
;|   > |     |     |     |     |     |     |     |     |     |     |     |     |     |     |     |
; -----------------------------------------------------------------------------------------------


