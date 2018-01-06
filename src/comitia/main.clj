(ns comitia.main
  (:require [comitia.core :as core]
            [comitia.db :as db])
  (:gen-class))

(defn -main [& {:as args}]
  (db/migrate)
  (core/start-server
   :host (get args "host") :port (get args "port") :join? true))
