(ns get-a-haircut-and-a-real-job.core)

(defn home []
  (print "[H"))

(defn clear []
  (print "[2J"))

(defn position [x y]
  (printf "[%s;%sH" y x))

