(ns boot-cljs-multiple-builds.app
  (:require #_[re-frame.core :as core]
            #_[cljs.core.async     :as as]))

(defn init []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))
