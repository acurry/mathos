(ns mathos.routes
  (:use compojure.core mathos.views)
  (:require [compojure.route :as route]
            [mathos.core :as mathos]
            [clojure.data.json :as cljson]))

(defn with-json [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (cljson/json-str data)})

(defn gogo
  [f n]
  (with-json (apply f (map #(Integer. %) n))))

(defroutes emirp-routes
           (GET ["/:n" :n #"[0-9]+"] [n]
                (gogo mathos/emirp [n])))

(defroutes sieve-routes
           (GET ["/:n" :n #"[0-9]+"] [n]
                (gogo mathos/sieve [n])))

(defroutes kaprekar-routes
           (GET ["/:n" :n #"[0-9]{4}"] [n]
                (gogo mathos/kaprekar [n])))

(defroutes factorial-routes
           (GET ["/:n" :n #"[0-9]{1,4}"] [n]
                (gogo mathos/factorial [n])))

(defroutes quadratic-routes
           (GET "/:a/:b/:c" [a b c]
                (gogo mathos/quadratic [a b c])))

(defroutes fib-routes
           (GET ["/:n" :n #"[0-9]+"] [n]
                (gogo mathos/fib n)))

(defroutes app
           (GET "/" [] (index-page))
           (context "/emirp" [] emirp-routes)
           (context "/sieve" [] sieve-routes)
           (context "/primes" [] sieve-routes)
           (context "/fib" [] fib-routes)
           (context "/fibonacci" [] fib-routes)
           (context "/kaprekar" [] kaprekar-routes)
           (context "/factorial" [] factorial-routes)
           (context "/quadratic" [] quadratic-routes)
           (route/files "docs.html")
           (route/resources "/")
           (route/not-found "not found"))

