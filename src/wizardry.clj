# Written by Gary Patricelli
# On or about 04/04/2014
# For CSC 435

(use '[clojure.string])

(def fellowship [{:name "Frodo", :race "Hobbit"} {:name "Sam", :race "Hobbit"} 
                 {:name "Pippin", :race "Hobbit"} {:name "Merry", :race"Hobbit"} 
                 {:name "Gandalf", :race "Wizard"} {:name "Aragorn", :race "Man"} 
                 {:name "Boromir", :race "Man"} {:name "Gimli", :race"Dwarf"} {:name "Legolas", :race "Elf"}])

;; 2.1
(def name_lengths (map count company)) 

;; 2.2
(def sum_lengths (reduce + name_lengths))

;; 2.3
(def long_names_map (filter #(> (count (% :name)) 5) fellowship))

;; 2.4
(def long_names (map :name (filter #(> (count (% :name)) 5) fellowship)))

;; 2.5
(defn makeStr  [chars] (apply str chars))
(defn get_first [word] (capitalize (makeStr (rest word))))
(defn get_last [word] (first word))
(defn latinify "Converts the given word to pig latin." [word] (str (get_first word) "-" (get_last word) "ay" ))
(def hidden_names (map latinify (map :name fellowship)))

