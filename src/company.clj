(def hello "Hello Middle Earth!")

;; 1.1
(def dwarves (vec '("Thorin", "Balin", "Bilfur", "Bofur", "Bombur", "Dori", "Dwalin", "Fili", "Gloin", "Kili", "Nori" "Oin", "Ori")))

;; 1.2
(def leader (first dwarves))
(def company (rest dwarves))

;; 1.3
(def full_company (conj dwarves "Bilbo"))

;; 1.4 
(def locations (vec '(
                      {:loc "The Shire" :temp 74}
                      {:loc "The Misty Mountians" :temp 12}
                      {:loc "Fangorn Forest" :temp 58}
                      {:loc "Mordor" :temp 117}
                      {:loc "Rivendell" :temp 71})))

;; 1.5 NEEDS WORK
(def warm_locations (filter #(> (% :temp) 70) locations))


