(defproject com.nedap.staffing-solutions/consul-clojure "0.7.4"
  :description "A Consul client for Clojure applications."
  :url "http://github.com/bpoweski/consul-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"snapshots" {:url "https://nedap.jfrog.io/nedap/staffing-solutions/"
                              :username :env/artifactory_user
                              :password :env/artifactory_pass}
                 "releases" {:url "https://nedap.jfrog.io/nedap/staffing-solutions/"
                             :username :env/artifactory_user
                             :password :env/artifactory_pass}}
  :dependencies [[camel-snake-kebab "0.4.1" :exclusions [org.clojure/clojure com.keminglabs/cljx]]
                 [cheshire "5.10.0"]
                 [clj-http-lite "0.3.0" :exclusions [org.clojure/clojure]]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.0"]
                                  [org.clojure/core.async "1.1.587"]]}})
