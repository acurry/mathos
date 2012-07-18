(ns mathos.routes
  (:use compojure.core mathos.views)
  (:require [compojure.route :as route]))

(defroutes app
           (GET "/" [] (index-page))
           (route/resources "/")
           (route/not-found "not found"))

