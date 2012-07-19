(ns mathos.fib)

(def ^{:private true} fib 
  (lazy-cat [0 1]
            (map +
                 fib
                 (rest fib))))

(defn fib-seq [max]
  (take max fib))
