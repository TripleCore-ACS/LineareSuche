package org.lineareSuche.groovy

class LineareSuche {
    boolean lineareSuche(w, L) {
        int i = 0
        while (i < L.size()) {
            if (L[i] == w) return true
            i++
        }
        return false
    }

    static void main(String[] args) {
        //println "Hello world!"
        List<Integer> L = [1, 5, 7, 23, 44, 234]

        int w = 44

        boolean result = new LineareSuche().lineareSuche(w, L)

        println(result)

    }
}