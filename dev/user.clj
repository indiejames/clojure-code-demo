(ns user
  "Defines helper functions for starting and stopping the application from the REPL."
  (:require
   [clojure.tools.namespace.repl :as repl]))

(defn start
  []
  (println "Start completed"))

(defn reset []
  (repl/refresh :after 'user/start))

(println "Custom user.clj loaded.")