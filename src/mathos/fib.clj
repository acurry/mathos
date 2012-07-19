(ns mathos.fib)

(def ^{:private true} fib 
  (lazy-cat [0 1]
            (map +'  ; auto-cast integer to BigInt using +'
                 fib
                 (rest fib))))

(defn fib-seq [max]
  (take max fib))
