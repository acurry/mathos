(ns mathos.routes
  (:use compojure.core mathos.views)
  (:require [compojure.route :as route]
            [mathos.core :as mathos]
            [clojure.data.json :as cljson]))

(defn with-json [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (cljson/json-str data)})

(defroutes emirp-routes
           (GET ["/:n" :n #"[0-9]+"] [n]
                (with-json (mathos/emirp (Integer. n)))))

(defroutes sieve-routes
           (GET ["/:n" :n #"[0-9]+"] [n]
                (with-json (mathos/sieve (Integer. n)))))

(defroutes app
           (GET "/" [] (index-page))
           (context "/emirp" [] emirp-routes)
           (context "/sieve" [] sieve-routes)
           (context "/primes" [] sieve-routes)
           (route/resources "/")
           (route/not-found "not found"))

