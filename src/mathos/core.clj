(ns mathos.core
  (:require [mathos.emirp :as e])
  (:require [mathos.kaprekar :as k])
  (:require [mathos.sieve :as s])
  (:require [mathos.fib :as f]))

(defn emirp [n] 
  (e/emirp n))

(defn kaprekar [n]
  (k/kaprekar n))

(defn sieve [n]
  (s/sieve n))

(defn fib [n]
  (f/fib-seq n))
