(ns acme-corp.red-squirrel.core
  (:require
   [acme-corp.red-squirrel.jumping :as jumping]
   [acme-corp.red-squirrel.being-adorable :as being-adorable]
   [acme-corp.red-squirrel.ui :as ui]
   [acme-corp.shared.util.background-tasks :as background-tasks]))

(defn init! []
  (println "Red Squirrel Initilized!")
  (background-tasks/init!)
  (jumping/init!)
  (being-adorable/init!)
  (ui/init!))
