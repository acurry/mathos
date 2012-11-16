(ns mathos.factorial)

(defn factorial
  "Computes factorial of n, an integer."
  ([n] (factorial n 1N))
  ([n aux] (if (= n 0) aux (recur (dec n) (* aux n)))))

(defn fact-places
  "Computes the base-10 magnitude of a factorial."
  ([n] (count (str (factorial n)))))
