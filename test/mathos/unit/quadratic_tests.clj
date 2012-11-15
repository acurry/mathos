(ns mathos.unit.quadratic-tests
  (:use midje.sweet
        mathos.quadratic))

(facts "About negate"
  (negate 1) => -1
  (negate -1) => 1)

(facts "About discriminant"
  (discriminant 1 4 4) => 0
  (discriminant 1 -4 -4) => 32
  (discriminant 2 6 8) => -28)

(facts "About quadratic*"
  (quadratic* 1 4 4 +) => -2
  (quadratic* 1 4 4 -) => -2
  (quadratic* 1 -4 4 +) => 2
  (quadratic* 1 -6 9 +) => 3
  (quadratic* 1 -6 9 -) => 3)

(against-background [(quadratic* ..a.. ..b.. ..c.. +) => ..pos.. :times 1
                     (quadratic* ..a.. ..b.. ..c.. -) => ..neg.. :times 1]
  (facts "About quadratic"
    (quadratic ..a.. ..b.. ..c..) => [..pos.. ..neg..]))
