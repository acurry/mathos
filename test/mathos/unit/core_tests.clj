(ns mathos.unit.core-tests
  (:use midje.sweet
        mathos.core))

(facts "About mathos.core"
       (emirp ..n..) => ..a..
       (provided
         (mathos.emirp/emirp ..n..) => ..a.. :times 1)

       (kaprekar ..n..) => ..a..
       (provided
         (mathos.kaprekar/kaprekar ..n..) => ..a.. :times 1)

       (sieve ..n..) => ..a..
       (provided
         (mathos.sieve/sieve ..n..) => ..a.. :times 1)

       (fib ..n..) => ..a..
       (provided
         (mathos.fib/fib-seq ..n..) => ..a.. :times 1)

       (quadratic ..a.. ..b.. ..c..) => ..q.. 
       (provided
         (mathos.quadratic/quadratic ..a.. ..b.. ..c..) => ..q.. :times 1)

       (factorial ..n..) => ..a..
       (provided
         (mathos.factorial/factorial ..n..) => ..a.. :times 1))

