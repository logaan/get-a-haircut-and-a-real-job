(ns get-a-haircut-and-a-real-job.test.core
  (:use [get-a-haircut-and-a-real-job.core])
  (:use [clojure.test]))

(deftest position-the-cursor
  (home)
  (clear)
  (position 35 12)
  (print "Hello world")
  (position 0 21))
