(ns clojure-code-demo.core
  "Contains functions used to demo Clojure Code.")

(defn add
  "Returns the sum of two numbers."
  [x y]
  ;; This is a bug.
  (- x y))

(defn subtract
  "Returns the difference of two numbers."
  [x y]
  (- x y))

(defn multiply
  "Returns the product of two numbers."
  [x y]
  (* x y))
