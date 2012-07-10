(ns mathos.emirp
  (:require [mathos.sieve :as s]))

(defn in?
  [seq elm]
  (some #(= elm %) seq))

(defn to-numeric-palindrome
  "Returns a number's reversed digits as an Integer."
  [x]
  (Integer. (apply str (reverse (str x)))))

(defn is-emirp? [n]
  "Determines if number is an emirp."
  (and
    (not (s/palindromic? x))
    (in? primes (to-numeric-palindrome x))
    ))

(defn emirp
  "Return a list of 'emirp' primes; primes whose reverse forms
  are primes, but are not palindromes."
  [upperBound]
  (let
    [primes (s/sieve upperBound)]
    (filter
      (fn [x]
        (is-emirp? x) primes
      )
    )
  )

