from PyQt6.QtWidgets import QWidget
from PyQt6.QtWidgets import QVBoxLayout
from PyQt6.QtWidgets import  QPushButton, QCheckBox, QFormLayout, QGroupBox, QScrollArea
from PyQt6.QtCore import pyqtSignal


class Studio(QWidget):

    filtrerChanged: pyqtSignal=pyqtSignal()

    def __init__(self, distrib):
        super().__init__()

        #Initialisation
        self.layoutprinc: QVBoxLayout=QVBoxLayout(); self.setLayout(self.layoutprinc)

        #Select/Deselect boutons
        self.selectall: QPushButton=QPushButton("Select All"); self.layoutprinc.addWidget(self.selectall)
        self.deselectall: QPushButton=QPushButton("Deselect All"); self.layoutprinc.addWidget(self.deselectall)



        self.boutonList= []
        self.studiolayout: QFormLayout=QFormLayout()
        self.groupbox: QGroupBox=QGroupBox("Distributeurs:")

        for index,i in enumerate(distrib):
            self.boutonList.append(QCheckBox(i))
            self.studiolayout.addRow(self.boutonList[index])

        self.groupbox.setLayout(self.studiolayout)
        self.scroll: QScrollArea=QScrollArea()
        self.scroll.setWidget(self.groupbox)

        self.layoutprinc.addWidget(self.scroll)

        self.filtrer: QPushButton=QPushButton("Filtrer")

        self.layoutprinc.addWidget(self.filtrer)
        self.show()

        self.selectall.clicked.connect(self.selectallaction)
        self.deselectall.clicked.connect(self.deselectallaction)
        self.filtrer.clicked.connect(self.filtreraction)
    
    def selectallaction(self):
        for i in self.boutonList:
            i.setChecked(True)

    def deselectallaction(self):
        for i in self.boutonList:
            i.setChecked(False)

    def filtreraction(self):
        self.filtrerChanged.emit()

class Genres(QWidget):

    filtrerChanged: pyqtSignal=pyqtSignal()

    def __init__(self, genres):
        super().__init__()

        #Initialisation
        self.layoutprinc: QVBoxLayout=QVBoxLayout(); self.setLayout(self.layoutprinc)

        #Select/Deselect boutons
        self.selectall: QPushButton=QPushButton("Select All"); self.layoutprinc.addWidget(self.selectall)
        self.deselectall: QPushButton=QPushButton("Deselect All"); self.layoutprinc.addWidget(self.deselectall)



        self.boutonList= []
        self.genreslayout: QFormLayout=QFormLayout()
        self.groupbox: QGroupBox=QGroupBox("Genres:")

        for index,i in enumerate(genres):
            self.boutonList.append(QCheckBox(i))
            self.genreslayout.addRow(self.boutonList[index])

        self.groupbox.setLayout(self.genreslayout)
        self.scroll: QScrollArea=QScrollArea()
        self.scroll.setWidget(self.groupbox)

        self.layoutprinc.addWidget(self.scroll)

        self.filtrer: QPushButton=QPushButton("Filtrer")

        self.layoutprinc.addWidget(self.filtrer)
        self.show()

        self.selectall.clicked.connect(self.selectallaction)
        self.deselectall.clicked.connect(self.deselectallaction)
        self.filtrer.clicked.connect(self.filtreraction)
    
    def selectallaction(self):
        for i in self.boutonList:
            i.setChecked(True)

    def deselectallaction(self):
        for i in self.boutonList:
            i.setChecked(False)

    def filtreraction(self):
        self.filtrerChanged.emit()

class License(QWidget):

    filtrerChanged: pyqtSignal=pyqtSignal()

    def __init__(self, licence):
        super().__init__()

        #Initialisation
        self.layoutprinc: QVBoxLayout=QVBoxLayout(); self.setLayout(self.layoutprinc)

        #Select/Deselect boutons
        self.selectall: QPushButton=QPushButton("Select All"); self.layoutprinc.addWidget(self.selectall)
        self.deselectall: QPushButton=QPushButton("Deselect All"); self.layoutprinc.addWidget(self.deselectall)



        self.boutonList= []
        self.licenselayout: QFormLayout=QFormLayout()
        self.groupbox: QGroupBox=QGroupBox("Licenses:")

        for index,i in enumerate(licence):
            self.boutonList.append(QCheckBox(i))
            self.licenselayout.addRow(self.boutonList[index])

        self.groupbox.setLayout(self.licenselayout)
        self.scroll: QScrollArea=QScrollArea()
        self.scroll.setWidget(self.groupbox)

        self.layoutprinc.addWidget(self.scroll)

        self.filtrer: QPushButton=QPushButton("Filtrer")

        self.layoutprinc.addWidget(self.filtrer)
        self.show()

        self.selectall.clicked.connect(self.selectallaction)
        self.deselectall.clicked.connect(self.deselectallaction)
        self.filtrer.clicked.connect(self.filtreraction)
    
    def selectallaction(self):
        for i in self.boutonList:
            i.setChecked(True)

    def deselectallaction(self):
        for i in self.boutonList:
            i.setChecked(False)

    def filtreraction(self):
        self.filtrerChanged.emit()


if __name__ == "__main__" :
    import sys
    from PyQt6.QtWidgets import QApplication
    import json

    f=open("./data/Highest_Holywood_Grossing_Movies.json")
    data=json.load(f)

    app=QApplication(sys.argv)
    studio=Studio(data["distributors"])
    genres=Genres(data["genres"])
    license=License(data["licenses"])
    sys.exit(app.exec())