(ns mathos.emirp
  (:require [mathos.sieve :as s]))

(defn in?
  [seq elm]
  (some #(= elm %) seq))

(defn to-numeric-palindrome
  "Returns a number's reversed digits as an Integer."
  [x]
  (Integer. (apply str (reverse (str x)))))

(defn emirp
  "Return a list of 'emirp' primes; primes whose reverse forms
  are primes, but are not palindromes."
  [upperBound]
  (let
    [primes (s/sieve upperBound)]
    (filter
      (fn [x]
        (and
          (not (s/palindromic? x))
          (in? primes (to-numeric-palindrome x))
          )
        ) primes
      )
    )
  )

