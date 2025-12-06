(ns main.clojure.GrantAidenLists)

(declare member?)

;; member? -> atom * list -> boolean
(defn member?
  [atm lizt]
  (cond
    (empty? lizt) false
    (= atm (first lizt)) true
    :else (member? atm (rest lizt))))

;; my-append -> list * list -> list
#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
(defn my-append
  [lizt1 lizt2]
  (cond
    (empty? lizt1) lizt2
    :else (cons (first lizt1)
                (my-append (rest lizt1) lizt2))))

;; my-map -> (a -> b) * list -> list
#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
(defn my-map
  [fun lizt]
  (cond
    (empty? lizt) '()
    :else (cons (fun (first lizt))
                (my-map fun (rest lizt)))))

;; same? -> list * list -> boolean
#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
(defn same?
  [lizt1 lizt2]
  (cond
    (and (empty? lizt1) (empty? lizt2)) true
    (empty? lizt1) false
    (empty? lizt2) false
    (= (first lizt1) (first lizt2))
    (same? (rest lizt1) (rest lizt2))
    :else false))

;; intersect -> list * list -> list
#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
(defn intersect
  [lizt1 lizt2]
  (cond
    (empty? lizt1) '()
    (member? (first lizt1) lizt2)
    (cons (first lizt1)
          (intersect (rest lizt1) lizt2))
    :else
    (intersect (rest lizt1) lizt2)))
