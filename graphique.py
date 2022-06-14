import matplotlib.pyplot as plt
import matplotlib.image as mpimg
import numpy as np



def afficher_image(image):
    """
    Ce programme permet d'afficher une image

    Paramètres:

        * image(list)=Image sous forme de liste de liste
    """
    plt.imshow(image)
    plt.show()



def afficher_histogramme(histo1, histo2 = None, histo3 = None):
    """
    Ce programme permet d'afficher l'histogramme

    Paramètres:

        * histo1(int)= premier histogramme donné
        * histo2(int)= Deuxième histogramme donné
        * histo3(int)= Troisième histogramme donné
    """
    plt.plot(histo1, color="red", linewidth = 2.5)
    if histo2 is not None:
        plt.plot(histo2, color = "green", linewidth = 2.5)
    if histo3 is not None:
        plt.plot(histo3, color = "blue", linewidth = 2.5)
    plt.show()


