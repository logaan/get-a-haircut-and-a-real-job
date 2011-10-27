(ns get-a-haircut-and-a-real-job.core
  (:use [clojure.contrib.shell]))

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
  (if (= input-char -1)
    (recur (.read *in*))
    (char input-char)))

(defn get-char []
  (sh "sh" "-c" "stty raw </dev/tty")
  (really-get-char (.read *in*))
  (sh "sh" "-c" "stty cooked </dev/tty"))

