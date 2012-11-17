(ns mathos.views
  (:use hiccup.core hiccup.page))

(defn index-page []
  (html
    [:head
     [:title "mathos home"]
     (include-css "/css/style.css")]
    [:body
     [:h1 "welcome to mathos!"]
     [:h2 [:a {:href "/docs.html"} "docs"]]]))

