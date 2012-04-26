(ns rpn)
; Reverse Polish Notation
; given:  3 + 4
; return: 3 4 +

(defn make-rpn [expr]
  "Return a Reverse-Polish Notation (RPN) form of expr.
   (make-rpn '(1 2 3)) -> (1 3 2)"
  (seq [(nth expr 0) (nth expr 2) (nth expr 1)]))

(defn make-full-rpn [expr]
  "Return an RPN form of expr by recurring through expr."
  (loop [monad (make-rpn (take 3 expr)) ret ()]
         (if (empty? expr) ret
           (recur (take 3 expr) (rest expr)))))
