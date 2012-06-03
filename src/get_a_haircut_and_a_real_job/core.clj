(ns get-a-haircut-and-a-real-job.core
  (:use [clojure.contrib.shell]
        [clojure.pprint :only pprint]
        [clojure.java.io :only reader]))

(defn home []
  (print "[H"))

(defn clear []
  (print "[2J"))

(defn position [x y]
  (printf "[%s;%sH" y x))

(defn foreground-blue []
  (printf "[34m"))

(defn background-yellow []
  (printf "[43m"))

(defn reset-all-attributes []
  (printf "[0m"))

(defn really-get-char [input-char]
  (pprint input-char)
  (if (= input-char -1)
    (recur (.read *in*))
    (char input-char)))

(defn get-char []
  (sh "stty" "-f /dev/tty" "raw")
  ;(really-get-char (.read *in*))
  (pprint (.read (reader "/dev/tty")))
  (sh "stty" "-f /dev/tty" "cooked"))

