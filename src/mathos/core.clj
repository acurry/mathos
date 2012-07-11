(ns mathos.core
	(:require [mathos.emirp :as e])
	(:require [mathos.kaprekar :as k])
	(:require [mathos.sieve :as s])
	(:require [mathos.rpn :as r]))

(defn kaprekar [n] (k/kaprekar n))
(defn emirp [n] (e/emirp n))
(defn sieve [n] (s/sieve n))

