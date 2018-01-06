(ns comitia.handler.main
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [comitia.util.response :as res]
            [comitia.view.main :as view]))

(defn home [req]
  (-> (view/home-view req)
      res/ok
      res/html))

(defroutes main-routes
  (GET "/" _ home)
  (route/not-found res/not-found!))
