# Analyseur syntaxique - Antlr4

Veuillez tout d'abord suivre la formation sur les compilateurs première partie avant de lire la suite.

## TP 1

Architecture des dossiers :
- src/
    - main/
        - antlr/
            - FirstLexer.g4 - analyseur lexical du premier exercice
            - FirstParser.g4 - analyseur syntaxique du premier exercice
            - SecondLexer.g4 - analyseur lexical du second exercice
            - SecondParser.g4 - analyseur syntaxique du second exercice
        - java/
            - First.java - Entrée du programme principal du premier exercice en java
            - Second.java - Entrée du programme principal du second exercice en java
        - kotlin/
            - First.kt - Entrée du programme principal du premier exercice en kotlin
            - Second.kt - Entrée du programme principal du second exercice en kotlin

### Exercice 1 - Analyse lexicale

On va d'abord s'intéresser aux analyseurs lexicaux, c'est-à-dire à la création des jetons.

On souhaite reconnaître un langage qui est une suite d'expressions arithmétiques, parenthésées sur des nombres entiers. 

Exemple
```kotlin
1 + (2 * 3) - 1
42 - (-69) / 3
```

Le fichier `FirstLexer.g4` est vide, vous devez le remplir avec ces différents jetons.
On remarque que `FirstParser.g4` est déjà rempli, on ne le touchera pas durant cet exercice. Il convient cependant de respecter la nomenclature des différents jetons inclus.
Ce parser reconnaît simplement tous les jetons, sans rien en faire, il nous permet ainsi d'ensuite lister ces différents jetons avec une méthode simple.

Vous pouvez également exécuter le programme Kotlin ou Java avec les commandes respectives `./gradlew runFirstKotlin` et `./gradlew runFirstJava`

### Exercice 2 - Analyse syntaxique

On s'intéresse maintenant à remplir le `SecondParser.g4`, il est cette fois-ci vide et inversement `SecondLexer.g4` est pré-rempli.

Les tâches Gradle sont `./gradlew runSecondKotlin` et `./gradlew runSecondJava`.

### Exercice fil rouge - A vous de jouer

Notre but est de réaliser un langage proche d'une syntaxe classique mais récente, mais pas trop.

```kotlin
b: Int = 3;
fun allo(a: Int) {
    c: Double;
    if (b > 2) {
        c = a + 1.0;
    } else {
        c = 2 * a;
    }
    for (i: Int = 0; i < 10; i++) {
        c = c + 1;
    }
    return c * 2;
}
```

On va d'abord définir le mot clef `fun`, `if`, `else` et `return`, considérant les nombres entiers et les opérations de comparaisons, attribution.
Ainsi que des types obligatoire sur les variables.

On va travailler de manière incrémentale, on va donc démarrer par terminer les expressions avec les opérateurs de comparaisons, puis l'ajout des structures `if` puis `else`.
On se limitera à l'expression de nombres et booléens (Double, Int, Byte, Boolean).

Si vous êtes chauds ce soir, la `for`, c'est rigolo. Et les fonctions encore plus.
