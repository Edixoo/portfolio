# Implémentation des dates et calendriers
# Implémentation des tests (voir main en fin de fichier)

from typing import Dict, List, Tuple, NoReturn



# =============================================================================
def est_bissextile(annee: int) -> bool :
    """
    retourne vrai si l'année est bissextile

    >>> est_bissextile(2020)
    True
    >>> est_bissextile(2021)
    False
    >>> est_bissextile(2022)
    False
    >>> est_bissextile(1900)
    False
    >>> est_bissextile(2000)
    True
    """ 
    if ((annee%4)==0 and(annee%100)!=0) or (annee%400)==0: #Test qui permet de vérifier si l'année est bissextile
        return True
    else:
        return False

    
# =============================================================================
def cree_date(j: int, m: int, a: int) -> Dict :
    """
    Crée une date à partir des entiers la décrivant.
    Si l'un des paramètres n'est pas un entier, la fonction retournera None

    >>> cree_date(15,12,2020)
    {'jour': 15, 'mois': 12, 'annee': 2020}
    >>> cree_date(1.5,12,2020)

    """
    date= {}
    if j%1 == 0 and m%1 ==0 and a%1 == 0: #Test pour vérifier la date donné est bien un entier
        date['jour']=j
        date['mois']=m 
        date['annee']=a
        return date

    
# =============================================================================
def copie_date(date: Dict) -> Dict :
    """
    copie la date passée en paramètre

    >>> copie_date({'jour': 15, 'mois': 12, 'annee': 2020})
    {'jour': 15, 'mois': 12, 'annee': 2020}
    """
    return cree_date(date['jour'],date['mois'],date['annee'])

    
# =============================================================================
def compare(d1: Dict, d2: Dict) -> int :
    """
    Permet de classer deux dates.
    Retourne
    -1 si la date d1 < d2
    +1 si la date d1 > d2
    0 si les dates sont identiques
    on considère que les dates sont croissantes 
    dans l'ordre chronologique

    >>> date1 = cree_date(25,12,2021)
    >>> date2 = cree_date(31,12,2021)
    >>> compare(date1,date2)
    -1
    >>> compare(date2,date1)
    1
    >>> compare(date1,date1)
    0
    >>> date1 = cree_date(15,11,2021)
    >>> date2 = cree_date(10,12,2021)
    >>> compare(date1,date2)
    -1
    >>> compare(date2,date1)
    1
    >>> compare(date1,date1)
    0
    """
    if d1['annee']<d2['annee']: # Commencement des test par les années, vérification si l'année 1 est inférieure à l'année 2
        return -1

    if d1['annee']==d2['annee']: # Vérification d'égalité des mois
        if d1['mois']==d2['mois']: # Vérification d'égalité des mois
            if d1['jour']==d2['jour']: # Vérification d'égalité des jours
                return 0
                
            if d1['jour']<d2['jour']: #Vérification si le jour 1 est inférieure au jour 2
                return -1
            if d1['jour']>d2['jour']: # Vérification si le jour 1 est supérieure au jour 2
                return 1

        if d1['mois']<d2['mois']: #Vérification si le mois 1 est inférieure au mois 2
            return -1
        if d1['mois']>d2['mois']: # Vérification si le mois 1 est supérieure au mois 2
            return 1
    if d1['annee']>d2['annee']: # Vérification si l'annee 1 est supérieure à l'année 2
        return 1


# =============================================================================
def valide_simple(d: Dict) -> bool :
    """   
    retourne vrai si la date est valide.
    on supposera que la date est valide si :
    - si le premier (le jour) est un entier compris entre 1 et 31
    - si le second (le mois) est un entier compris entre 1 et 12

    >>> date = cree_date(1, 2, 0)
    >>> valide_simple(date)
    True
    >>> date = cree_date(1.5, 5, 6)
    >>> valide_simple(date)
    False
    >>> date = cree_date(0, 5, 6)
    >>> valide_simple(date)
    False
    >>> date = cree_date(20, 8, 2021)
    >>> valide_simple(date)
    True
    """
    if d!=None:
        if 1<=d['mois']<=12:
            if 1<=d['jour']<=31:
                return True
    return False   

# =============================================================================
def valide_complet(d: Dict) -> bool :
    """ 
    retourne vrai si la date est valide.
    on supposera que la date est valide si :
    - la validation simple est vraie
    - si la date représente une date réelle 

    >>> date = cree_date(15, 1, 2022)
    >>> valide_complet(date)
    True
    >>> date = cree_date(32, 1, 2022)
    >>> valide_complet(date)
    False
    >>> date = cree_date(-1, 1, 2022)
    >>> valide_complet(date)
    False
    >>> date = cree_date(31, 6, 2022)
    >>> valide_complet(date)
    False
    >>> date = cree_date(29, 2, 2020)
    >>> valide_complet(date)
    True
    >>> date = cree_date(29, 2, 2022)
    >>> valide_complet(date)
    False
    """
    if d['mois']==1 or d['mois']==3 or d['mois']==5 or d['mois']==7 or ['mois']==8 or d['mois']==10 or d['mois']==12:
        if valide_simple(d)==True:
            return True
    if d['mois']==4 or d['mois']==6 or d['mois']==9 or d['mois']==11:
        if valide_simple(d)==True:
            if 1<=d['jour']<=30:
                return True
    if d['mois']==2:
        if valide_simple(d)==True:
            if est_bissextile(d['annee']) is True:
                if d['jour']==29:
                    return True
            if 1<=d['jour']<=28:
                return True
    return False

def quel_mois(d: Dict) -> int:
    """
    Retourne quel genre de mois est celui de la date
    """
    valide_complet(d)
    if d['mois']==1 or d['mois']==3 or d['mois']==5 or d['mois']==7 or ['mois']==8 or d['mois']==10 or d['mois']==12:
        jour=31
    if d['mois']==4 or d['mois']==6 or d['mois']==9 or d['mois']==11:
        jour=30
    if d['mois']==2:
            if est_bissextile(d['annee']) is True:
                jour=29
            else:
                jour=28
    return jour

# =============================================================================
"""
def ajoute_calendrier(calendrier: List, date: Dict, description: str ) -> NoReturn :
    '''
    ajoute un élément à la liste du calendrier.
    '''
    événement={}
    i=0
    événement['description']=description
    événement['date']=date
    if calendrier==[]:
        calendrier.append(événement)
    while i < len(calendrier) and compare(date, calendrier[i]['date'])==1:
        i=i+1
        calendrier.insert(i, événement)
"""
def ajoute_calendrier(calendrier: List, date: Dict, description: str ) -> NoReturn :
    '''
    ajoute un élément à la liste du calendrier.
    '''
    evenement={}
    evenement['description']=description
    evenement['date']=date
    calendrier.append(evenement)

# =============================================================================
def affiche_calendrier(calendrier: List) -> NoReturn :
    """
    affiche le calendrier sous forme de liste.
    """
    global lang
    for i in calendrier:
        if lang==0:
            print("Le {}/{}/{} : {}".format(i['date']['jour'],i['date']['mois'],i['date']['annee'],i['description']))
        if lang==1:
            print("The {}/{}/{} : {}".format(i['date']['mois'],i['date']['jour'],i['date']['annee'],i['description']))
