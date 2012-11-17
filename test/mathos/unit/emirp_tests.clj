(ns mathos.unit.emirp-tests
  (:use midje.sweet
        mathos.emirp))

(facts "About in?"
       (in? [1] 1) => true)

(facts "About to-numeric-palindrome"
       (to-numeric-palindrome 1234) => 4321
       (to-numeric-palindrome 12) => 21)

(facts "About emirp"
       (emirp 100) => [13 17 31 37 71 73 79 97])

