# Written by Gary Patricelli
# On or about 04/04/2014
# For CSC 435

;; I dont understand what is going on here...
(defn three-towers [n a b c]
    (loop [n c b a] ;; This line in particular is wrong.
    (if (= n 1)
          (println (format "Move from %s to %s" a b))
          (do
                  (three-towers (dec n) a c b)
                  (println (format "Move from %s to %s" a b))
                  (recur (dec n) c b a)))))


