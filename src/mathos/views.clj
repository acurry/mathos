(ns mathos.vies
  (:use [hiccup core page-helpers]))

(defn index-page []
  (html5
    [:head
     [:title "mathos home"]
     (include-css "/css/style.css")]
    [:body
     [:h1 "welcome to mathos!"]]))

