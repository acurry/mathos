(ns mathos.quadratic
  (:use [clojure.math.numeric-tower :only [sqrt]]))

(defn negate [n] (- 0 n))

(defn discriminant [a b c] (- (* b b) (* 4 a c)))

(defn quadratic* [a b c func]
  (/ (func (negate b) (sqrt (discriminant a b c))) (* 2 a)))

(defn quadratic [a b c]
  (conj []
    (quadratic* a b c +)
    (quadratic* a b c -)))
