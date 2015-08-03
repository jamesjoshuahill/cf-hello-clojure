(ns cf-hello-clojure.core
  (:use [ring.adapter.jetty :only [run-jetty]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello Cloud Foundry from heroku-buildpack-clojure!"})

(defn -main [port]
  (run-jetty handler {:port (Integer. port)}))
