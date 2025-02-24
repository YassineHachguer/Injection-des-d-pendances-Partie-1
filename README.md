# Inversion de Contrôle & Injection des Dépendances

## 1. L'interface IDao
![img.png](images/img.png)

## 2. Implémentation de l'interface IDao
![img_1.png](images/img_1.png)

## 3. L'interface IMetier
![img_2.png](images/img_2.png)

## 4. Implémentation de l'interface IMetier
![img_3.png](images/img_3.png)

## 5. L'Injection des Dépendances

### a. Par instanciation statique
Dans cette approche, Injection des dépendances par instanciation Statique via le setter ou Constructeur
![img_4.png](images/img_4.png)

**Résultat :**
![img_5.png](images/img_5.png)

### b. Par instanciation dynamique
Dans cette approche, Injection des dépendances par instanciation Dynamique en utilisant un fichier de Configuration
![img_6.png](images/img_6.png)

**Fichier de Configuration :**
![img_7.png](images/img_7.png)

**Résultat :**
![img_8.png](images/img_8.png)

### c. En utilisant le Framework Spring
**Version XML :**
![img_9.png](images/img_9.png)

**Fichier de Config XML :**
![img_10.png](images/img_10.png)

**Version Annotations :**
![img_11.png](images/img_11.png)

**Ajout des Annotations nécessaires :**
![img_12.png](images/img_12.png)
![img_13.png](images/img_13.png)