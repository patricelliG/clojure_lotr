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

