(ns dumb-clojure-app.core-test
  (:require [clojure.test :refer :all]
            [dumb-clojure-app.core :refer :all]))

(deftest a-test
    (is (= 1 1)))

(deftest another-test
  (is (= 2 (+ 1 1))))
