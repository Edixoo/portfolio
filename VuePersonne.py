from PyQt6.QtCore import pyqtSignal, QDate
from PyQt6.QtWidgets import QApplication
import sys
from PyQt6.QtWidgets import QWidget, QComboBox, QLineEdit, QDateEdit, QTextEdit, QHBoxLayout, QVBoxLayout, QLabel
import datetime, genre as g
import personne

# ----------------------------------------------------
# --- class VuePersonne
# ----------------------------------------------------


class VuePersonne(QWidget):
    # signal
    personneChanged : pyqtSignal = pyqtSignal(dict)

    # constructor
    def __init__(self):

        super().__init__()

        self.setWindowTitle("gnrjugbzhfvt")
        self.boxprinc=QVBoxLayout()
        self.boxident=QHBoxLayout()
        self.boxdate=QHBoxLayout()
        self.boxbouton=QHBoxLayout()
    
        
        self.genre : QComboBox = QComboBox()
        self.genre.addItems(["M. ", "Mme ", "_ "])
        self.prenom : QLineEdit = QLineEdit("Prénom")
        self.nom : QLineEdit = QLineEdit("Nom")
        self.dateNaissance : QDateEdit = QDateEdit()
        self.dateNaissance.setDateRange(QDate(1,1,1),QDate.currentDate())
        self.dateMort : QDateEdit = QDateEdit()
        self.dateMort.setDateRange(QDate(1,1,1),QDate.currentDate())
        self.bio : QTextEdit = QTextEdit('"biographie"')

        self.boxident.addWidget(self.genre)
        self.boxident.addWidget(self.prenom)
        self.boxident.addWidget(self.nom)

        self.boxprinc.addLayout(self.boxident)

        self.boxdate.addWidget(QLabel("Né le:"))
        self.boxdate.addWidget(self.dateNaissance)
        self.boxdate.addWidget(QLabel("Mort le:"))
        self.boxdate.addWidget(self.dateMort)
        
        self.boxprinc.addLayout(self.boxdate)

        self.boxprinc.addWidget(self.bio)
        
        self.setLayout(self.boxprinc)
        self.show()


        self.genre.currentIndexChanged.connect(self.changeGenre)
        self.prenom.editingFinished.connect(self.changePrenom)
        self.nom.editingFinished.connect(self.changeNom)
        self.bio.textChanged.connect(self.changeBiographie)
        self.dateNaissance.dateChanged.connect(self.changeNaissance)
        self.dateMort.dateChanged.connect(self.changeMort)


    def updatePersonne(self, prenom: str, nom:str, genre: g.Genre,
    nee: datetime.date, mort: (datetime.date|None),
    bio: str) -> None:

        self.pers=personne.Personne(prenom, nom, genre, nee, mort,bio)


    # Les fonctions des signaux 
    def changeGenre(self) -> None :
        self.personneChanged.emit(self.getAllInfo())

    def changePrenom(self) -> None : 
        self.personneChanged.emit(self.getAllInfo())

    def changeNom(self) -> None :
        self.personneChanged.emit(self.getAllInfo())

    def changeNaissance(self) -> None :
        self.personneChanged.emit(self.getAllInfo())

    def changeMort(self) -> None : 
        self.personneChanged.emit(self.getAllInfo())

    def changeBiographie(self) -> None : 
        self.personneChanged.emit(self.getAllInfo())
        

    # FIN Les fonctions des signaux 

    def getAllInfo(self) -> dict:
        dico={}
        dico["prenom"]=self.prenom.text()
        dico["nom"]=self.nom.text()
        dico["genre"]=self.genre.currentText()
        dico["Date de naissance"]=self.dateNaissance.text()
        dico["Date de mort"]=self.dateMort.text()
        dico["Bio"]=self.bio.toPlainText()
        return dico



if __name__=='__main__':
    print(f' --- main --- ')
    # création d'une QApplication
    app = QApplication(sys.argv)
    # creation d'un widget
    def printDico(val): print(val)
    f = VuePersonne()
    f.personneChanged.connect(printDico)
    # lancement de l'application
    sys.exit(app.exec())
