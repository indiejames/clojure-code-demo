(ns user
  "Defines helper functions for starting and stopping the application from the REPL."
  (:require
   [clojure.tools.namespace.repl :as repl]))

(defn start
  ;; In a real application this would actually start something.
  []
  (println "Start completed"))

(defn reset []
  (repl/refresh :after 'user/start))

(println "Custom user.clj loaded.")