(defproject mathos "1.0.0-SNAPSHOT"
  :description "math tools as a compojure web service"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.1.1"]
                 [hiccup "0.3.7"]]
  :main mathos.core
  :ring {:handler mathos.routes/app})
