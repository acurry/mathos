(ns mathos.core
  (:require [mathos.emirp :as e]
            [mathos.kaprekar :as k]
            [mathos.sieve :as s]
            [mathos.quadratic :as q]
            [mathos.factorial :as f]
            [mathos.fib :as f]))

(defn emirp [n]
  (e/emirp n))

(defn kaprekar [n]
  (k/kaprekar n))

(defn sieve [n]
  (s/sieve n))

(defn fib [n]
  (f/fib-seq n))

(defn quadratic [a b c]
  (q/quadratic a b c))

(defn factorial [n]
  (f/factorial n))
