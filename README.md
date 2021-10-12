# TP00_Java
Considérer les règles métiers suivantes : 
Tous les points doivent avoir une abscisse (x) et une ordonnée (y) supérieure ou égale à zéro
-	Le déplacement d’un point (ou de la forme dont il est l’origine) consiste à changer son abscisse et son ordonnée ;
-	La translation d’un point (ou de la forme géométrique dont il est l’origine) consiste à le glisser sur le plan selon les valeurs données c’est-à-dire que son abscisse et son ordonnée seront incrémentées ou décrémentées de valeurs des arguments ;
-	Un point égale un autre point, s’ils possèdent la même abscisse et la même ordonnée ;
-	Toutes les formes géométriques ont une origine, un nom et une superficie. Cette dernière varie selon le type de la forme ; 
-	Une forme géométrique égale une autre forme, si elles possèdent la même superficie ;
-	Le tri des formes géométrique se fait selon leurs superficies ;
-	Un triangle isocèle est un triangle dont deux côté sont égaux. Le troisième côté est appelé la base ;
-	Un triangle équilatéral est un triangle dont tous les côtés sont égaux ;

# Activités : 
Tout d’abord, commencer par lire sur le lien : jmdoudoux.fr/java/dej/chap-normes-dev.htm les conventions de nommage Java afin de normaliser le code pour les autres développeurs
Créer un projet Java et implémenter le diagramme de classe ci-dessus en prenant en compte les points suivants :
-	Le code doit contenir toutes les classes, les attributs et les méthodes du diagramme ;
-	Utilisation des trois (3) principes de l’orienté-objet ;
-	Documentation de toutes les classes développées ;
-	Redéfinition de la méthode « equals » pour les classes « Point » et « FormeGeometrique » ;
-	Redéfinition de la méthode « toString » pour toutes les classes non abstraites ;
-	Exemple d’utilisation du mot « this » avec un attribut et un constructeur ; (mettre une explication en commentaire)
-	Exemple d’utilisation du mot « super » avec une méthode et un constructeur ; (mettre une explication en commentaire)
-	La classe cube ne peut pas être héritée par une autre classe ;
-	La méthode volume ne peut pas être redéfinie par les classes filles ;
-	 Définition d’une variable globale « épaisseur » de type entier qui indiquera l’épaisseur du trait des différente formes géométriques ;
-	Définition d’une fonction permettant de doubler (multiplier fois 2) l’épaisseur des différentes formes géométriques
