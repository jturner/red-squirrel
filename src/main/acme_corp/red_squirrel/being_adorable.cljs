(ns acme-corp.red-squirrel.being-adorable
  (:require [acme-corp.red-squirrel.eating-nuts :as eating-nuts]
            [acme-corp.red-squirrel.looking-cute :as looking-cute]))

(defn init! []
  (println "Being Adorable Initilized!")
  (eating-nuts/init!)
  (looking-cute/init!))
