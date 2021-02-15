(ns acme-corp.red-squirrel.ui
  (:require [acme-corp.red-squirrel.routing :as routing]
            [acme-corp.red-squirrel.rendering :as rendering]))

(defn init! []
  (println "UI Initilized!")
  (routing/init!)
  (rendering/init!))
