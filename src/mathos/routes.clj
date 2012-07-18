(ns mathos.routes
  (:use compojure.core
        mathos.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
           (GET "/" [] (index-page))
           (route/resources "/")
           (route/not-found "not found"))

(def app
  (-> 
    (handler/site main-routes)
    (wrap-base-url)))

