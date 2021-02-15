(ns acme-corp.red-squirrel.core
  (:require [acme-corp.red-squirrel.eating-nuts :as eating-nuts]
            [acme-corp.red-squirrel.jumping :as jumping]
            [acme-corp.red-squirrel.being-adorable :as being-adorable]
            [acme-corp.red-squirrel.ui :as ui]))

(defn init! []
  (println "Red Squirrel Initilized!")
  (eating-nuts/init!)
  (jumping/init!)
  (being-adorable/init!)
  (ui/init!))
