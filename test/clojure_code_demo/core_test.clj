(ns clojure-code-demo.core-test
  (:require [clojure.test :refer :all]
            [clojure-code-demo.core :refer :all]))

;; This test fails
(deftest add-test
  (testing "Add two numbers"
    ;; Slow things down so we can see progess in the status bar.
    (Thread/sleep 1000)
    (is (= 4 (add 1 3)))))

;; This test passes
(deftest subtract-test
  (testing "Subtract two numbers"
    ;; Slow things down so we can see progess in the status bar.
    (Thread/sleep 2000)
    (is (= 4 (- 5 1)))))

;; This test gets an error
(deftest multiply-test
  (testing "Multiply two numbers"
    ;; Slow things down so we can see progess in the status bar.
    (Thread/sleep 3000)
    (is (= 4 (2 2)))))
