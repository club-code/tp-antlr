# Analyseur syntaxique - Antlr4

Veuillez tout d'abord suivre la formation sur les compilateurs première partie avant de lire la suite.

## TP 1

Architecture des dossiers :
- src/
    - main/
        - antlr/
            - ExcaliburLexer.g4 - analyseur lexicale
            - ExcaliburParser.g4 - analyseur syntaxique
        - java/
            - Main.java - Entrée du programme principal en java
        - kotlin/
            - Main.kt - Entrée du programme principal en kotlin

### Compréhension

#### Analyse lexicale

On va d'abord s'intéresser aux analyseurs lexicaux, c'est-à-dire à la création des jetons.
Essayez de comprendre quels sont ces jetons.

#### Analyse syntaxique

Pour l'analyse syntaxique, quels sont les langages reconnus par cette description ?
s
### A vous de jouer

Notre but est de réaliser un langage proche de la syntaxe de Kotlin sans typage.

```kotlin
b = 3
fun allo(a) {
    if (b > 2) {
        c = a + 1
    } else {
        c = 2 * a
    }
    return c * 2
}
```

#### Analyse lexicale

On va d'abord définir le mot clef `fun`, `if`, `else` et `return`, considérant les nombres entiers et les opérations de comparaisons, attribution.

#### Analyse syntaxique


