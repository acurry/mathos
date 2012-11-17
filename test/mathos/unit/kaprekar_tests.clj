(ns mathos.unit.kaprekar-tests
  (:use  midje.sweet
         mathos.kaprekar))

(facts "About kap"
       (kap 1234) => 3087
       (kap 1111) => 0
       (kap 1542) => 4176)

(facts "About kaprekar"
       (kaprekar 1234) => [3087 8352 6174]
       (kaprekar 1623) => [5085 7992 7173 6354 3087 8352 6174])

